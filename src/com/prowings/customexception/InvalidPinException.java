package com.prowings.customexception;

public class InvalidPinException extends Exception {

	public InvalidPinException() {
		super();
	}

	public InvalidPinException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public InvalidPinException(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidPinException(String message) {
		super(message);
	}

	public InvalidPinException(Throwable cause) {
		super(cause);
	}
	
	
	

}
