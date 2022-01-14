package trainingDay4Collections;

import java.util.Scanner;

public class EmployeeDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		EmployeeStorage e=new EmployeeStorageImpl();

		while(1<2) {
			System.out.println("Enter your choice from the below list:-"
					+ "1.	Store\r\n" + 
					"2.	Find by id\r\n" + 
					"3.	Find all\r\n" + 
					"4.	Delete by id\r\n" + 
					"5.	Exit\r\n");
			int x=s.nextInt();
			if(x==1)
			{
				Employee e1= new Employee();
				System.out.println("Enter the ID");
				e1.setId(s.nextInt());
				System.out.println("Enter the name");
				s.nextLine();
				e1.setName(s.nextLine());
				System.out.println("Enter the salary");
				e1.setSalary(s.nextDouble());
				System.out.println("Employee with ID "+e.save(e1)+" is stored");
			}
			else if (x==2) {
				System.out.println("Enter the employee record you wish to find ");
				int id2=s.nextInt();
				try {
				System.out.println(e.findEmployee(id2));
				}
				catch(EmployeeNotFoundException enfe) {
					System.err.println(enfe.getMessage());
				}
			}
			else if(x==3) {
				Employee emp []=e.findEmployees();
				for(int i=0;i<emp.length;i++) {
					System.out.println(emp[i]);
				}
			}
			else if(x==4)
			{
				System.out.println("Enter the ID");
				try {
				e.delete(s.nextInt());
				}
				catch(EmployeeNotFoundException enfe) {
					System.err.println(enfe.getMessage());
				}
			}
			else
				return;
		}
	}
}
