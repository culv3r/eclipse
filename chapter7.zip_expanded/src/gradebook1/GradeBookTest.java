package gradebook1;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * Fig. 7.15plus: GradeBookTest.java <br>
 * GradeBookTest creates a GradeBook object using an array of grades,
 * then invokes method processGrades to analyze them.
 * Additional code uses inputGrades to read from standard input
 * and a file.
 * 
 * @author Deitel & Associates, Inc.
 * @author Tom Bylander
 */
public class GradeBookTest {
	/**
	 * Main method begins program execution.
	 * Need to handle FileNotFoundException in some way.
	 */
   public static void main( String[] args ) throws FileNotFoundException {
      // one-dimensional array of student grades
      int[] gradesArray = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
      
      GradeBook myGradeBook = new GradeBook( 
         "CS101 Introduction to Java Programming", gradesArray );
      System.out.printf("Welcome to the grade book for%n%s%n%n",
              myGradeBook.getCourseName());
      myGradeBook.processGrades();
      
      System.out.println("----------------------------------------");
      
      GradeBook gradeBook1 = new GradeBook("Java 101");
      System.out.printf("Welcome to the grade book for%n%s%n%n",
              gradeBook1.getCourseName());
      System.out.println("Enter grades.  Enter quit to end.");
      Scanner stdin = new Scanner(System.in);
      gradeBook1.inputGrades(stdin);
      stdin.close();
      gradeBook1.processGrades();
     
      
      System.out.println("----------------------------------------");
      
      GradeBook gradeBook2 = new GradeBook("Java 102");
      System.out.printf("Welcome to the grade book for%n%s%n%n",
              gradeBook2.getCourseName());
      Scanner infile = new Scanner(new File("grades.txt"));
      gradeBook2.inputGrades(infile);
      infile.close();
      gradeBook2.processGrades();
   } // end main
} // end class GradeBookTest
