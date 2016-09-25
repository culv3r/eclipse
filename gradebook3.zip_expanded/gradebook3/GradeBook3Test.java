package week04.gradebook3;

public class GradeBook3Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] items = {"hmwk1", "hmwk2", "midterm", "final"};
		GradeBook3 gb = new GradeBook3("cs3443", items);
		
		Student s = new Student("s0012", new Name("Bill", "Smith"));
		gb.add(s);
		gb.setGrade(s, "midterm", 85.3);
		
		System.out.println(gb);
		
	}

}
