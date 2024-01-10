package pageObjectModelPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage   //Contains Locators and Methods(Actions)
{
	//Encapsulation=Data+Function
	private WebDriver driver;

	//Initialize  Driver
	public LoginPage(WebDriver driver) //BaseClass driver
	{
		this.driver=driver;  //To overcome NullPointerException because "this.driver" is null
	}
	//Locators
	private By user=By.name("username");
	private By pwd=By.name("password");
	private By loginbtn=By.className("oxd-button");
	
	//public methods - Actions
	public void doLogin(String username,String password)
	{
		driver.findElement(user).sendKeys(username);
		driver.findElement(pwd).sendKeys(password);
		driver.findElement(loginbtn).click();
	}
	
	public String getUrl()
	{
		return driver.getCurrentUrl();
	}
	
	public String getAppTitle()
	{
		return driver.getTitle();
	}
}
