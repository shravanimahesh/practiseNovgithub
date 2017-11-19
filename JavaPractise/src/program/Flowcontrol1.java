package program;

public class Flowcontrol1 {
	
	public static void main(String args[])
	{
		int a=10 , b = 80, c= 7, d= 2;
		
		if(a>b){
			if(a>c){
				if(a>d){
					     System.out.println("A is a big number");
				       }
				  else {
					     System.out.println("A is not a big number");  
				       }
			          }
				
				else {
					System.out.println("A is not a big number ");
				}
								
			}// end if 
			else {
				System.out.println("A is not big number ");
			}
		
			
		}// end if 
		
				
	}// end main


