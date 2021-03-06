package Lab2;

import java.util.*;

/**
 * @author Daniel Larsen
 * The Grades class contains the private values only accessible through methods in
 * the Grades class itself or via return values from the public methods within the
 * class.
 */
public class Grades {
private String name;
private ArrayList<Integer> grades = new ArrayList<Integer>();

/**
 * @param name
 * Constructor class which creates the object for use.
 */
public Grades(String s){
	this.name = s;
	}

/**
 * @return
 * Returns the name value associated with the object.
 */
public String getName() {
	return this.name;
}

/**
 * @param name
 * Sets the name value associated with the object.
 */
public void setName(String s) {
	this.name = s;
}

/**
 * @param grade
 * Takes a single int as a new grade entry and adds it to the object specific
 * ArrayList.
 */
public void setGrades(int grade) {
	if (grade == -1){
		this.grades.clear();
	} else {
	this.grades.add(grade);
	}
	
}

/**
 * @return
 * Returns the number of elements within the ArrayList.
 */
public int length(){
	return this.grades.size(); 
}

/**
 * @return
 * Adds all the values contained within the array list and then divides that sum
 * by the number of elements in the array which is returned as an average.
 */
public double average(){
	if (this.grades.isEmpty()){
		return -99999;
	}
	double average = 0.0;
	for (int i = 0; i<grades.size(); i++){
		average += grades.get(i);
	}
	average = average/grades.size();
	return average;
}

/**
 * @return
 * The median method creates a new 'temp' array list to sort the data and leave
 * the original information unchanged. It then, based upon whether the number
 * of elements is odd or even, returns a median double.
 */
public double median(){
	if (this.grades.isEmpty()){
		return -99999;
	}
	ArrayList<Integer> median = new ArrayList<Integer>();
	for (int i = 0; i < grades.size(); i++){
		median.add(grades.get(i));
	}
	Collections.sort(median);
	int count = median.size();
	
	if (median.size()%2 == 0){
		double evenMed=((double)median.get(count/2) + (double)median.get(count/2-1))/2;
		return evenMed;
	} else {
		double oddMed=median.get(count/2);
		return oddMed;
	}
}

/**
 * @return
 * Returns the maximum value as per the Java Collections utilities.
 */
public int maximum(){ 
return Collections.max(grades);
}

/**
 * @return
 * Returns the minimum value as per the Java Collections utilities.
 */
public int minimum(){
	return Collections.min(grades);
}

/* (non-Javadoc)
 * @see java.lang.Object#toString()
 * Prints out the raw data.
 */
@Override
public String toString() {
	return name + " " + grades;
}

}
