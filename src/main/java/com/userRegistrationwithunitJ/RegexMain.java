package com.userRegistrationwithunitJ;

import java.util.Scanner;

public class RegexMain {
	public static void main(String[] args) {
		UserRegistration registration = new UserRegistration();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First-Name: ");
		String firstName = sc.next();
		registration.validateFirstName(firstName);
		System.out.println("Enter Last-Name: ");
		String lastName = sc.next();
		registration.validateLastName(lastName);
		System.out.println("Enter Email: ");
		String mail = sc.next();
		registration.validateEmail(mail);
		System.out.println("Enter Phone Number: ");
		String number = sc.next();
		registration.validatePhoneNumber(number);
		System.out.println("Enter Password: ");
		String password = sc.next();
		registration.validatePhoneNumber(password);
		
	}
}