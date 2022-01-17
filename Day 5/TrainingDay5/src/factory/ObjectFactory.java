package factory;

import dao.EmployeeDao;
import dao.EmployeeDaoImpl;

public class ObjectFactory {
	public static EmployeeDao getInstance() {
		return new EmployeeDaoImpl();
	}
}
