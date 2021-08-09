package classStudy;

public class Person {
	String lastName; //º∫
	String firstName; // ¿Ã∏ß
	
	public String getLastName() {
		return lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public int getLength() {
		return lastName.length()+firstName.length();
	}
	
}
