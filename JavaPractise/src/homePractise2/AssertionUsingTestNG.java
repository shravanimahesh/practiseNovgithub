package homePractise2;

import java.util.logging.Level;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionUsingTestNG {
	
WebDriver oBrowser;
	
	public void openBrowser(String soBrowser,String sURL)
	{
		if(soBrowser.equals("Chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mahesh\\Desktop\\h2ksoftware\\selenium-java-3.5.3\\NewBrowserChrome\\chromedriver.exe");
		oBrowser = new ChromeDriver();
		} // end if 
		
		else if(soBrowser.equals("IE"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\Users\\Mahesh\\Desktop\\h2ksoftware\\selenium-java-3.5.3\\NewBrowserIE\\IEDriverServer.exe");
			DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
			capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, "true");
			oBrowser = new InternetExplorerDriver();
			
		}// end else if 
		
		else if(soBrowser.equals("FireFox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Mahesh\\Desktop\\h2ksoftware\\selenium-java-3.5.3\\NewBrowserFireFox\\geckodriver.exe");
			oBrowser = new FirefoxDriver();
			
		}
		
		else if(soBrowser.equals("HTMLUnitDriver"))
		{
			java.util.logging.Logger.getLogger("com.garloylesoftware.htmlunit").setLevel(Level.OFF );
			oBrowser = new HtmlUnitDriver(); 
		}
		
		oBrowser.get(sURL);
		oBrowser.manage().window().maximize();
		
	}
	
@Test
	public void eVerification()
	{
		try
		{
		openBrowser("Chrome","http://www.deal4loans.com/Contents_Calculators.php");
		Assert.assertTrue(oBrowser.findElement(By.xpath("//h1[contains(.,'EMI Calculator')]")).isDisplayed(),"Fail,EMI calculator page is not displayed");
		System.out.println("Pass,EMI Calculator page is displayed");
		
		} catch(Exception e)
		{
			System.out.println("Fail,EMI calculator page is not displayed");
		}
		
		
		oBrowser.findElement(By.id("Loan_Amount")).clear();
		oBrowser.findElement(By.id("Loan_Amount")).sendKeys("5000");
		
	    oBrowser.findElement(By.name("rate")).click();
	    	    		
		String sExpectedtextLA = "Rs. Five Thousand .";
		String sActualtextLA = oBrowser.findElement(By.id("wordloanAmount")).getText();
		
		Assert.assertTrue(sExpectedtextLA.equals(sActualtextLA),"Fail,Displayed amount is words is correct");
		
			
	
		  oBrowser.findElement(By.name("rate")).clear();
		  oBrowser.findElement(By.name("rate")).sendKeys("20");
		  
		  oBrowser.findElement(By.name("months")).clear();
          oBrowser.findElement(By.name("months")).sendKeys("5");
          
          oBrowser.findElement(By.xpath("//input[@value='Calculate']")).click();
          
          String ActualEMI = oBrowser.findElement(By.name("pay")).getAttribute("value");
          String ExpectedEMI = "1050.55";
          
          Assert.assertTrue(ActualEMI.equals(ExpectedEMI), "Pass, Displayed EMI is correct");
        
        	  System.out.println("Fail,Displayed EMI is not correct");
        
     
	}// end everification 
	


}
