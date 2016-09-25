package week04.gradebook3;

import java.util.*;


public class GradeBook3 {
	private String courseName;
	private String[] gradeItems;
	private ArrayList<StudentGrades> students;
	
	public GradeBook3(String cname, String[] items){
		courseName = cname;
		gradeItems = items;
		students = new ArrayList<StudentGrades>();
	}
	
	public void add(Student s) {
		StudentGrades sg = new StudentGrades(s, courseName, gradeItems);
		students.add(sg);
	}
	
	public void setGrade(Student s, String item, double grade) {
		Iterator<StudentGrades> iter = students.iterator();
		while(iter.hasNext()) {
			StudentGrades sg = iter.next();
			if (sg.getStudent().equals(s)) {
				sg.setGrade(item, grade);
				return;
			}
		}	
	}
	
	public double findGrade(Student s, String item) {
		Iterator<StudentGrades> iter = students.iterator();
		while(iter.hasNext()) {
			StudentGrades sg = iter.next();
			if (sg.getStudent().equals(s)) {
				return sg.getGrade(item);
			}
		}	
		return -1;
	}

	
	public String getCourseName() {
		return courseName;
	}

	public String[] getGradeItems() {
		return gradeItems;
	}

	@Override
  public String toString() {
	  return "GradeBook3 [courseName=" + courseName + ", gradeItems="
	      + Arrays.toString(gradeItems) + ", students=" + students + "]";
  }
	
	
	
}
