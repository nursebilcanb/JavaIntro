package homeworkDay3;

public class Student extends User{
	
	String studentNumber;
	
	public Student(int id, String firstName, String lastName, String password, String email, String studentNumber) {
		super(id, firstName, lastName, password, email);
		this.studentNumber = studentNumber;
	}
	
}
