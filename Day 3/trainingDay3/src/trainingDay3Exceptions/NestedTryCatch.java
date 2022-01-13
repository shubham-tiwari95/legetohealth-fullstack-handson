package trainingDay3Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NestedTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the first number");
		try {
		int x=s.nextInt();
		System.out.println("Enter the second number");
		int y=s.nextInt();
		try {
		
		System.out.println(x/y);
		}
		catch(ArithmeticException a) {
			System.out.println("Catch 1");
			a.printStackTrace();
		}
		 }
		catch(InputMismatchException i) {
			System.out.println("Catch 2");
			i.printStackTrace();
		}
		catch(Exception e){
			System.out.println("Parent Catch");
			e.printStackTrace();
		}
		finally{
			System.out.println("This is the finally block");
		}
	}

}
