package qa.demo.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import qa.demo.BrowserInfo.BrowserData;
import qa.demo.page.Login_Class;

public class BaseClass {
	
	public WebDriver driver;
	BrowserData bd;
	protected Login_Class lc;
// contains Before and After methods information ->
	// Browser is called, Page References
	
	@BeforeTest
	public void setUp()
	{
		bd = new BrowserData();
		driver = bd.intiDriver("chrome");
		lc = new Login_Class(driver);
		
	}

	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}


}
