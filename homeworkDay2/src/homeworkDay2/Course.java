package homeworkDay2;

public class Course {
	
	public Course() {
		
	}
	
	public Course(int courseId, String courseName, String percentOfCompletion) {
		this();
		this.courseId = courseId;
		this.courseName = courseName;
		this.percentOfCompletion = percentOfCompletion;
		
	}
	
	int courseId;
	String courseName;
	String percentOfCompletion;
}
