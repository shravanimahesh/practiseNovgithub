package homepractise;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AmazonUsingJnit 
{
	@Before
	public void login()
	{
		System.out.println("SWD logic for login ");
	}
	
	@After
	public void logout()
	{
		System.out.println("SWD logic for logout ");
		System.out.println();
	}
	
	@Test
	public void PurchaseItem()
	{
		System.out.println("SWD logic for PurchaseItem ");
	}
	
	@Test
	public void UpdateOrder()
	{
		System.out.println("SWD logic for UpdateOrder ");
	}
	
	@Test
	public void TrashOrder()
	{
		System.out.println("SWD logic for TrashOrder ");
	}


}
