package realTimeAnnotationUse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CRMTestCases extends BaseClass //Inheritance used
{
	@Test(priority = 1)
	public void signInLinkValidation()
	{
		driver.findElement(By.id("SignIn")).click();
	}

	@Test(priority = 2)
	public void loginValidation() 
	{
		driver.findElement(By.name("email-name")).sendKeys("mitzi@gmail.com");
		driver.findElement(By.id("password")).sendKeys("hi123");
		driver.findElement(By.id("submit-id")).click();
		
		//Validation
		Assert.assertTrue(driver.getCurrentUrl().contains("customers"));  //Customer page
		System.out.println("Login Completed");
	}
	
	
	
}
