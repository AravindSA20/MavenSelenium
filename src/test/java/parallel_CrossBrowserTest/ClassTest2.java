package parallel_CrossBrowserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ClassTest2 {
	//To run all the testcases in parallel, create a XML file and type parallel='classes' inside the suite
	 @Test
	  public void firefoxTest() {
		  WebDriver driver=new FirefoxDriver();
		  driver.get("https://www.facebook.com/");
		  System.out.println("Title is: "+driver.getTitle());  
	  }
	  
}
