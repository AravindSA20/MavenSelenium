package realTimeAnnotationUse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CRMTestDemo {
  @Test
  public void crmTest()
  {
	  WebDriver driver=new ChromeDriver();
		driver.get("https://automationplayground.com/crm");
		
		//Clicking Sign In button
		driver.findElement(By.id("SignIn")).click();
		
		//Login
		driver.findElement(By.name("email-name")).sendKeys("mitzi@gmail.com");
		driver.findElement(By.id("password")).sendKeys("hi123");
		driver.findElement(By.id("submit-id")).click();
		
		//close
		driver.close();
  }
}
