
// A class that represents a student object
public class Student {
	// Class properties
	private int rollno;
	private String name;
	private String address;
	
	// Default Constructor
	public Student() {
		this.rollno = -1;
		this.name = "";
		this.address = "";
	}
	
	// Parameterized Constructor
	public Student(int rollno, String name, String address) {
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}
	
	// A method to get the roll number of the student
	public int getRollNumber() {
		return this.rollno;
	}
	
	// A method to get the name of the student
	public String getName() {
		return this.name;
	}
	
	// A method to get the address of the student
	public String getAddress() {
		return this.address;
	}
	
	// A method to set the roll number of the student
	public void setRollNumber(int rollno) {
		this.rollno = rollno;
	}
	
	// A method to set the name of the student
	public void setName(String name) {
		this.name = name;
	}
	
	// A method to set the address of the student
	public void setAddress(String address) {
		this.address = address;
	}
	
	// A method that returns a string output summarizing the student's properties
	public String getOutput() {
		return String.format("Student Name: %s, Student Roll Number: %d, Student Address: %s", name, rollno, address);
	}
}
