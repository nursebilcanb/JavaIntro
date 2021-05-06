package Entities;

import java.util.Date;

import Abstract.IEntity;

public class Gamer implements IEntity{
	
	int gamerId;
	String gamerName;
	String firstName;
	String lastName;
	String nationalityId;
	Date dateOfBirth;
	String email;
	String password;
	
	public Gamer() {
		
	}
	
	public Gamer(int gamerId, String gamerName, String firstName, String lastName, String nationalityId, String email,
			String password,Date dateOfBirth) {
		super();
		this.gamerId = gamerId;
		this.gamerName = gamerName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalityId = nationalityId;
		this.email = email;
		this.password = password;
		this.dateOfBirth = dateOfBirth;
		
	}

	public int getGamerId() {
		return gamerId;
	}

	public void setGamerId(int gamerId) {
		this.gamerId = gamerId;
	}

	public String getGamerName() {
		return gamerName;
	}

	public void setGamerName(String gamerName) {
		this.gamerName = gamerName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

	
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	
}
