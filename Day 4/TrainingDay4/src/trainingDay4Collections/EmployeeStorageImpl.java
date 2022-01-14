package trainingDay4Collections;

import java.util.ArrayList;

public class EmployeeStorageImpl implements EmployeeStorage {

	ArrayList<Employee> al;
	
	public EmployeeStorageImpl() {
		al= new ArrayList<Employee>();
	}
	
	@Override
	public int save(Employee e) {
		// TODO Auto-generated method stub
		al.add(e);
		return e.getId();
	}

	@Override
	public Employee findEmployee(int id) throws EmployeeNotFoundException {
		// TODO Auto-generated method stub
		Employee e= null;
		int count=0;
		for(Employee x:al) {
			if(x.getId()!=id)
			count++;
			else {
			e=new Employee(x.getId(),x.getName(),x.getSalary());
			}
		}
		if(count!=0)
			throw new EmployeeNotFoundException("Employee not found for this particular passed ID");
		else
			
			return e;
	}

	@Override
	public Employee[] findEmployees() {
		// TODO Auto-generated method stub
		Employee [] a=new Employee[al.size()];
		al.toArray(a);
		return a;
	}

	@Override
	public void delete(int id) throws EmployeeNotFoundException {
		// TODO Auto-generated method stub
		int counter=0;
		for(Employee x:al) {
			if(x.getId()==id) {
				al.remove(x);
				counter++;
				break;
				}
		}
		if(counter==0)
			throw new EmployeeNotFoundException("Employee not found for this particular passed ID");
	}
}
