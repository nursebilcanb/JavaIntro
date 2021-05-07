package dataAccess.abstracts;

import entities.concretes.User;

public interface VerificationDao {
	void sendVerificationCode();
	boolean verify(User user);
}
