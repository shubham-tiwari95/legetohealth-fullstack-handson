package trainingDay3Exceptions;

import java.util.Scanner;

public class Solution1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the first number");
		int x=s.nextInt();
		System.out.println("Enter the second number");
		int y=s.nextInt();
		
		try {
		System.out.println(x/y);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			System.out.println("This is the finally block");
		}
	}

}
