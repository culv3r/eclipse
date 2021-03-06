import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import length.Length;
import length.Inch;
import length.Meter;
import length.Foot;
import length.Yard;

/**
 * @author Daniel Larsen
 * Lab 4 and associated packages work to read data from a file which consist
 * of 4 potential length objects. Once the object type is identified, the
 * program creates an object of the desired type and performs manipulations
 * on the data after all objects are read in.
 */
public class Lab4 {

	/**
	 * @param args
	 * The main method handles reading in of the data to be utilized by the
	 * length package and associated classes.
	 */
	public static void main(String[] args) {
		//Array to hold length objects
		ArrayList<Length> lengths = new ArrayList<Length>();
		
		Scanner in = null;
		try {
		    in = new Scanner(new File("data.txt"));
		} catch (FileNotFoundException exception) {
		    throw new RuntimeException("failed to open data.txt");
		}
		// need more code for other parts of this assignment
		while (in.hasNextDouble()) {
		    double value = in.nextDouble();
		    String unit = in.next();
		    Length length = null;
		    // code here to use the value of unit to create the
		    // right type of Length object and store it in length.
		    if (unit.equals("inch")||unit.equals("inches"))
		    	length = new Inch(value);
		    if (unit.equals("foot")||unit.equals("feet"))
		    	length = new Foot(value);
		    if (unit.equals("yard")||unit.equals("yards"))
		    	length = new Yard(value);
		    if (unit.equals("meter")||unit.equals("meters"))
		    	length = new Meter(value);
		    lengths.add(length);
		    System.out.println(length);
		    // need more code for other parts of this assignment
		}
		Length min = null;
		Length max = null;
		for (Length i:lengths){
			if (min == null)
				min = i;
			if (max == null)
				max = i;
			if (min.compareTo(i) > 0)
				min = i;
			if (max.compareTo(i) < 0)
				max = i;
		}
		System.out.println("");
		System.out.println("Minimum is " + min);
		System.out.println("Maximum is " + max);
		// need more code for other parts of this assignment
		Length iSum = new Inch(0.0);
		Length fSum = new Foot(0.0);
		Length ySum = new Yard(0.0);
		Length mSum = new Meter(0.0);
		
		System.out.println();
		System.out.println("Sum of Lengths Adding From First to Last");
		for (int i = 1;i<=4;i++){
			Length temp = null;
			if (i == 1)
				temp = iSum;
			if (i == 2)
				temp = fSum;
			if (i == 3)
				temp = ySum;
			if (i == 4)
				temp = mSum;
			for (int j = 0; j < lengths.size(); j++){
				temp.add(lengths.get(j));
			}
			System.out.println(temp);
		}
		iSum.setLength(0.0);
		fSum.setLength(0.0);
		ySum.setLength(0.0);
		mSum.setLength(0.0);
		
		System.out.println();
		System.out.println("Sum of Lengths Adding From Last to First");
		
		for (int i = 1;i<=4;i++){
			Length temp = null;
			if (i == 1)
				temp = iSum;
			if (i == 2)
				temp = fSum;
			if (i == 3)
				temp = ySum;
			if (i == 4)
				temp = mSum;
			for (int j = lengths.size() - 1; j >= 0; j--){
				temp.add(lengths.get(j));
			}
			System.out.println(temp);
		}
	}

}
