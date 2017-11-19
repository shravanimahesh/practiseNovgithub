package homepractise;

public class PractiseString {
	
	public static void main (String args[])
	
	{
		
		String str1 = "This is Java Class";
		String str2 = "          Thanks for your transaction....your ref#677888889   ";
		String str3 = "1244556890             ";
		String str4 = "Welcome Daniel to Facebook";

		
		//substring
		System.out.println("Substring in string1  " +str1.substring(2, 9));
		
		//replace
		System.out.println("Replace String " +str4.replace("Facebook","Google"));
		System.out.println("Replace T with A" +str2.replace("T", "A"));
		
		//length of string
		System.out.println("Length of String str1 is " +str1.length());
		
		//concatination
		System.out.println("String Concatination str1+str2" +str1.concat(str2));
		
		//equals
		if (str4.equals("Daniel"))
		{
			System.out.println(" String has match  Daniel ");
		}
		
		else 
		{
			System.out.println("String doent have Daniel");
		}
		
		//equalsIgnorecase
		
		if(str1.equalsIgnoreCase("This is Java Class"))
		{
			System.out.println("Contains Java");
		}
		
		else 
		{
			System.out.println(" doent have java word");
		}
		
		//trim
		
		System.out.println("str3 trim function " +str3.trim());
		
	}// end main 
	
	

}
