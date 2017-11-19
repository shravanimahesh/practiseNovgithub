package homepractise;

public class Car1withinpackage {
	
	int iNoofDoors;
	public String color;
	int iLength;
	
	public Car1withinpackage ()
	{
		
	}// default Constructor
	
	public void start()
	{
		System.out.println("Logic related to start");
	}
	
	void stop()
	{
		System.out.println("Logic Related to Stop");
	}
	
	public void moveforward()
	{
		System.out.println("Logic related to moveforward");
	}
	
	void movebackword()
	{
		System.out.println("Logic related to movebackward");
	}
	
	public static void main(String args[])
	{
		Car1withinpackage obmw = new Car1withinpackage ();
		obmw.movebackword();
		obmw.color= "blue";
		
		Car1withinpackage oAcura;
		oAcura = new Car1withinpackage();
		oAcura.movebackword();
		
	}// end main

}// end class
