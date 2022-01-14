package trainingDay4Collections;

public interface EmployeeStorage {

	public int save(Employee e);
	public Employee findEmployee(int id) throws EmployeeNotFoundException;
	public Employee[] findEmployees();
	public void delete(int id)throws EmployeeNotFoundException;

}
