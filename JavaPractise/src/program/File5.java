package program;

public class File5 {
	
	public static void main (String args[])
	{
		int a= 10;
		int b= 0;
		
		int  [] abc = new int [4];
		
		
		try
		{
			abc[30]= 200;
			System.out.println(abc[30]);
		}// end try 
		
		catch(ArrayIndexOutOfBoundsException e2)
		{
			System.out.println("Array is out of range");
		}
		
		
		
		try
		{
			int result = a/b;
			System.out.println(result); 
			
		}// end try 
		
		catch (ArithmeticException e )
		{
			System.out.println("Divided by zero error ");
		}// end catch 
		
		System.out.println("hello Java");
		System.out.println("hello Selenium");
		
	}// end main 

}// end class
