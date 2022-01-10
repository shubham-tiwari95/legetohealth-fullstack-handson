package trainingday1;

import java.util.Scanner;

public class Problem5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Enter first number");
		int a= s.nextInt();
		System.out.println("Enter Second number");
		int b= s.nextInt();
		System.out.println("Enter Third number");
		int c= s.nextInt();
		System.out.println(words(a,b,c));
		s.close();
	}
	
	public static String words(int x, int y, int z) {
		String o="";
		o=o + conversion(x)+conversion(y)+conversion(z);
		o.trim();
		return o;
	}
	public static String conversion(int f) {
		switch(f) {
		case 0: return "Zero ";
		case 1: return "One ";
		case 2: return "Two ";
		case 3: return "Three ";
		case 4: return "Four ";
		case 5: return "Five ";
		case 6: return "Six ";
		case 7: return "Seven ";
		case 8: return "Eight ";
		}
		return "Nine ";
	}
}
