package testNgDemo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import reusableMethods.PropertiesUtil;

public class PropertiesFileGoogleRead {
  @Test
  public void readFile() throws IOException 
  {
	  PropertiesUtil p1=new PropertiesUtil(); //From Reusable method
	  WebDriver driver=new ChromeDriver();
	  driver.get(p1.getData("url"));
	  
	  Assert.assertTrue(driver.getTitle().contains(p1.getData("title")),"Title is not Valid!");
	  System.out.println("Title is Valid!");
	  driver.findElement(By.name(p1.getData("name"))).sendKeys(p1.getData("input"),Keys.ENTER);
	  
	  /*
	  //File
	  File f1=new File("./"+"\\config.properties");
	  
	  //Read in a stream
	  FileInputStream fs=new FileInputStream(f1);
	  
	  //Properties File
	  Properties p1=new Properties();
	  
	  p1.load(fs);
	  
	  System.out.println("URL is: "+p1.getProperty("url"));
	  System.out.println("Title is : "+p1.getProperty("title"));
	  */
  }
  
}
