package homepractise;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSWD {
	
	
	public void searchItem()
	{
	// open chrome browser
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mahesh\\Desktop\\h2ksoftware\\selenium-java-3.5.3\\NewBrowserChrome\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	
	// open www.ebay.com
	driver.get("https://www.ebay.com/");
	
	// find textbox and enter "Laptop"
	
	driver.findElement(By.id("gh-ac")).clear();
	driver.findElement(By.id("gh-ac")).sendKeys("Laptop");

	// click on search button 
	driver.findElement(By.id("gh-btn")).click();

}// end methid searchItem
	
	
	public void handlingLink()
	{
		// open chrome browser
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mahesh\\Desktop\\h2ksoftware\\selenium-java-3.5.3\\NewBrowserChrome\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		// open www.ebay.com
		driver.get("https://www.ebay.com/");
		
		// find Advanced link and click on it
		
		driver.findElement(By.id("gh-as-a")).click();
		
				
	}// end method handlingLink
	
	
	public void handlingCheckbox()
	{
		
		// open chrome browser
		
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mahesh\\Desktop\\h2ksoftware\\selenium-java-3.5.3\\NewBrowserChrome\\chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();
				
				// open www.ebay.com
				driver.get("https://www.ebay.com/");
				
				// find Advanced link and click on it
				
				WebElement D1 = driver.findElement(By.id("gh-as-a"));
				D1.click();
								
				// find checkbox
				
				driver.findElement(By.id("LH_TitleDesc"));
				
				if (!(driver.findElement(By.id("LH_TitleDesc")).isSelected()))
				{
					driver.findElement(By.id("LH_TitleDesc")).click();
				}// end if 
				
		
	}// end method handlingCheckbox
	
	@Test
	public void handlingRadiobutton()
	{
		// open chrome browser
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mahesh\\Desktop\\h2ksoftware\\selenium-java-3.5.3\\NewBrowserChrome\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		// open https://www.southwest.com
		driver.get("https://www.southwest.com/");
		
		// find RoundTrip
		
		String oRoundTrip = "Round trip";
		
		if( oRoundTrip.equals("Round trip"))
		{
			
			driver.findElement(By.id("trip-type-one-way")).click();
			
		}// end if 
		
		else
		{
			
			driver.findElement(By.id("trip-type-round-trip")).click();
			
		}// end else

	}
	
	
}// end class FirstSWD

	
