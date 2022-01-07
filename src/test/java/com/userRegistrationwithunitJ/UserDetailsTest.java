package com.userRegistrationwithunitJ;

import org.junit.Assert;
import org.junit.Test;

public class UserDetailsTest {
	UserRegistration register = new UserRegistration();

	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() throws FirstNameException {
		boolean isValid = register.validateFirstName("Nandini");
		Assert.assertTrue(isValid);
	}
	@Test
	public void givenFirstName_WhenNotProper_ShouldReturnFalse() throws FirstNameException {
		boolean isValid = register.validateFirstName("nandini");
		Assert.assertFalse(isValid);
	}
	@Test
	public void givenFirstName_WhenShort_ShouldReturnFalse() throws FirstNameException {
		boolean isValid = register.validateFirstName("na");
		Assert.assertFalse(isValid);
	}
	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue() throws LastNameException {
		boolean isValid = register.validateLastName("Raj");
		Assert.assertTrue(isValid);
	}
	@Test
	public void givenLastName_WhenNotProper_ShouldReturnFalse() throws LastNameException {
		boolean isValid = register.validateLastName("Raj");
		Assert.assertFalse(isValid);
	}
	@Test
	public void givenLastName_WhenShort_ShouldReturnFalse() throws LastNameException {
		boolean isValid = register.validateLastName("Ra");
		Assert.assertFalse(isValid);
	}
	@Test
	public void givenEmail_WhenProper_ShouldReturnTrue() throws EmailException {
		boolean isValid = register.validateEmail("abc@gmail.com");
		Assert.assertTrue(isValid);
	}
	@Test
	public void givenEmail_WhenNotProper_ShouldReturnFalse() throws EmailException {
		boolean isValid = register.validateEmail(".abc@gmail.com");
		Assert.assertFalse(isValid);
	}
	@Test
	public void givenPhoneNumber_WhenProper_ShouldReturnTrue() throws PhoneNumberException {
		boolean isValid = register.validatePhoneNumber("917620690906");
		Assert.assertTrue(isValid);
	}
	@Test
	public void givenPhoneNumber_WhenNotProper_ShouldReturnFalse() throws PhoneNumberException {
		boolean isValid4 = register.validatePhoneNumber("56545");
		Assert.assertFalse(isValid4);
	}
	@Test
	public void givenPassword_When1UpperCase_ShouldReturnTrue() throws PasswordException {
		boolean isValid = register.validatePassword("aBd5gd2@g");
		Assert.assertTrue(isValid);
	}
	@Test
	public void givenPassword_WhenProper_ShouldReturnTrue() throws PasswordException {
		boolean isValid = register.validatePassword("aBd5gd2@g");
		Assert.assertTrue(isValid);
	}
	@Test
	public void givenPassword_WhenNotProper_ShouldReturnFalse() throws PasswordException {
		boolean isValid = register.validatePassword("b31fr7skd");
		Assert.assertFalse(isValid);
	}
	@Test
	public void givenEmail_WhenHaveConsecutiveDots_ShouldReturnFalse() throws EmailException {
		boolean isValid = register.validateEmail("abc..23@gmail.com");
		Assert.assertFalse(isValid);
	}
}
