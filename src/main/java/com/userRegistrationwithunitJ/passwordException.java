package com.userRegistrationwithunitJ;

public class passwordException extends Exception {
	enum ExceptionType4 {
		ENTERED_NULL,ENTERED_EMPTY;
	}
	ExceptionType4 type;
	public passwordException(ExceptionType4 type,String message) {
		super(message);
		this.type = type;
	}
}