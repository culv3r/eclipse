package test;

import static org.junit.Assert.*;

import java.util.NoSuchElementException;

import org.junit.Test;
import Lab2.Grades;


/**
 * @author culv3r
 *
 *	This tests the functions of average, median, and minimum in the Grades class.
 */
public class TestGrades {

	/**
	 * This tests four different categories: An object with no grades, An object with 21 grades,
	 * an object with one "zero" grade, and an object with four grades. It should compute the averages.
	 */
	@Test
	public final void testAverage() {
		Grades simple = new Grades("simple");
		Grades complex = new Grades("complex");
		Grades empty = new Grades("empty");
		Grades even = new Grades("even");
		simple.setGrades(0);
		complex.setGrades(5);
		complex.setGrades(10);
		complex.setGrades(15);
		complex.setGrades(20);
		complex.setGrades(25);
		complex.setGrades(30);
		complex.setGrades(35);
		complex.setGrades(40);
		complex.setGrades(45);
		complex.setGrades(50);
		complex.setGrades(55);
		complex.setGrades(60);
		complex.setGrades(65);
		complex.setGrades(70);
		complex.setGrades(75);
		complex.setGrades(80);
		complex.setGrades(85);
		complex.setGrades(88);
		complex.setGrades(90);
		complex.setGrades(95);
		complex.setGrades(100);
		even.setGrades(25);
		even.setGrades(50);
		even.setGrades(75);
		even.setGrades(100);
		assertTrue("Zero divided by 1 should be Zero", (0==simple.average()));
		assertTrue("Average should equal 54.19047619047619", (54.19047619047619==complex.average()));
		assertTrue("Average should equal 62.5", (62.5==even.average()));
		assertTrue("No Elements should equal -99999", (empty.average()==-99999));
		//fail("Not yet implemented"); // TODO
	}

	/**
	 * This test takes the same criteria as in the testAverage() test and uses it in the case of finding
	 * the median. The simple class should return a median of 0, the complex class (which is odd) should
	 * return a value of 55, the empty should return -99999, and finally the even should use the other
	 * part of the conditional method and return 62.5
	 */
	@Test
	public final void testMedian() {
		Grades simple = new Grades("simple");
		Grades complex = new Grades("complex");
		Grades empty = new Grades("empty");
		Grades even = new Grades("even");
		simple.setGrades(0);
		complex.setGrades(5);
		complex.setGrades(10);
		complex.setGrades(15);
		complex.setGrades(20);
		complex.setGrades(25);
		complex.setGrades(30);
		complex.setGrades(35);
		complex.setGrades(40);
		complex.setGrades(45);
		complex.setGrades(50);
		complex.setGrades(55);
		complex.setGrades(60);
		complex.setGrades(65);
		complex.setGrades(70);
		complex.setGrades(75);
		complex.setGrades(80);
		complex.setGrades(85);
		complex.setGrades(88);
		complex.setGrades(90);
		complex.setGrades(95);
		complex.setGrades(100);
		even.setGrades(25);
		even.setGrades(50);
		even.setGrades(75);
		even.setGrades(100);
		assertTrue("Median should be 55", (55==complex.median()));
		assertTrue("Median should be 62.5", (62.5==even.median()));
		assertTrue("Median should be 0", (0==simple.median()));
        assertTrue("should be -99999", (empty.median()==-99999));
		//fail("Not yet implemented"); // TODO
	}

	/**
	 * This last test verifies that minimum values are being returned properly. For the simple object,
	 * it should return 0. For the complex object, it should return 5. for the Empty object, it should
	 * throw an exception, and finally the even should return a value of 25.
	 */
	@Test
	public final void testMinimum() {
		Grades simple = new Grades("simple");
		Grades complex = new Grades("complex");
		Grades empty = new Grades("empty");
		Grades even = new Grades("even");
		simple.setGrades(0);
		complex.setGrades(5);
		complex.setGrades(10);
		complex.setGrades(15);
		complex.setGrades(20);
		complex.setGrades(25);
		complex.setGrades(30);
		complex.setGrades(35);
		complex.setGrades(40);
		complex.setGrades(45);
		complex.setGrades(50);
		complex.setGrades(55);
		complex.setGrades(60);
		complex.setGrades(65);
		complex.setGrades(70);
		complex.setGrades(75);
		complex.setGrades(80);
		complex.setGrades(85);
		complex.setGrades(88);
		complex.setGrades(90);
		complex.setGrades(95);
		complex.setGrades(100);
		even.setGrades(25);
		even.setGrades(50);
		even.setGrades(75);
		even.setGrades(100);
		assertTrue("must equal 0",(simple.minimum()==0));
		assertTrue("must equal 5",(complex.minimum()==5));
		assertTrue("must equal 25",(even.minimum()==25));
		boolean nullError = false;
        try {
            empty.minimum();
        } catch (NoSuchElementException e) {
            nullError = true;
        }
        assertTrue("should be a NullPointerException", nullError);
		//fail("Not yet implemented"); // TODO
	}

}
