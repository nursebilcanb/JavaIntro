package dataAccess.concretes;

import java.util.Random;
import java.util.Scanner;

import dataAccess.abstracts.VerificationDao;
import entities.concretes.User;

public class HibernateVerificationDao implements VerificationDao{

	@Override
	public void sendVerificationCode() {
		Random verificationCode = new Random();
		System.out.println("E-posta do�rulama kodu : " + verificationCode.nextInt(500));
	
	}

	@Override
	public boolean verify(User user) {
		sendVerificationCode();
		
		System.out.println("Do�rulama linki t�kland� m� ? (Evet/Hay�r) :");
		Scanner input = new Scanner(System.in);
		String click = input.nextLine();
		
		boolean isClick = false;
		
		if(click .equals("Evet")) {
			 isClick = true;
			 System.out.println("Do�rulama ba�ar�l� : " + user.getFirstName());
		}else {
			isClick = false;
			System.out.println("Do�rulama ba�ar�s�z : " + user.getFirstName());
		}
		return isClick;

	}
}
