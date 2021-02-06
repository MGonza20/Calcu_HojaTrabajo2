import java.util.Scanner;
/**
 * Es la clase principal main
 * 
 *
 */

public class MainCalcuPostfix {

	/**
	 * ejecuta el código
	 * @param args ejecuta codigo
	 */
    public static void main(String[] args) {

        CALCUpostfix prueba = new CALCUpostfix();

        Scanner keys = new Scanner(System.in);

        System.out.println("Ingrese dato: ");
        String input = keys.nextLine();

        String s1 = prueba.decifrador(input);
        System.out.println("Resultado: " + prueba.resolver(s1));

    }
}
