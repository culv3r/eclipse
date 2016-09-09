import java.util.Scanner;

/**
 * Test static methods from the MyMath class
 * @author Tom Bylander
 */
public class MyMathTest {
	/**
	 * A main method, public and static and void, too.
	 */
	public static void main(String[] args) {
		// Get two numbers from the user with some error-checking.
		Scanner stdin = new Scanner(System.in);
		System.out.print("Enter two numbers: ");
		while (! stdin.hasNextDouble()) {
			String trash = stdin.next();
			System.out.printf("%s is not a number.\n", trash);
			System.out.print("Enter two numbers: ");
		}
		double number1 = stdin.nextDouble();
		while (! stdin.hasNextDouble()) {
			String trash = stdin.next();
			System.out.printf("%s is not a number.\n", trash);
			System.out.print("Enter a number: ");
		}
		double number2 = stdin.nextDouble();
		stdin.close();  // Eclipse likes Scanners to be closed
		
		// Test static methods from MyMath
		System.out.printf("MyMath.E = %s\n", MyMath.E);
		System.out.printf("MyMath.abs(%s) = %s\n",
				number1, MyMath.abs(number1));
		System.out.printf("MyMath.abs(%s) = %s\n", 
				number2, MyMath.abs(number2));
		System.out.printf("MyMath.floor(%s) = %s\n",
				number1, MyMath.floor(number1));
		System.out.printf("MyMath.floor(%s) = %s\n",
				number2, MyMath.floor(number2));
		System.out.printf("MyMath.max(%s, %s) = %s\n",
				number1, number2, MyMath.max(number1, number2));
	}
}
