package com.userRegistrationwithunitJ;

import org.junit.Assert;
import org.junit.Test;

public class UserDetailsTest {
	UserRegistration register = new UserRegistration();

	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() {
		boolean isValid = register.validateFirstName("Ravi");
		Assert.assertTrue(isValid);
	}
	@Test
	public void givenFirstName_WhenNotProper_ShouldReturnFalse() {
		boolean isValid = register.validateFirstName("ravi");
		Assert.assertFalse(isValid);
	}
	@Test
	public void givenFirstName_WhenShort_ShouldReturnFalse() {
		boolean isValid = register.validateFirstName("ra");
		Assert.assertFalse(isValid);
	}
	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue() {
		boolean isValid = register.validateLastName("Kumar");
		Assert.assertTrue(isValid);
	}
	@Test
	public void givenLastName_WhenNotProper_ShouldReturnFalse() {
		boolean isValid = register.validateLastName("kumar");
		Assert.assertFalse(isValid);
	}
	@Test
	public void givenLastName_WhenShort_ShouldReturnFalse() {
		boolean isValid = register.validateLastName("ku");
		Assert.assertFalse(isValid);
	}
	@Test
	public void givenEmail_WhenProper_ShouldReturnTrue() {
		boolean isValid = register.validateEmail("abc@gmail.com");
		Assert.assertTrue(isValid);
	}
	@Test
	public void givenEmail_WhenNotProper_ShouldReturnFalse() {
		boolean isValid = register.validateEmail(".abc@gmail.com");
		Assert.assertFalse(isValid);
	}
	@Test
	public void givenPhoneNumber_WhenProper_ShouldReturnTrue() {
		boolean isValid = register.validateEmail("917620690906");
		Assert.assertTrue(isValid);
	}
	@Test
	public void givenPhoneNumber_WhenNotProper_ShouldReturnFalse() {
		boolean isValid = register.validateEmail("5654");
		Assert.assertFalse(isValid);
	}
	@Test
	public void givenPassword_When1UpperCase_ShouldReturnTrue() {
		boolean isValid = register.validateEmail("aBd5gd2@g");
		Assert.assertTrue(isValid);
	}
	@Test
	public void givenPassword_WhenProper_ShouldReturnTrue() {
		boolean isValid = register.validateEmail("aBd5gd2@g");
		Assert.assertTrue(isValid);
	}
	@Test
	public void givenPassword_WhenNotProper_ShouldReturnFalse() {
		boolean isValid = register.validateEmail("b3@fr");
		Assert.assertFalse(isValid);
	}
}