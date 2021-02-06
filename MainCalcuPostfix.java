import java.util.Scanner;

public class MainCalcuPostfix {

    public static void main(String[] args) {
        CALCUpostfix prueba = new CALCUpostfix();

        Scanner keys = new Scanner(System.in);

        System.out.println("Ingrese dato: ");
        String input = keys.nextLine();

        String s1 = prueba.decifrador(input);
        System.out.println(prueba.resolver(s1));

    }
}
