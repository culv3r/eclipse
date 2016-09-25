package week04.gradebook3;

public class Student implements Comparable<Student>{
	private Name name;
	private String id;
	
	public Student(String id, Name name) {
		this.id = id;
		this.name = name;
	}
	
	

	public Name getName() {
		return name;
	}



	public String getId() {
		return id;
	}



	@Override
  public String toString() {
	  return "Student [name=" + name + ", id=" + id + ", getName()=" + getName()
	      + ", getId()=" + getId() + "]\n";
  }



	@Override
  public int compareTo(Student o) {
	  // TODO Auto-generated method stub
	  return name.compareTo(o.getName());
  }
	

}
