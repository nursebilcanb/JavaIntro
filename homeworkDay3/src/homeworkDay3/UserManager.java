package homeworkDay3;

public class UserManager {
	
	public void add(User user) {
		System.out.println("Kullan�c� eklendi : " + user.firstName);
	}
	
	public void delete(User user) {
		System.out.println("Kullan�c� silindi : " + user.firstName);
	}
	
}
