package program;

public class Assignmentbignumber {
	
	public static void main(String args[]){
		int a=10,b=80,c=700,d=20;
		if(((a>b)&&(a>c)&&(a>d))){
			
			System.out.println("A is a big number");
		}
		
		else if(((b>a)&&(b>c)&&(b>d))){
			System.out.println("B is a big number");
		}
		
		else if (((c>a)&&(c>b)&&(c>d))){
			System.out.println("C is a big number");
		}
		
		else{
			System.out.println("D is a big number");
		}
				
	}// end main
	

}// end class
