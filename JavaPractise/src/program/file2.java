package program;

import java.io.File;

public class file2 {
	
	public static void main(String args[])
	{
		File fileobj = new File("C:/Users/Mahesh/Desktop/Selenium");
		boolean a = fileobj.exists();
		
		if (a== true)
		{
			System.out.println("Folder exists");
		}
		
		else
		{
			System.out.println("Folder doesnt exist ");
		}
		
		
	}// end main

}// end class
