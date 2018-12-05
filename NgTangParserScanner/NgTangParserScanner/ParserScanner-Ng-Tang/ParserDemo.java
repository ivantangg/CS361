import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ParserDemo {

	private static String file1 = "C:\\Users\\ASD\\Desktop\\prog2.jay";
	
	public static void main(String args[]) throws IOException  {
		
		
		TokenStream tStream = new TokenStream(file1);
		
		ConcreteSyntax cSyntax = new ConcreteSyntax(tStream);
		Program p = cSyntax.program();
		System.out.println(p.display());
	} 

}