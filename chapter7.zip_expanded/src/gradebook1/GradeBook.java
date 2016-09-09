package gradebook1;
import java.util.*; // will be using Scanner and Arrays

/**
 * Fig. 7.14plus: GradeBook.java <br>
 * GradeBook class using an array to store test grades.
 * This includes a method for reading grades into an array.
 * 
 * @author Deitel & Associates, Inc.
 * @author Tom Bylander
 */
public class GradeBook {
	private String courseName; // name of course this GradeBook represents
	private int[] grades; // array of student grades

	/**
	 * Two-argument constructor initializes courseName and grades array.
	 * 
	 * @param name The name of the course.
	 * @param gradesArray The grades in the course.
	 */
	public GradeBook(String name, int[] gradesArray) {
		courseName = name; // initialize courseName
		grades = gradesArray; // store grades
	} // end two-argument GradeBook constructor

	/**
	 * One-argument constructor initializes courseName.
	 * The grades array is null.
	 * 
	 * @param name The name of the course.
	 */
	public GradeBook(String name) {
		courseName = name; // initialize courseName
	} // end one-argument GradeBook constructor

	/**
	 * Method to set the course name.
	 * 
	 * @param The name of the course.
	 */
	public void setCourseName(String name) {
		courseName = name; // store the course name
	} // end method setCourseName

	/**
	 * Method to retrieve the course name.
	 * 
	 * @return the name of the course.
	 */
	public String getCourseName() {
		return courseName;
	} // end method getCourseName

	/**
	 * Perform various operations on the data.
	 */
	public void processGrades() {
		// output grades array
		outputGrades();

		// call method getAverage to calculate the average grade      
		System.out.printf( "\nClass average is %.2f\n", getAverage() ); 

		// call methods getMinimum and getMaximum
		System.out.printf( "Lowest grade is %d\nHighest grade is %d\n\n",
				getMinimum(), getMaximum() );

		// call outputBarChart to print grade distribution chart
		outputBarChart();
	} // end method processGrades

	/**
	 * Find minimum grade.
	 * 
	 * @return the minimun grade.
	 */
	public int getMinimum() { 
		int lowGrade = grades[0]; // assume grades[0] is smallest

		// loop through grades array, for loop
		for (int index = 0; index < grades.length; index++) {
			int grade = grades[index]; // get grade at index
			// if grade lower than lowGrade, assign it to lowGrade
			if (grade < lowGrade)
				lowGrade = grade; // new lowest grade
		} // end for

		return lowGrade; // return lowest grade
	} // end method getMinimum

	/**
	 * Find maximum grade.
	 * 
	 * @return the maximun grade.
	 */
	public int getMaximum() { 
		int highGrade = grades[0]; // assume grades[0] is largest

		// loop through grades array, for-each loop
		for (int grade : grades) {
			// if grade greater than highGrade, assign it to highGrade
			if (grade > highGrade)
				highGrade = grade; // new highest grade
		} // end for

		return highGrade; // return highest grade
	} // end method getMaximum

	/**
	 * Determine average grade for test.
	 * 
	 * @return the average of the grades.
	 */
	public double getAverage() 	{      
		int total = 0; // initialize total

		// sum grades for one student, while loop
		int index = 0;
		while (index < grades.length) {
			int grade = grades[index];  // get grade at index
			total += grade;
			index++;                    // need to increment
		}

		// return average of grades
		return (double) total / grades.length;
	} // end method getAverage

	/**
	 * Output bar chart displaying grade distribution.
	 */
	public void outputBarChart() {
		System.out.println( "Grade distribution:" );

		// stores frequency of grades in each range of 10 grades
		int[] frequency = new int[11];

		// for each grade, increment the appropriate frequency 
		for (int grade : grades)
			++frequency[grade / 10];

		// for each grade frequency, print bar in chart
		for (int count = 0; count < frequency.length; count++) {
			// output bar label ( "00-09: ", ..., "90-99: ", "100: " )
			if (count == 10)
				System.out.printf("%5d: ", 100); 
			else
				System.out.printf("%02d-%02d: ", 
						count * 10, count * 10 + 9); 

			// print bar of asterisks
			for (int stars = 0; stars < frequency[count]; stars++)
				System.out.print("*");

			System.out.println(); // start a new line of output
		} // end outer for
	} // end method outputBarChart

	/**
	 * Output the contents of the grades array.
	 */
	public void outputGrades() {    
		System.out.println( "The grades are:\n" );

		// output each student's grade
		for (int student = 0; student < grades.length; student++) 
			System.out.printf( "Student %2d: %3d\n", 
					student + 1, grades[student] );
	} // end method outputGrades
	
	/**
	 * Input grades from a Scanner object.
	 * Reads grades until a non-int is detected or until end of file.
	 * This does not assume that values are read from standard input.
	 * If you want a prompt, do it from the caller.
	 * 
	 * @param in Where grades can be read from.
	 */
	public void inputGrades(Scanner in) {
		/* This is an efficient solution when the number of values is
		 * unknown.  The length of the grades array will start at 1
		 * and will be doubled when more space is needed.  At the end,
		 * the length will be shortened to the number of values read.
		 */
		grades = new int[1];  // start at length 1
		int countGrades = 0;  // keep track of number of grades read
		// Keep reading until a non-int or end of file.
		while (in.hasNextInt()) {
			int grade = in.nextInt();
			
			// Here is where the length is doubled if needed.
			if (countGrades == grades.length) {
				// Arrays class has very useful static methods
				grades = Arrays.copyOf(grades, 2 * grades.length);
			}
			
			// Because of zero-based indexing, countGrades is also
			// the next index to fill in.
			grades[countGrades] = grade;
			countGrades++;
		}
		
		// The array could be shortened by
		// grades = Arrays.copyOf(grades, countGrades);
		// but FYI, the equivalent code is shown here.
		
		// Create a new array with the right length.
		int[] newgrades = new int[countGrades];
		
		// Fill in the new array.
		for (int i = 0; i < countGrades; i++) {
			newgrades[i] = grades[i];
		}
		
		// Store new array in grades. Old array is discarded.
		grades = newgrades;
	}
} // end class GradeBook
