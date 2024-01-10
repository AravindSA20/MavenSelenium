package testNgDemo;

import org.testng.annotations.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class GoogleTitleValidation {
  @Test
  public void titleValidation() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.google.com/");
	  
	  String actTitle=driver.getTitle();
	  Assert.assertEquals(actTitle, "Google","Fail: Title is not matched!");
	  System.out.println("Pass: Title matched!");
  }
}
