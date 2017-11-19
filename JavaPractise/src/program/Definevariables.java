package program;



public class Definevariables {
	
	// method declaration ,create method 
	public int multiply(int a, int b, int c)
	{
		int result=a*b*c;
		return result;
		
	}//  end method
	
	
public static void main(String args[]){
		int a = 10, b, c;
		 b=20;
	     c=30; 
		float y = 20.5f;
		String z = "Welcome";
		final int money =100;// constant declaration 
		System.out.println("Addition of a,b is "+(a+b)); //30
		System.out.println(money);//100
		System.out.println(c);
		
			
		System.out.println("value of y="+y);
		System.out.println("value of a="+a);
		System.out.println("value of z="+z);
		
		// condition block
		
		if (a>b)
		{
			System.out.println("a is a big number");
			
		}
		else
		{
			System.out.println("b is a big number");
		}
		
		// Loop Block 
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
		
		// create object and access methods 
		
		Definevariables obj = new Definevariables();
		int x = obj.multiply(10,25,50);
		System.out.println(x);
		
		
		}// end main
	}// end class
