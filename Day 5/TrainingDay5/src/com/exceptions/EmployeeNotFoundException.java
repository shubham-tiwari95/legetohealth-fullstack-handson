package com.exceptions;

@SuppressWarnings("serial")
public class EmployeeNotFoundException extends Exception {

	public EmployeeNotFoundException() {
		super();
	}
	public EmployeeNotFoundException(String error) {
		super(error);
	}
}
