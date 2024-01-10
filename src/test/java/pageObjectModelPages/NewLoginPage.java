package pageObjectModelPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewLoginPage
{
	private WebDriver driver;
	
	//Initialize Driver
	public NewLoginPage(WebDriver driver) //Base class
	{
		this.driver=driver;
	}
	
	//Locators
	private @FindBy(name="username")
			WebElement user;
	private @FindBy(name="password")
	        WebElement pwd;
	private @FindBy(xpath="//button[@type='submit']")
			WebElement btn;
	
	//Actions
	public String getUrl()
	{
		return driver.getCurrentUrl();
	}
	
	public String getAppTitle()
	{
		return driver.getTitle();
	}
	
	public void doLogin(String username,String password)
	{
		user.sendKeys(username);
		pwd.sendKeys(password);
		btn.click();
	}
}
