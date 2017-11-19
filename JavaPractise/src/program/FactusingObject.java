package program;

public class FactusingObject {
	
	public void fact(int a)
	{
		int i, f = 1;
		for (i= 1; i<=a; i++)
		{
			f = f * i;
			
		}
		
		System.out.println("Factorial of Number "+f);
	}// end Fact method

	public static void main(String args[])
	{
		FactusingObject f1 = new FactusingObject();
		f1.fact(6);    
	}// end main 
	
}// end class FactusingObject
