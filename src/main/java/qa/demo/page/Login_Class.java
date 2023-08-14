package qa.demo.page;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Class {
	
	private WebDriver driver;
	
// Template - Private webdriver,  Locators, Page Constructor, Page Actions
	
	private By email = By.xpath("//input[@id=\"input-email\"]");
	private By pass = By.xpath("//input[@id=\"input-password\"]");
	private By login = By.xpath("//input[@type=\"submit\"]]");
	
	

	public Login_Class(WebDriver driver) {
		
		this.driver=driver;
	}
	
	public List<String> login_SubSections()
	{
		
		List<WebElement> subheaders = driver.findElements(By.xpath("//a[@class=\"list-group-item\"]"));
		
	    List<String> sideHeader = new ArrayList();
	    
		for(WebElement s: subheaders)
		{
			 sideHeader.add(s.getText());
		}

		return sideHeader;
	}
	
	public void login(String username, String password) throws InterruptedException
	{
		
		driver.findElement(email).sendKeys("vamsi@gmail.com");
		driver.findElement(pass).sendKeys("automation");
		Thread.sleep(5000);
		driver.findElement(login).click();
	
	}

}
