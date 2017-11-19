package program;

import java.util.Scanner;

public class File4 {
	
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Read two numbers");
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
	//	System.out.println(s1+s2);
		int a= Integer.parseInt(s1);
		int b = Integer.parseInt(s2);
		System.out.println("addition" +(a+b));
		sc.close();
	}// end main	
		

}// end class
