package parallel_CrossBrowserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ClassTest1 {
	//To run all the testcases in parallel, create a XML file and type parallel='classes' inside the suite 
	@Test
	  public void chromeTest() {
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.google.com/");
		  System.out.println("Title is: "+driver.getTitle());  
	  }

}
