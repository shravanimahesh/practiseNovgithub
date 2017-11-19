package homePractise2;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class SearchButtonSWD {

	
	public void searchItem()
	{
		// open chrome browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh\\Desktop\\h2ksoftware\\selenium-java-3.5.3\\NewBrowserChrome\\chromedriver.exe");
		ChromeDriver oBrowser = new ChromeDriver();
		
		// launch website 
		oBrowser.get("https://www.ebay.com/");
		
		// search textbox write "laptop"
		oBrowser.findElement(By.id("gh-ac")).clear();
		oBrowser.findElement(By.id("gh-ac")).sendKeys("Laptop");
				
		// click on "SEARCH" BUTTON 
		
		//oBrowser.findElement(By.id("gh-btn")).click();
		oBrowser.findElement(By.xpath("//input[@value='Search']")).click();
		
	}
	
@Test
	public void searchLink()
	{
		//open chrome 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh\\Desktop\\h2ksoftware\\selenium-java-3.5.3\\NewBrowserChrome\\chromedriver.exe");
		
		ChromeDriver oBrowser = new ChromeDriver();
		
		//launch website
		
		oBrowser.get("https://www.ebay.com/");
		
		//click on "Sign-In" link
		
		//oBrowser.findElement(By.xpath("//a[linkText='Sign in']").cl
		
	//	or 
		
		//WebElement uSignIn = oBrowser.findElement(By.linkText("Sign in"));
	//	uSignIn.click();
		
		//WebElement uSignIn = oBrowser.findElement(By.xpath("//a[contains(@_sp,'m570.l1524')]"));
		WebElement uSignIn = oBrowser.findElement(By.xpath("//a[contains(@href,'signin.ebay.com')]"));
		uSignIn.click();
		
		
	}
	
	
	public void searchCheckbox()
	{
		// open chrome 
		//
		//System.setProperty("web.chrome.driver","C:\\Users\\Mahesh\\Desktop\\h2ksoftware\\selenium-java-3.5.3\\NewBrowserChrome\\chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh\\Desktop\\h2ksoftware\\selenium-java-3.5.3\\NewBrowserChrome\\chromedriver.exe");
		ChromeDriver oBrowser = new ChromeDriver();
		
		// launch ebay.com 
		oBrowser.get("https://www.ebay.com/");
		
		// click on "Advance" link 
//	oBrowser.findElement(By.linkText("Advanced")).click();
		oBrowser.findElement(By.xpath("//a[contains(@title,'Advanced Search')]")).click();
		
		//or
		
		/*WebElement uAdvance = oBrowser.findElement(By.linkText("Advanced"));
		uAdvance.click();*/
		
		// check checkbox is selected or not 
		
		if (!(oBrowser.findElement(By.xpath("//input[@type='checkbox']")).isSelected()))
		{
			oBrowser.findElement(By.xpath("//input[@type='checkbox']")).click();
			
		
	     }
		
		
	}
	

	public void searchRadiobutton()
	{
		// open chrome browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh\\Desktop\\h2ksoftware\\selenium-java-3.5.3\\NewBrowserChrome\\chromedriver.exe");
		ChromeDriver oBrowser = new ChromeDriver();
		
		// launch southwest.com
		
		oBrowser.get(" https://www.southwest.com/ ");
		
		// click on roundtrip radiobutton
		
		String sRadioButton = "Round trip";
		
	  if(sRadioButton.equals("One-way"))
	  {
		  //oBrowser.findElement(By.id("trip-type-round-trip")).click();
		  oBrowser.findElement(By.id("trip-type-one-way")).click();
	  }
		
	  else 
	  {
		    oBrowser.findElement(By.xpath("//input[@type='radio']")).click();
	  }
		
		
		
	}
	
	
	public void searchDropbox() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh\\Desktop\\h2ksoftware\\selenium-java-3.5.3\\NewBrowserChrome\\chromedriver.exe");
		ChromeDriver oBrowser = new ChromeDriver();
		
		oBrowser.get("https://www.ebay.com/");
		
		//Select uCategory = new Select (oBrowser.findElement(By.id("gh-cat")));
		
		//WebElement uCategoryobj = oBrowser.findElement(By.id("gh-cat"));
		WebElement uCategoryobj = oBrowser.findElement(By.tagName("Select"));
		Select uCategory = new Select(uCategoryobj);
		
		uCategory .selectByVisibleText("Books");
		
		Thread.sleep(3000);
		
		uCategory.selectByIndex(1);
		
		Thread.sleep(3000);
		uCategory.selectByValue("2984");
		
		
	}// end method 


	
	
	
}// end class

