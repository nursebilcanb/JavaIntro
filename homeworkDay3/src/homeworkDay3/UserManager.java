package homeworkDay3;

public class UserManager {
	
	public void add(User user) {
		System.out.println("Kullanýcý eklendi : " + user.firstName);
	}
	
	public void delete(User user) {
		System.out.println("Kullanýcý silindi : " + user.firstName);
	}
	
}
