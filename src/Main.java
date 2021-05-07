import java.util.ArrayList;
import java.util.List;

import business.abstracts.UserService;
import business.concretes.UserManager;
import business.validationRules.EmailValidator;
import core.GoogleRegistirationManagerAdapter;
import dataAccess.concretes.HibernateUserDao;
import dataAccess.concretes.HibernateVerificationDao;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		List<User> users = new ArrayList() ;
		
		User user1 = new User(1,"Nursebil","Canbolat","nursebil@gmail.com","nur123");
		
		UserService userService = new UserManager(users,new EmailValidator(),new HibernateUserDao(users),new GoogleRegistirationManagerAdapter(),new HibernateVerificationDao());

		userService.register(user1);
		System.out.println("----------------");
		userService.login(user1);
		System.out.println("----------------");
		userService.delete(user1);
		System.out.println("----------------");
		userService.login(user1);
		
		
	}

}
