import java.util.Scanner;

/**
 * Fig. 16.15: StaticCharMethods.java (slightly modified) <br>
 * Character static methods for testing characters and converting case.
 * 
 * author Deitel & Associates, Inc.
 * author Tom Bylander
 */
public class StaticCharMethods {
	/**
	 * Modified so that space or tab or newline can be the char.
	 */
	public static void main( String[] args ) {
		Scanner scanner = new Scanner( System.in ); // create scanner
		System.out.println( "Enter a character and press Enter" );
		String input = scanner.nextLine();
		scanner.close();  // Eclipse likes Scanners to be closed
		char c = '\n';   // use if user enters nothing
		if (input.length() > 0) {
			c = input.charAt(0); // get input character
		}

		// display character info
		System.out.printf( "corresponds to int: %d\n", (int) c );
		System.out.printf( "is defined: %b\n", Character.isDefined( c ) );
		System.out.printf( "is digit: %b\n", Character.isDigit( c ) );
		System.out.printf( "is first character in a Java identifier: %b\n",
				Character.isJavaIdentifierStart( c ) );
		System.out.printf( "is part of a Java identifier: %b\n",
				Character.isJavaIdentifierPart( c ) );
		System.out.printf( "is letter: %b\n", Character.isLetter( c ) );
		System.out.printf( 
				"is letter or digit: %b\n", Character.isLetterOrDigit( c ) );
		System.out.printf(
				"is lower case: %b\n", Character.isLowerCase( c ) );
		System.out.printf( 
				"is upper case: %b\n", Character.isUpperCase( c ) );
		System.out.printf( 
				"to upper case: %s\n", Character.toUpperCase( c ) );
		System.out.printf( 
				"to lower case: %s\n", Character.toLowerCase( c ) );
	} // end main
} // end class StaticCharMethods

