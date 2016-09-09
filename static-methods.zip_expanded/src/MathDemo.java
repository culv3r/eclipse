import java.util.Scanner;

/**
 * A demo of some static methods in the Math class.
 * @author Tom Bylander
 */
public class MathDemo {
	/**
	 * The grand and glorious main method.
	 */
	public static void main(String[] args) {
		// Get a number from the user with some error-checking.
		Scanner stdin = new Scanner(System.in);
		System.out.print("Enter a number: ");
		while (! stdin.hasNextDouble()) {
			String trash = stdin.next();
			System.out.printf("%s is not a number.\n", trash);
			System.out.print("Enter a number: ");
		}
		double number = stdin.nextDouble();
		stdin.close();  // Eclipse likes Scanners to be closed
		
		// Call a few Math methods
		System.out.printf("Math.abs(%s) = %s\n", 
				number, Math.abs(number));
		System.out.printf("Math.ceil(%s) = %s\n",
				number, Math.ceil(number));
		System.out.printf("Math.floor(%s) = %s\n", 
				number, Math.floor(number));
		System.out.printf("Math.sqrt(%s) = %s\n", 
				number, Math.sqrt(number));
		System.out.printf("Math.pow(%s, 2) = %s\n",
				number, Math.pow(number, 2));
		System.out.printf("Math.exp(%s) = %s\n", 
				number, Math.exp(number));
		System.out.printf("Math.log(%s) = %s\n", 
				number, Math.log(number));
	}
}
