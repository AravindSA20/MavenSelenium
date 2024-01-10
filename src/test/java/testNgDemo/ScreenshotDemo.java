package testNgDemo;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class ScreenshotDemo 
{
// 5. Write a WebDriver script to capture a screenshot of a web page and save it to a specific location
  @Test
  public void capture() throws IOException
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.manage().window().maximize();
	  driver.get("https://messi.com/en/");
	  
	  TakesScreenshot ts=(TakesScreenshot) driver; //add type casting
	  File temp=ts.getScreenshotAs(OutputType.FILE);
	  
	  //Location
	  File dest=new File("./"+"\\Screenshots\\Fifa.png");
	  
	  FileHandler.copy(temp,dest);
  }
}
