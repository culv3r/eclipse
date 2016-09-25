package Lab3;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Lab3 {

	public static void main(String[] args) {
		List<Date> dates = new ArrayList<Date>();
		Scanner in = null;
		try {
		    in = new Scanner(new File("dates.txt"));
		} catch (FileNotFoundException exception) {
		    System.err.println("failed to open dates.txt");
		    System.exit(1);
		}
		while (in.hasNextLine()) {
		    String line = in.nextLine();
		    dates.add(new Date(line));
		}

	}

}
