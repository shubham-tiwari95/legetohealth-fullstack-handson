package trainingDay3Exceptions;

import java.io.IOException;
import java.util.Scanner;

public class ExampleThrow {

	public static void main(String[] args) /*throws IOException*/ {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Enter first number");
		int x= s.nextInt();
		System.out.println("Enter second number");
		int y= s.nextInt();
		try{
			System.out.println(add(x,y));
	}
		catch(IOException i) {
			i.printStackTrace();
		}
		}
	
	public static int add(int x, int y) throws IOException {
		if (x<0 || y<0)
		{
			throw new IOException();
		}
		return x+y;
	}

}
