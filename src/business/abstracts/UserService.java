package business.abstracts;

import java.util.List;

import entities.concretes.User;

public interface UserService {
	void delete(User user);
	void update(User user);
	
	boolean register(User user);
	void login(User user);
	
	List<User> getall();

}
