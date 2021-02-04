import java.util.Scanner;

public class MainCalcuPostfix {

    public static void main(String[] args) {
        CALCUpostfix prueba = new CALCUpostfix();
        Scanner keys = new Scanner(System.in);
        String input = keys.nextLine();

        prueba.resolver(input);

    }
}
