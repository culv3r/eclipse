package week04.gradebook3;

import java.util.Arrays;

public class StudentGrades {
	private Student student;
	private double[] grades;
	private String[] gradeItems;
	private String courseName;
	
	public StudentGrades(Student s, String course, String[] gradeItems) {
		student = s;
		courseName = course;
		this.gradeItems = gradeItems;
		grades = new double[gradeItems.length];
	}
	
	public void setGrade(String item, double grade) {
		int index = indexOf(item);
		if (isAnItem(index)) {
			grades[index] = grade;
		}
	}
	
	public double getGrade(String item) {
		int index = indexOf(item);
		if (isAnItem(index)) return grades[index];
		else return -1;
	}
	
	
	public Student getStudent() {
		return student;
	}

	public double[] getGrades() {
		return grades;
	}

	public String[] getGradeItems() {
		return gradeItems;
	}

	public String getCourseName() {
		return courseName;
	}

	
	@Override
  public String toString() {
	  return "StudentGrades [student=" + student + ", grades="
	      + Arrays.toString(grades) + ", gradeItems="
	      + Arrays.toString(gradeItems) + ", courseName=" + courseName
	      + ", getStudent()=" + getStudent() + ", getGrades()="
	      + Arrays.toString(getGrades()) + ", getGradeItems()="
	      + Arrays.toString(getGradeItems()) + ", getCourseName()="
	      + getCourseName() + "]\n";
  }

	private int indexOf(String item) {
		for (int i=0; i<gradeItems.length; i++) {
			if (item.equals(gradeItems[i]))
				return i;
		}
		return -1;
	}
	
	private boolean isAnItem(int i) {
		return (i>=0 && i<gradeItems.length);
	}
	
	
}
