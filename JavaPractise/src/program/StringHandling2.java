package program;

public class StringHandling2 {
	
	public static void main(String args[])
	{
		String str1 = "selenium";
		String str2 = "SELENIUM";
		String str3 = "SELENIUM";
		String str4 = "zSELENIUM";
		
		// String Comparison using == operator
		System.out.println( str1 == str2); // false
		
		System.out.println( str2 == str3); // true
		
		// string comparision using equals method
		
		System.out.println( str1.equals(str2)); // false
		System.out.println(str2.equals(str3)); // true
		
		
		// String Comparision using compareTo method
		
		System.out.println( str1.compareTo(str2)); //string 1 is bigger  , greater than 0
		System.out.println( str2.compareTo(str3));  // 0
		System.out.println( str1.compareTo(str4)); // less than 0 
		
		
		
		
		
		
		
	}// end main

}// end class
