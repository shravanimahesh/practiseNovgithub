package homepractise;

public class FibonacciUsingObject 
{
	
	public void fibonacci()
	{
		int i,n1,n2 ,n3, count=10;
		
		n1= 0;
		n2=1;
		
		System.out.println(n1+" " +n2);
		
		for(i=2;i<=count;i++)
		{
			n3= n1+n2;
			System.out.println(" "+n3);
			n1=n2;
			n2=n3;
			
		}// end for loop 
		
		
	}// end method 
	
	public static void main(String args[])
	{
		FibonacciUsingObject fibo = new FibonacciUsingObject();
		fibo.fibonacci();
		
		
		
	}// end main method 

}
