package program;

import java.util.Scanner;

public class Factorial {
	
	
	public static void main(String args[])
	{
		int n, fact =1;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number for factorial ");
		n= in.nextInt();
		
		for (int i=1;i<=n;i++)
		{
			fact= fact*i;
		}
		
		System.out.println("Factorial of Number is "+fact);
		in.close();
		
	}// end main 

}// end class
