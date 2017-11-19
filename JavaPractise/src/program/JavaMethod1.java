package program;

public class JavaMethod1 {

	// user defined method 
	
	public int multiply(int a , int b, int c)
	{
		int result;
		result = a*b*c;
		return result;
		
		
	}// end of method 
	
	public static void main(String args[])
	{
		// create object
		
		JavaMethod1 abc = new JavaMethod1();
		int x = abc.multiply(10, 20, 30);
		System.out.println("multiplication using method" +x);
		System.out.println(abc.multiply(10, 25, 35));
		
	}// end main
	
	
	
}// end class
