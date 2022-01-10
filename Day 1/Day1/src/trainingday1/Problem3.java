package trainingday1;
import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Enter first number");
		int a= s.nextInt();
		System.out.println("Enter Second number");
		int b= s.nextInt();
		System.out.println("Enter Third number");
		int c= s.nextInt();
		System.out.println("The largest number is "+largest(a,b,c));
		s.close();
	}
	public static int largest(int x, int y, int z) {
		if(x>y && x>z)
			return x;
		else if(y>x && y>z)
			return y;
		else
			return z;
	}
	
}
