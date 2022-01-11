package trainingDay2;

public class Employee extends Person {

	private int employeeId;
	private double salary;
	
	public Employee(int employeeId, String name, String gender, double salary) {
		super(name,gender);
		this.employeeId=employeeId;
		this.salary= salary;
		System.out.println("Employee constructor int, String, String, double");
	}
	
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("Id="+employeeId+" Salary="+salary);
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("The Employee information is "+employeeId+" & Salary="+salary);
	}
}
