package trainingDay3Exceptions;

import java.util.Scanner;

public class DriverUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		try {
		UserService u= new UserService();
		System.out.println("Enter the ID you need to search");
		int x=s.nextInt();
		u.searchUser(x);
		}
		catch(UserNotFoundException un)
		{
			System.err.println(un.getMessage());
		}
		finally {
			s.close();
			System.out.println("End of the program");
		}
	}
}
