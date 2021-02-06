import java.io.File;  // Import the File class
import java.io.FileNotFoundException;// Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

/**
 * Lee el archivo
 * @author Sayra Estefania
 *
 */
public  class ReadFile{
	
	/**
	 * Lee el archivo
	 * @param filename el nombre del archivo
	 * @return el contenido
	 */
	public String read(String filename) {
		try {
		      File myObj = new File(filename);
		      Scanner myReader = new Scanner(myObj);  
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        System.out.println(data);
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		return filename; 
	}
}