package program;

public class FactUsingObjects1 {
	
	public int fact(int a)
	{
		int f= 1, i;
		for (i=1;i<=a;i++) 
		{
		  f= f*i;
		  			
		}// end for loop 
		
		return f;
	}// end method fact
	
	public static void main(String args[])
	{
		FactUsingObjects1 ofact = new FactUsingObjects1();
		int s = ofact.fact(5);
		System.out.println("Factorial Of Number is " +s);
			
	}// end main

}// end class
