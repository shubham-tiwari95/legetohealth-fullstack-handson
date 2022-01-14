package trainingDay4Collections;

@SuppressWarnings("serial")
public class EmployeeNotFoundException extends Exception {

	public EmployeeNotFoundException() {
		super();
	}
	public EmployeeNotFoundException(String error) {
		super(error);
	}
}
