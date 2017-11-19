package program;

public class VariablesEXAMPLES {
	static int a=100; // it is a class or static variable
	public int salary(){
		int mysalary =10000+2000+1500; // mysalary variable is local variable
		mysalary = mysalary + a;
		return mysalary; 
	}// end salary method
	
	public static void main(String[]args){
		
		int b= 200; // it is instance variable
		System.out.println(a);
		System.out.println(b);
		
		VariablesEXAMPLES obj = new VariablesEXAMPLES();
		//obj.salary();
		System.out.println(obj.salary()); //13500
		
		for (int i=1; i<=5;i++){
		System.out.println(i);	// local for for loop
		System.out.println(a);
		System.out.println(b);
		
		}// end for 
		
		 
	}// end main

}//end class
