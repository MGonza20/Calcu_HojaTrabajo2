import java.util.ArrayList;

public class CALCUpostfix implements Icalculadora {
    private CalcuList<Integer> ints;
    private CalcuList<Character> chars;

    public CALCUpostfix() {
        ints = new CalcuList<Integer>();
        chars = new CalcuList<Character>();
    }


    public int getProcedencia(char charrr){
        if (charrr == '+' || charrr == '-'){
            return 1;
        }else {
            return 2;
        }
    }

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



    //Evaluar una operación aritmética
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
