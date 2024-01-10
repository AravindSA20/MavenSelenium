package testNgDemo;

import org.testng.annotations.Test;

import org.testng.Assert;


public class TestDependsOnMethod {
  @Test(priority=1)
  public void register() 
  {
	  System.out.println("User must be registered");
	  boolean status=false;
	  Assert.assertTrue(status); 
	//When status is false, user cant login and the result is runs:2 ,failure=1 and skips=1
  }
  
  @Test(priority=2,dependsOnMethods="register")
  public void login() 
  {
	  System.out.println("After registration user can login");
  }
}
