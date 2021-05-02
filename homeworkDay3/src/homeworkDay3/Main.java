package homeworkDay3;

public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student(1,"Nursebil","Canbolat","nursebil@gmail.com","nur123","147");
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student1);
		
		Instructor  instructor1 = new Instructor(1, "Engin", "Demiroğ", "engin@gmail.com", "engin123");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor1);
		

	}

}
