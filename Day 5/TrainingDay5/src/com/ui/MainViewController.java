package com.ui;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import beans.Employee;
import dao.EmployeeDao;
import dao.EmployeeDaoImpl;
import com.exceptions.EmployeeNotFoundException;
import factory.ObjectFactory;

public class MainViewController {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int option = 0;
		// creating DAO instance, we must have used interface here
//		EmployeeDaoImpl dao = new EmployeeDaoImpl();
		EmployeeDao dao = ObjectFactory.getInstance();
		do {
			System.out.println("Enter below options to perform CRUD operations");
			System.out.println("1: Store employee, 2: Fetch all employees");
			System.out.println("3: Fetch employee by id, 4: Delete employee by id");
			System.out.println("5: Update employee salary by id, -1: Exit");
			option = scan.nextInt();
			switch(option) {
			case 1:
				System.out.println("Enter name");
				String name = scan.next();
				System.out.println("Enter salary");
				double salary = scan.nextDouble();
				Employee employee = new Employee(0, name, salary); // 0 will never be stored because of auto_increment
				int status = dao.store(employee);
				if(status == -1) {
					System.err.println("Employee failed to store");
				} else {
					System.out.println("Employee stored");
				}
				break;
			case 2:
				List <Employee> al1= new ArrayList<Employee>(dao.findAll());
			
				for(Employee e:al1)	
				System.out.println(e);
				break;
				
			case 3: 
				System.out.println("Enter id");
				int id = scan.nextInt();
				// if findById throws an exception we can print that in the catch block
				try {
					employee = dao.findById(id);
					System.out.println(employee);
				} catch (EmployeeNotFoundException e) {
					System.err.println("Error: "+e.getMessage());
				}
				break;
			case 5:
				System.out.println("Enter id");
				int id5 = scan.nextInt();
				System.out.println("Enter salary");
				double sal= scan.nextDouble();
				try {
					dao.update(id5, sal);
					System.out.println("Record updated");
				}
				catch (EmployeeNotFoundException e) {
					System.err.println("Error: "+e.getMessage());
				}
				break;
			}
			
		} while(option != -1);
		
		scan.close();
	}

}
