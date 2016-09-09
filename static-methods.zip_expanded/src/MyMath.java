/**
 * MyMath contains a class constant and several static methods that
 * should produce the same results as the Math class.
 * 
 * @author Tom Bylander
 */
public class MyMath {
	/**
	 * An approximation of e, the base of the natural logarithms.
	 */
	public static final double E = 2.718281828459045;
	
	/**
	 * Returns the absolute value of the parameter.
	 * @param a any double
	 * @return the absolute value of a
	 */
	public static double abs(double a) {
		if (a < 0) {
			return -a;
		}
		return a;
	}
	
	/**
	 * Return the floor of the parameter.
	 * @param a a double
	 * @return the floor of the parameter.
	 */
	public static double floor(double a) {
		if (a % 1 == 0) {   // a % 1 is the fractional part of a
			return a;
		} else if (a > 0) {
			return a - (a % 1);
		} else {
			return a - (a % 1) - 1;
		}
	}
	
	/**
	 * Returns the maximum of the two parameters.
	 * @param a a double
	 * @param b another double
	 * @return the maximum of the two parameters.
	 */
	public static double max(double a, double b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}
}
