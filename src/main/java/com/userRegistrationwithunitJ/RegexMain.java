package com.userRegistrationwithunitJ;

import java.util.Scanner;

public class RegexMain {
	public static void main(String[] args) {
		UserRegistration registration = new UserRegistration();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First-Name: ");
		String firstName = sc.next();
		registration.validateFirstName(firstName);
	}
}