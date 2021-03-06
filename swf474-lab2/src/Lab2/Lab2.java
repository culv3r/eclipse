package Lab2;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * @author Daniel Larsen
 * Lab 2 Java Program is a program that reads in a text file containing strings and
 * ints. It converts each name and following line of grades into a grade object and
 * then goes on to manipulate the data and display it in different methods.
 */
public class Lab2 {

	/**
	 * @param args
	 * The main method creates the static Grades objects, reads in the data, and
	 * sends the data to the testGrades method for evaluation and manipulation.
	 */
	public static void main(String[] args) {
		Grades curGrade = new Grades("Nobody");
		Scanner in = null;
		try {
		    in = new Scanner(new File("data.txt"));
		} catch (FileNotFoundException exception) {
		    System.err.println("failed to open data.txt");
		    System.exit(1);
		}
		
		while (in.hasNext()) {
		    String name = in.next();
		    curGrade.setName(name);
		    
		    while (in.hasNextInt()) {
		        int grade = in.nextInt();
		        curGrade.setGrades(grade);
		        }
		    testGrades(curGrade);
	    	curGrade.setGrades(-1);
		   	}   

	}
	
	/**
	 * @param grades
	 * The testGrades method uses publicly accessible methods to access the private
	 * data contained within the Grades objects and class. Upon successful access
	 * of the data, it prints out the manipulated information below.
	 */
	public static void testGrades(Grades grades) {
	    System.out.println(grades.toString()); 
	    System.out.printf("\tName:    %s\n", grades.getName());
	    System.out.printf("\tLength:  %d\n", grades.length());
	    System.out.printf("\tAverage: %.2f\n", grades.average());
	    System.out.printf("\tMedian:  %.1f\n", grades.median());
	    System.out.printf("\tMaximum: %d\n", grades.maximum());
	    System.out.printf("\tMininum: %d\n", grades.minimum());
	}

}
