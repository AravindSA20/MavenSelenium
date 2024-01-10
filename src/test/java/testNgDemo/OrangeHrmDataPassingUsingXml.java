package testNgDemo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHrmDataPassingUsingXml 
{
	//Run test from XML file only
	@Parameters({"un","pwd"})  //import from TesNg
  @Test
  public void loginTest(String un,String pwd)
  {
	  WebDriver driver=new ChromeDriver();
		//Global Wait - always add after driver
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//User Name
		driver.findElement(By.name("username")).sendKeys(un);

		//Password
		driver.findElement(By.name("password")).sendKeys(pwd);
		
		//Clicking Sign In
		driver.findElement(By.className("oxd-button")).click();
		
		//Validation
		Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"),"Login not completed!");
		System.out.println("Login Completed!");
  }
}
