package com.instagram.exceptions;

public class EmailNotFoundException extends Exception{
	
	public EmailNotFoundException(String msg) {
		super(msg);
		
	}
	
	public String toString() {
		return "ha ha ha "+getMessage();
	}
}
