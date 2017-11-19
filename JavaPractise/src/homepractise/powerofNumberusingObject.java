package homepractise;

import java.util.Scanner;

public class powerofNumberusingObject {
	
	public long powerOfNumber(long n1, long p1)
	{
		
	 long r= 1;
		
		
		if(n1>=1 && p1==0)
		{
			
		System.out.println(" power of any number  ^ 0 is 1");
		
			
		}// end if 
		
		else if (n1==0 && p1>=0)
		    {
			    System.out.println(" power of 0 ^ any number  is 0");
			 
		     }
		
		else 
		{
		
	
	           for (int i=1;i<=p1;i++)
	           {
		
	        	   r= r* n1;		
		
	           }// end for
	
	//System.out.println("power of " +n+ "^" +p+ "is" +r);
	          
		} // end else 
		
		return r;
		
	}// end powerofnumber method 
	
	public static void main(String args[])
	{
		
		powerofNumberusingObject p1 =  new powerofNumberusingObject();
		
		long n,p, r =1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		n= sc.nextLong();
		System.out.println("ENTER powewr number");
		p= sc.nextLong();
		r= p1.powerOfNumber(n, p);
		System.out.println(+r);
		sc.close();
		
	}// end method main

}// end class
