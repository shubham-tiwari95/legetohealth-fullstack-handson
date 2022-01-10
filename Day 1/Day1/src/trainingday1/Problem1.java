package trainingday1;
import java.util.Scanner;
public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		byte b= 127;
		int x=1908;
		long l= 1235467655;
		char c1= 'S';
		char c2= 109;
		System.out.println("Value of byte "+b);
		System.out.println("Value of integer "+x);
		System.out.println("Value of char1 "+c1);
		System.out.println("Value of char2 "+c2);
		System.out.println("Value of long "+l);
		//
		int y= 69;
		int z= y++;
		int v= ++y;
		System.out.println(y);
		System.out.println(z);
		System.out.println(v);
		//
		System.out.println("Enter the size of the array");
		int a1= s.nextInt();
		int [] a= new int[a1];
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		for(int res:a)
			System.out.println(res);
	}

}
