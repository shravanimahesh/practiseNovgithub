package program;

public class JavaMethod3 {
	
	// create method 
	
	public void studentrank(int marks)
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
		JavaMethod3 obj = new JavaMethod3();
		obj.studentrank(650);
		
		
	}// end main

}// end class
