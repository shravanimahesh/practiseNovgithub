

package program;

import java.io.File;
import java.io.IOException;

// creating text file 

public class File3 {
	
	public static void main(String args[]) throws IOException
	{
		File fileobject = new File("C:/Users/Mahesh/Desktop/uft.txt");
		fileobject.createNewFile();
		fileobject.delete();		
	}// end main

}// end class


