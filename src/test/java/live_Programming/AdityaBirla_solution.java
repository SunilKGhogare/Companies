package live_Programming;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdityaBirla_solution {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException 
	{
		String browser= "Chrome";
		
		if(browser.equalsIgnoreCase("Chrome")) 
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.hdfcbank.com/");
		
		Thread.sleep(3000);
		
		driver.switchTo().alert();
		
		driver.switchTo().alert().dismiss();
		
		
	}

}
