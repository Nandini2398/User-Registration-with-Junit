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
	static boolean isFirstNameValid,isLastNameValid;
	
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
			System.out.println("Last Name is invalid...Please enter proper last name");
		}
		return Pattern.matches(LAST_NAME_REGEX, lastName);
	}
}
