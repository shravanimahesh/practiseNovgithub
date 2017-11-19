package program;

public class evenodd {
	
	void  check(int a)
	{
		if (a%2==0)
		{
		System.out.println(" even number");
		}
		else 
		{	
		System.out.println("odd number");
		}
		
		}	
	
	public static void main(String args[])
	{
		int b=11;
		evenodd obj= new evenodd();
		obj.check(b);
	}
}
