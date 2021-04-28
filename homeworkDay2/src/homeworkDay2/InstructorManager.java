package homeworkDay2;

public class InstructorManager {
	public void Add(Instructor instructor) {
		System.out.println(instructor.instructorName +"-"+ "Eklendi");
	}
	
	public void Delete(Instructor instructor) {
		System.out.println(instructor.instructorName +"-"+ "Silindi");
	}
	
	public void Update(Instructor instructor) {
		System.out.println(instructor.instructorName +"-"+ "Güncellendi");
	}
}
