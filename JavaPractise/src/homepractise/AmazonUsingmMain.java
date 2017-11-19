package homepractise;

public class AmazonUsingmMain {
	
	public void login()
	{
		System.out.println("SWD logic for login ");
	}
	
	public void logout()
	{
		System.out.println("SWD logic for logout ");
		System.out.println();
	}
	
	public void PurchaseItem()
	{
		System.out.println("SWD logic for PurchaseItem ");
	}
	
	public void UpdateOrder()
	{
		System.out.println("SWD logic for UpdateOrder ");
	}
	
	public void TrashOrder()
	{
		System.out.println("SWD logic for TrashOrder ");
	}
	
	
public static void main(String args[])

{
	
	AmazonUsingmMain oAmazon = new AmazonUsingmMain();
	
	// create order 
	
	oAmazon.login();
	oAmazon.PurchaseItem();
	oAmazon.logout();
	
	
	
	//Modify order
	
	oAmazon.login();
	oAmazon.UpdateOrder();
	oAmazon.logout();
	
	//Delete Order
	oAmazon.login();
	oAmazon.TrashOrder();
	oAmazon.logout();
	
}

}
