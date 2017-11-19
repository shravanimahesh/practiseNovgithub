package program;

import java.util.Scanner;

public class FactUsingObject2 {
	
	public static int Fact(int a)
	{
		int f=1,i;
		for(i=1;i<=a;i++)
		{
			f= f*i;
		}// end for 
		
		return f;
		
	}// end fact method
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number for factorial");
		
		int d = sc.nextInt();
		
		int result = Fact(d);
		System.out.println("Factorial of number" +d+ "is" +result);
		
		sc.close();
		
		
		
		
	
		
		
	}// end main

}
