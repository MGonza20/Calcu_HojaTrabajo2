import java.util.ArrayList;

/**
 * 
 * @author Sara Paguaga
 *
 *Esta clase implementa a la interfaz Icalculadora, tiene los métodos que descifran y hacen operaciones en el
 *stack
 *
 */
public class CALCUpostfix implements Icalculadora {
    private CalcuList<Integer> ints;
    private CalcuList<Character> chars;

    /**
     * Tiene inicializadas las variables de las arraylists
     */
    public CALCUpostfix() {
        ints = new CalcuList<Integer>();
        chars = new CalcuList<Character>();
    }

    /**
     * Identifica la procedencia o que es el char si un + o -
     * @param charrr es el caracter
     * @return devuelve 1 o 2 dependiendo de si es un + o -
     */
    public int getProcedencia(char charrr){
        if (charrr == '+' || charrr == '-'){
            return 1;
        }else {
            return 2;
        }
    }

    /**
     * Va separando la expresión en caracteres y con las condiciones va identificando, también si está vacio
     * @param s es la expresion que se quiere descifrar
     * @return la expresión postfix
     */
    public String decifrador(String s){
        String postfixExp = "";
        char miniChars[] = s.toCharArray();

        for (char op: miniChars){
            if (op != '+' || op != '-' || op != '*' || op != '/' || op != '(' || op != ')'){
                postfixExp = postfixExp + op;
            } else if(op == '('){
                chars.push(op);
            }else if(op == ')'){
                while (!chars.empty()){
                    char miniChar = chars.pop();
                    if(miniChar != '('){
                    postfixExp = postfixExp + op;
                }else{
                    break;
                }
            }
        } else if (op == '+' || op == '-' || op == '*' || op == '/' ){
                if(chars.empty()){
                    chars.push(op);
                }else {
                    while (!chars.empty()){
                        char oPP = chars.pop();
                        if(oPP == '('){
                            chars.push(oPP);
                            break;
                        }else if(oPP == '+' || oPP == '-' || oPP == '*' || oPP == '/'){
                            if(getProcedencia(oPP) < getProcedencia(op)){
                                chars.push(oPP);
                                break;
                            }else {
                                postfixExp = postfixExp + oPP;
                            }
                        }
                    }
                    chars.push(op);
                    }
                }
            }
        while (!chars.empty()){
            postfixExp = postfixExp + chars.pop();
        }
        return postfixExp;
    }



    /**
     * Evalua la expresión aritmética
     */
    @Override
    public double resolver (String input){

        int val1 = 0, val2 = 0;
        char charcacters[] = input.replace(" ", "").toCharArray();

        for(char op: charcacters){
            if(op >= '0' && op <= '9') {
                ints.push((int) (op - '0'));
            } else {
                val2 = ints.pop();
                val1 = ints.pop();
                switch (op) {
                    case '+':
                        ints.push(val1 + val2);
                        break;
                    case '-':
                        ints.push(val1 - val2);
                        break;
                    case '*':
                        ints.push(val1 * val2);
                        break;
                    case '/':
                        ints.push(val1 / val2);
                        break;
                }
            }
        }
        return ints.pop();
    }


}
