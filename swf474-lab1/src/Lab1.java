import java.util.Scanner;
import java.io.File;
import java.text.DecimalFormat;

/**
 * @author culv3r
 * Lab1 accepts input from a file "data.txt" and reads in
 * the values as tokens. As the tokens are read, they are
 * determined whether or not they are in fact numbers. It
 * then counts the numbers, the number of non-number tokens
 * and sums the numbers, printing them out.
 * 
 * Note: I required the import of the DecimalFormat helper
 * to remove extraneous characters from the print out.
 */
public class Lab1 {

	/**
	 * @param args
	 * The main method handles all aspects of this simple
	 * program.
	 */
	public static void main(String[] args) {
		//Variables
		int iNumCount = 0;
		int iSzCount = 0;
		double dSum = 0.0;
		
		//Decimal Formatting to Match Example Output
		DecimalFormat df = new DecimalFormat("#.#");
		
		Scanner console = null;
		try {
		    console = new Scanner(new File("data.txt"));
		} catch (Exception FileNotFoundException) {
		    System.err.println("failed to open data.txt");
		    System.exit(1);
		}
		
		while(console.hasNext())
		{
			String szToken = console.next();
			try {
			    double d = Double.parseDouble(szToken);
			    //System.out.println("It's a double!");
			    iNumCount++;
			    dSum += d;
			} catch (NumberFormatException e) {
			    //System.out.println("It's not a double!");
			    iSzCount++;
			    
			}
		}
		
		console.close();
		System.out.print(iNumCount + " ");
		System.out.print(iSzCount + " ");
		System.out.println(df.format(dSum));
		

	}

}
