package com.example.demo.exception;

public class UnAuthorisedUserException extends Exception{
	public UnAuthorisedUserException() {}
	public UnAuthorisedUserException(String message) {
		super(message);
	}	
}
