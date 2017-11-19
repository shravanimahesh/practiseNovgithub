package program;

public class OperatorsExample {
	public static void main(String[] args){
		int a = 10,b = 5;
		//String c = "Selenium " , d= "Testing";
		System.out.println("Addition of a,b is  "+(a+b));
		System.out.println("Substraction of a,b is  "+(a-b));
		System.out.println("multiplicaiton of a,b is  "+(a*b));
		System.out.println("Division of a,b is  "+(a/b));
		System.out.println("Modulus of a,b is  "+(a%b));
		
		b=10;
		a= ++b;
		System.out.println(a);//11
		
		a = --b;
		System.out.println(a);//10
		
		
		
	}// end main

}// end class
