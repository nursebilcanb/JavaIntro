package business.validationRules;

import java.util.regex.Pattern;

public class EmailValidator {
	private static final String EMAIL_PATTERN = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
	 
	public  boolean isEmailValid(String emailInput) {
	Pattern pattern = Pattern.compile(EMAIL_PATTERN,
	Pattern.CASE_INSENSITIVE);
	
	boolean isEmailValid = false;

	if(pattern.matcher(emailInput).find()) {
		isEmailValid = true;
	}else {
		System.out.println("Ge�ersiz e-posta yaz�m�");
	}
	
	return isEmailValid;
	}

}
