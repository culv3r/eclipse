package week04.gradebook3;

public class Name implements Comparable<Name> {
	private String firstName, lastName;
	
	public Name(String f, String l) {
		firstName = f;
		lastName = l;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	@Override
  public String toString() {
	  return "Name [firstName=" + firstName + ", lastName=" + lastName
	      + ", getFirstName()=" + getFirstName() + ", getLastName()="
	      + getLastName() + "]\n";
  }

	@Override
  public int compareTo(Name o) {
	  // TODO Auto-generated method stub
		if (getLastName().equalsIgnoreCase(o.getLastName())) {
			return getFirstName().compareTo(o.getFirstName());
		} else
			return getLastName().compareTo(o.getLastName());
	  
  }
	
	
}
