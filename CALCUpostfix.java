import java.util.ArrayList;

public class CALCUpostfix implements Icalculadora {
    private CalcuList<String> data;
    private CalcuList<Integer> ints;

    public CALCUpostfix() {
        data = new CalcuList<String>();
        ints = new CalcuList<Integer>();
    }

/*
    public void enterData(String num){
        data.push(num);
    }
*/

    /*
    public boolean IsItAdigit(char digito){
        return (digito >= '0' && digito <= '9');
    }

    public boolean IsItAnOperator(char op){
        return (op == '+' || op == '-' || op == '*' || op == '/' || op == '(' || op == ')');
    }
    */
    
    /*
    public int getProcedencia(char pro){
        switch(pro){
            case '+':
            case '-': return 1;
            case '*':
            case '/': return 2;
            case '(':
            case ')': return 3;
            default:
                return -1;
        }
    }
     */


    //Evaluar una operación aritmética
    @Override
    public double resolver (String input){

        int val1 = 0;
        int val2 = 0;

        char charcacters[] = input.toCharArray();
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
