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
	private static final String PASSWORD_REGEX = "(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*()_-])[a-zA-Z0-9].{8,}$";

	static boolean isFirstNameValid,isLastNameValid,isMailValid,isNumberValid,isPasswordValid;
	
	public boolean validateFirstName(String firstName) {
		isFirstNameValid= Pattern.matches(FIRST_NAME_REGEX,firstName);
		if(!isFirstNameValid) {
			System.out.println("First Name is invalid...Please enter proper first name");
		}
		return isFirstNameValid;
	}
	public boolean validateLastName(String lastName) {
		isLastNameValid= Pattern.matches(LAST_NAME_REGEX, lastName);
		if(!isLastNameValid) {
			System.out.println("Last Name is invalid...Please enter proper last name");
		}
		return isLastNameValid;
	}
	public boolean validateEmail(String mail) {
		isMailValid= Pattern.matches(EMAIL_REGEX, mail);
		if(!isMailValid) {
			System.out.println("E-mail is invalid...Please enter e-mail");
		}
		return isMailValid;
	}
	public boolean validatePhoneNumber(String number) {
		boolean isNumberValid= Pattern.matches(PHONE_NUMBER_REGEX, number);
		if(!isNumberValid) {
			System.out.println("Phone Number is invalid...Please enter proper phone-number");
		}
		return isNumberValid;
	}
	public boolean validatePassword(String password) {
		isPasswordValid= Pattern.matches(PASSWORD_REGEX, password);
		if(!isPasswordValid) {
			System.out.println("Password is invalid...Please enter proper password");
		}
		return isPasswordValid;
	}