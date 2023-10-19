package com.TestBase_Herbal;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase_Herbal {
	
//	public static void main(String [] args) throws InterruptedException 
//	{
//		TestBase_Herbal A = new TestBase_Herbal();
//		A.SetUp();
//	}
	
	
	public static WebDriver driver;
	
	
	@BeforeMethod
	public void SetUp() throws InterruptedException 
	{
		
		//System.setProperty(null, null)
		String browser = "Chrome";
		if(browser.equalsIgnoreCase("Chrome")) 
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		
		else if(browser.equalsIgnoreCase("Firefox")) 
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
		
		else if (browser.equalsIgnoreCase("Edge")) 
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		
		else 
		{
			System.out.println("Please provide Valid Browser Details");
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(3000);
		driver.get("https://www.myherbalife.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
	}
	
	
	@AfterMethod
	public void CloseBrowser() throws InterruptedException 
	{
		Thread.sleep(5000);
		driver.quit();;
	}

}
