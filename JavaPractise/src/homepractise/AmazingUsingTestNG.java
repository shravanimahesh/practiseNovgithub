package homepractise;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AmazingUsingTestNG

{

	@BeforeMethod
	public void login()
	{
		System.out.println("SWD logic for login ");
	}
	
	@AfterMethod
	public void logout()
	{
		System.out.println("SWD logic for logout ");
		System.out.println();
	}
	
	@Test(priority =3)
	public void PurchaseItem()
	{
		System.out.println("SWD logic for PurchaseItem ");
	}
	
	@Test(priority =2)
	public void UpdateOrder()
	{
		System.out.println("SWD logic for UpdateOrder ");
	}
	
	@Test(priority =1)
	public void TrashOrder()
	{
		System.out.println("SWD logic for TrashOrder ");
	}


}
