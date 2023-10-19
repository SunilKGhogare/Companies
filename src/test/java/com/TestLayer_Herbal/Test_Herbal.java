package com.TestLayer_Herbal;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.TestBase_Herbal.TestBase_Herbal;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_Herbal extends TestBase_Herbal{
	
	@Test(enabled = false)
	public void VerifyMainLogo() 
	{
		WebElement MainLogo = driver.findElement(By.xpath("//img[@src='/SharedUI/images/logo-colored.png']"));
		boolean Display1 = MainLogo.isDisplayed();
		System.out.println("Main Logo of Our Application is Displayed or Not result is :- "+Display1);
		
		boolean Display2 = MainLogo.isEnabled();
		System.out.println("Main Logo of Our Application is Displayed is enable or not :- "+Display2);
	}
	
	@Test(enabled = false)
	public void LanguageSelection() 
	{
		WebElement LangSelection = driver.findElement(By.xpath("//a[@class='capitalize locales-toggle-link']"));
		WebElement LangSelectionArrow = driver.findElement(By.xpath("class=\"icon-chevron-down\""));
		boolean Arrow1 = LangSelection.isDisplayed();
		System.out.println("Language Selection Arrow is Displayed or not :- "+Arrow1);
		
		
	}
	@Test(enabled = false)
	public void SignInOrCreateLink() 
	{
		WebElement SignIn = driver.findElement(By.xpath("(//a[@class='btnForward full-width'])[1]"));
		SignIn.click();
		System.out.println("Sign is button Clicked and  check it");
	
		
	}
	
	@Test(enabled = false)
	public void CreateAccount() throws InterruptedException 
	{
		WebElement SignIn = driver.findElement(By.xpath("(//a[@class='btnForward full-width'])[1]"));
		SignIn.click();
		System.out.println("Sign is button Clicked and  check it");
		
		Thread.sleep(2000);
		
		//JavascriptExecutor j = ((JavascriptExecutor)driver);
		
		driver.findElement(By.xpath("xpath")).sendKeys(Keys.PAGE_DOWN);
	
		
	}
	@Test(enabled = false)
	public void applyOnline() 
	{
		WebElement applyOnlineButton = driver.findElement(By.xpath("(//a[@class='btnForward full-width'])[2]"));
		applyOnlineButton.click();
		System.out.println("Apply online button is successfully working");
	}
	@Test
	public void PrivacyPolicyHyperLink() 
	{
		WebElement privacy = driver.findElement(By.xpath("(//a[@class='header-links'])[1]"));
		privacy.click();
	}
	
	@Test
	public void TermOfUse() 
	{
		WebElement TermOfUse = driver.findElement(By.xpath("(//a[@class='header-links'])[2]"));
		TermOfUse.click();
		
	}
	@Test
	public void VisibleText1() 
	{
		WebElement VisibleText = driver.findElement(By.xpath("(//h3)[1]"));
		String MText = VisibleText.getText();
		System.out.println("Visible Text Output is :- " + MText);
	}
	
	@Test
	public void VisibleText2() 
	{
		WebElement VisibleText = driver.findElement(By.xpath("(//h3)[1]"));
		String MText = VisibleText.getText();
		System.out.println("Visible Text Output is :- " + MText);
	}
	
	
	
	
	
	
	
	
	
	
//	public static void main(String [] args) throws InterruptedException 
//	{
//		Test_Herbal A = new Test_Herbal();
//		A.SetUp();
//	}
//	
//	
//	public static WebDriver driver;
//	
//	
//	@BeforeMethod
//	public void SetUp() throws InterruptedException 
//	{
//		String browser = "Chrome";
//		if(browser.equalsIgnoreCase("chrome")) 
//		{
//			WebDriverManager.chromedriver().setup();
//			driver = new ChromeDriver();
//		}
//		
//		else if(browser.equalsIgnoreCase("Firefox")) 
//		{
//			WebDriverManager.firefoxdriver().setup();
//			driver = new FirefoxDriver();
//		}
//		
//		
//		else if (browser.equalsIgnoreCase("Edge")) 
//		{
//			WebDriverManager.edgedriver().setup();
//			driver = new EdgeDriver();
//		}
//		
//		else 
//		{
//			System.out.println("Please provide Valid Browser Details");
//		}
//		
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		Thread.sleep(3000);
//		driver.get("https://www.myherbalife.com/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		
//		
//	}


}
