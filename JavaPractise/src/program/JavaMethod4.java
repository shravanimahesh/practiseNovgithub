package program;

public class JavaMethod4 {
	//create method without returning any value (without object)
	public static  void studentrank(int marks)
	{
		if (marks >= 600)
		{
			System.out.println("Rank A");
		}
		
		else if (marks >=500)
		{
			System.out.println("Rank B");
			
		}
		
		else 
		{
			System.out.println("Rank C");
			
		}
		
	}// end method 
	
	
	public static void main(String args[])
	{
		studentrank(650);
		
		
	}// end main

}// end class



