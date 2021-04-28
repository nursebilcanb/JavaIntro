package homeworkDay2;

public class CourseManager {
	public void Add(Course course) {
		System.out.println(course.courseName + " " + "Eklendi");
	}
	
	public void CourseAndInstructor(Course course,Instructor instructor) {
		System.out.println(course.courseName +" kursu" + " " + instructor.instructorName +"eðitmenine aittir");
	}

}
