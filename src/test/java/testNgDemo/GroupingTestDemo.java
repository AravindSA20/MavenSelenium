package testNgDemo;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class GroupingTestDemo {
  @Test(priority=1,groups = "SmokeTest")
  public void verifyUrl() 
  {
	  System.out.println("URL Test: This is smoke test case");
  }
  
  @Test(priority=2,groups = "SmokeTest")
  public void verifylink() 
  {
	  System.out.println("Link Test: This is smoke test case");
  }
  
  @Test(priority=3,groups = "FunctionalTest")
  public void verifylogin() 
  {
	  System.out.println("Login Test: This is functional test case");
  }
  
  @Test(priority=4,groups = "FunctionalTest")
  public void verifyTitle() 
  {
	  System.out.println("Title test: This is functional test case");
  }
  
  @Test(priority=5,groups = "FunctionalTest")
  public void verifylogot() 
  {
	  System.out.println("Logout test: This is functional test case");
  }
  
}
