package com.userRegistrationwithunitJ;

import java.util.regex.*;

import com.userRegistrationwithunitJ.EmailException.ExceptionType2;
import com.userRegistrationwithunitJ.FirstNameException.ExceptionType;
import com.userRegistrationwithunitJ.LastNameException.ExceptionType1;
import com.userRegistrationwithunitJ.PasswordException.ExceptionType4;
import com.userRegistrationwithunitJ.PhoneNumberException.ExceptionType3;

public class UserRegistration {
	private static final String FIRST_NAME_REGEX = "^[A-Z][a-z]{2,}";
	private static final String LAST_NAME_REGEX = "^[A-Z][a-z]{2,}$";
	private static final String EMAIL_REGEX = "^[a-zA-Z0-9_-]+(?:\\.[a-zA-Z0-9_+-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
	private static final String PHONE_NUMBER_REGEX = "^[0-9]{2}[0-9]{10}";
	static boolean isFirstNameValid,isLastNameValid,isMailValid,isNumberValid;
	
	public boolean validateFirstName(String firstName) {
		isFirstNameValid= Pattern.matches(FIRST_NAME_REGEX,firstName);
		if(!isFirstNameValid) {
			System.out.println("First Name is invalid...Please enter proper first name");
		}
		return Pattern.matches(FIRST_NAME_REGEX,firstName);
	}
	public boolean validateLastName(String lastName) {
		isLastNameValid= Pattern.matches(LAST_NAME_REGEX, lastName);
		if(!isLastNameValid) {
			System.out.println("Last Name is invalid.Please enter proper last name");
		}
		return Pattern.matches(LAST_NAME_REGEX, lastName);
	}
	public boolean validateEmail(String mail) {
		isMailValid= Pattern.matches(EMAIL_REGEX, mail);
		if(!isMailValid) {
			System.out.println("E-mail is invalid.Please enter e-mail");
		}
		return Pattern.matches(EMAIL_REGEX, mail);
	}
	public boolean validatePhoneNumber(String phoneNumber) {
		isNumberValid= Pattern.matches(PHONE_NUMBER_REGEX, phoneNumber);
		if(!isNumberValid) {
			System.out.println("Phone Number is invalid.Please enter proper phone-number");
		}
		return Pattern.matches(PHONE_NUMBER_REGEX, phoneNumber);
	}
}