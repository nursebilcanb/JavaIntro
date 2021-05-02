package homeworkDay3;

public class StudentManager {
	
	public void add(Student student) {
		System.out.println("Öğrenci eklendi : " + student.firstName);
	}
	
	public void delete(Student student) {
		System.out.println("Öğrenci silindi : " + student.firstName);
	}
	
}
