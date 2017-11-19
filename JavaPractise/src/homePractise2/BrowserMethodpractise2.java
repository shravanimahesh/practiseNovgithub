package homePractise2;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethodpractise2 
{
	@Test
	public void browserMethod()
	{
	// open chrome browser
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh\\Desktop\\h2ksoftware\\selenium-java-3.5.3\\NewBrowserChrome\\chromedriver.exe");
			ChromeDriver oBrowser = new ChromeDriver();
			//oBrowser.manage().window().maximize();
			
			// launch website 
			oBrowser.navigate().to("https://www.ebay.com/");
			//System.out.println(oBrowser.getTitle());
			
			
			// search textbox write "laptop"
			
			oBrowser.findElement(By.id("gh-ac")).clear();
			//oBrowser.findElement(By.id("gh-ac")).sendKeys("Laptop");
			oBrowser.findElement(By.xpath("//input[@type='text']")).sendKeys("Laptop");;
					
			// click on "SEARCH" BUTTON 
			
			oBrowser.findElement(By.id("gh-btn")).click();
			
			//oBrowser.navigate().back();
			//oBrowser.navigate().forward();
			//System.out.println(oBrowser.getCurrentUrl());
			
			//oBrowser.close();
			oBrowser.quit();
			
	}

}
