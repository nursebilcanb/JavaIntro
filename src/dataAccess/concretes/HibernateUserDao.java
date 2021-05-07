package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class HibernateUserDao implements UserDao{

	private List<User> users = new ArrayList<User>();
	
	
	public HibernateUserDao(List<User> users) {
		super();
		this.users = users;
	}

	@Override
	public void add(User user) {
		System.out.println("Hibernate ile eklendi : " + user.getFirstName());
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Hibernate ile silindi : " + user.getFirstName());
		
	}

	@Override
	public void update(User user) {
		System.out.println("Hibernate ile güncellendi : " + user.getFirstName());
		
	}

	@Override
	public User get(int id) {
		User userToUpdate = users.stream().filter(u -> u.getUserId() == id).findFirst().orElse(null);
		return userToUpdate;
	}

	@Override
	public List<User> getall() {
		
		return null;
	}


}
