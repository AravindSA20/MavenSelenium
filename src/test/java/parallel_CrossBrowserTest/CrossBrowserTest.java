package parallel_CrossBrowserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTest {
	 //Create a xml file for this test, insert a parameter with name="bname" and value to which browser to be opened
	//To do cross browser testing, in xml file, change name of each test
	//The tests will run in a sequence in the order or tests written in testng suite -CrossBrowser testing
	//Inorder to run every test in parallel, type parallel="tests" inside the suite - Parallel Execution
	public WebDriver driver;
	
	@Parameters({"bname"})
  @Test
  public void browserTest(String bname)
  {
	  if(bname.equalsIgnoreCase("chrome"))
	  {
		  driver=new ChromeDriver();
	  }
	  else if(bname.equalsIgnoreCase("firefox"))
	  {
		  driver=new FirefoxDriver();
	  }
	  else if(bname.equalsIgnoreCase("edge"))
	  {
		  driver=new EdgeDriver();
	  }
	  
	  driver.get("https://www.amazon.in");
  }
}
