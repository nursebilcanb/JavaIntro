package business.concretes;

import java.util.ArrayList;
import java.util.List;

import business.abstracts.UserService;
import business.validationRules.EmailValidator;
import core.AuthService;
import dataAccess.abstracts.UserDao;
import dataAccess.abstracts.VerificationDao;
import entities.concretes.User;

public class UserManager implements UserService
{
	
	private UserDao userDao;
	private VerificationDao verificationDao;
	private AuthService authService;
	
	private EmailValidator emailvalidator;
	
	private List<User> users = new ArrayList<User>();

	
	public UserManager(List<User> users,EmailValidator emailValidator,UserDao userDao, AuthService authService,VerificationDao verificationDao) {
		super();
		this.userDao = userDao;
		this.authService = authService;
		this.emailvalidator = emailValidator;
		this.users = users;
		this.verificationDao = verificationDao;
	}


	@Override
	public List<User> getall() {
		
		return null;
	}

	@Override
	public void delete(User user) {
		User userToDelete = users.stream().filter(u -> u.getUserId() == user.getUserId()).findFirst().orElse(null);
		
		if(userToDelete == null) {
			System.out.println("Kullan�c� bulunamad�");
			return;
		}
		
		users.remove(userToDelete);
		System.out.println("Kullan�c� silindi");
	}

	@Override
	public void update(User user) {
		User userToUpdate = userDao.get(user.getUserId());
		
		if(userToUpdate == null) {
			System.out.println("Kullan�c� bulunamad�");
			return;
		}
		
		userToUpdate.setFirstName(user.getFirstName());
		userToUpdate.setLastName(user.getLastName());
		userToUpdate.setEmail(user.getEmail());
		userToUpdate.setPassword(user.getPassword());
		
		System.out.println("Kullan�c� bilgileri g�ncellendi");
		
	}

	@Override
	public boolean register(User user) {
		int isPasswordValid = user.getPassword().length();
		boolean isEmailValid = emailvalidator.isEmailValid(user.getEmail());
		User userExistBefore = users.stream().filter(u -> u.getEmail() == user.getEmail()).findFirst().orElse(null);
		

		if(isPasswordValid < 6) {
			System.out.println("Parola i�in karakter yetersiz");
			return false;
		}
		
		if(userExistBefore != null) {
			System.out.println("Bu email zaten mevcut : " + user.getEmail());
		}
		
		if((user.getFirstName().length() < 2) || (user.getLastName().length() < 2 )) {
			System.out.println("�sim-soyisim 2 karakterden az olamaz");
			return false;
		}
		
		if(isEmailValid & (userExistBefore == null)) {
			
			boolean isVerify = verificationDao.verify(user);
		
			if(isVerify) {
				System.out.println("Kay�t olundu : " + user.getFirstName());
				
				if(user.getEmail().contains("@gmail.com")) {
					authService.registerToSystem(user.getFirstName());
				}
				
				users.add(user);
				return true;
			}
		}
		return false;
	}

	@Override
	public void login(User user) {
		User userToLogin = userDao.get(user.getUserId());
		if(userToLogin == null) {
			System.out.println("Giri� yapmadan �nce kay�t olmal�s�n�z : " + user.getFirstName());
			return;
		}
		
		if((user.getEmail() == null) || (user.getPassword() == null)){
			System.out.println("E-postan�z� ve �ifrenizi girdi�inizden emin olun");
			return;
		}
		
		User isInfoValid = userDao.get(user.getUserId());
		if(isInfoValid != user) {
			System.out.println("Girdi�iniz bilgilerin do�rulu�undan emin olun");
			return;
		}
		
		System.out.println("Giri� ba�ar�l� : " + user.getFirstName());
		
	}

}
