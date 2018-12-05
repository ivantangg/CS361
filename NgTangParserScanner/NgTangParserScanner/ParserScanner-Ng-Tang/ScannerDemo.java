import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
/**
 * @author Christelle
 * 
 */
public class ScannerDemo {

	private static String file1 = "C:\\Users\\ASD\\Desktop\\prog1.jay";
	
	private static int counter = 1;

	public static void main(String args[]) throws IOException {
		
		BufferedReader input = new BufferedReader(new FileReader(file1)); 
		TokenStream ts = new TokenStream(file1);

		/*while (input.ready()) {
		String text = input.readLine();
		System.out.println(text); } */

		Token t;
		while(!ts.isEndofFile()) {
			t = ts.nextToken();
			t.toString();
			System.out.println("Token " + counter + " - "  + "Type: " + t.getType() + " - " + "Value: " + t.getValue());
			counter = counter + 1;
			
		}
	}
}