package qa.demo.BrowserInfo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserData {

// Main driver invocation, and then calling the required browser.
	
	public WebDriver driver;
  
	public WebDriver intiDriver(String browserName)
	{
		if(browserName.equalsIgnoreCase("chrome"))
	        {
		         driver = new ChromeDriver();
	        }
		if(browserName.equalsIgnoreCase("firefox"))
				{
			       driver = new FirefoxDriver();
				}
	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		return driver;
		
	
	}

}
