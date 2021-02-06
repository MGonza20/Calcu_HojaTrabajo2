import java.util.Scanner;

/**
 * Es la clase principal
 * 
 *
 */

public class MainCalcuPostfixx {
	/**
	 * Ejecuta el código
	 * @param args ejecuta codigo
	 */
	
    public static void main(String[]args) {
        CALCUpostfix prueba = new CALCUpostfix();
        
        //Scanner keys = new Scanner(System.in);
        ReadFile rf = new ReadFile();
        String nombre = "./datos.txt";
        String input = rf.read(nombre);
        
        String s1 = prueba.decifrador(input);
        System.out.println("Resultado: " + prueba.resolver(s1));

        
        
    }
}

