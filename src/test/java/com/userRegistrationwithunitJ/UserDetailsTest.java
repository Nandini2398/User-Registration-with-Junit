package com.userRegistrationwithunitJ;

import org.junit.Assert;
import org.junit.Test;

public class UserDetailsTest {
	UserRegistration register = new UserRegistration();

	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() {
		boolean isValid = register.validateFirstName("Nandini");
		Assert.assertTrue(isValid);
	}
	@Test
	public void givenFirstName_WhenNotProper_ShouldReturnFalse() {
		boolean isValid = register.validateFirstName("nandini");
		Assert.assertFalse(isValid);
	}
	@Test
	public void givenFirstName_WhenShort_ShouldReturnFalse() {
		boolean isValid = register.validateFirstName("na");
		Assert.assertFalse(isValid);
	}
	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue() {
		boolean isValid = register.validateLastName("Raj");
		Assert.assertTrue(isValid);
	}
	@Test
	public void givenLastName_WhenNotProper_ShouldReturnFalse() {
		boolean isValid = register.validateLastName("raj");
		Assert.assertFalse(isValid);
	}
	@Test
	public void givenLastName_WhenShort_ShouldReturnFalse() {
		boolean isValid = register.validateLastName("ra");
		Assert.assertFalse(isValid);
	}
	@Test
	public void givenEmail_WhenProper_ShouldReturnTrue() {
		boolean isValid = register.validateEmail("abc@gmail.com");
		Assert.assertTrue(isValid);
	}
	@Test
	public void givenEmail_When_ShouldReturnFalse() {
		boolean isValid = register.validateEmail(".abc@gmail.com");
		Assert.assertFalse(isValid);
	}
	@Test
	public void givenPhoneNumber_When_ShouldReturnTrue() {
		boolean isValid = register.validateEmail("91758460906");
		Assert.assertTrue(isValid);
	}
	@Test
	public void givenPhoneNumber_When_ShouldReturnFalse() {
		boolean isValid = register.validateEmail("8460");
		Assert.assertFalse(isValid);
	}
}