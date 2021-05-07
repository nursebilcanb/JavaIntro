package dataAccess.concretes;

import java.util.Random;
import java.util.Scanner;

import dataAccess.abstracts.VerificationDao;
import entities.concretes.User;

public class HibernateVerificationDao implements VerificationDao{

	@Override
	public void sendVerificationCode() {
		Random verificationCode = new Random();
		System.out.println("E-posta doðrulama kodu : " + verificationCode.nextInt(500));
	
	}

	@Override
	public boolean verify(User user) {
		sendVerificationCode();
		
		System.out.println("Doðrulama linki týklandý mý ? (Evet/Hayýr) :");
		Scanner input = new Scanner(System.in);
		String click = input.nextLine();
		
		boolean isClick = false;
		
		if(click .equals("Evet")) {
			 isClick = true;
			 System.out.println("Doðrulama baþarýlý : " + user.getFirstName());
		}else {
			isClick = false;
			System.out.println("Doðrulama baþarýsýz : " + user.getFirstName());
		}
		return isClick;

	}
}
