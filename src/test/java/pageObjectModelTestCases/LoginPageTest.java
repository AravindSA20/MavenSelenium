package pageObjectModelTestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjectModelPages.LoginPage;

public class LoginPageTest extends BaseClass //This test case is executable
{
  @Test(priority=1)
  public void verifyUrl() 
  {
	  //importing LoginPage from pageObjectModelPages
	  String url=lp.getUrl();
	  Assert.assertTrue(url.contains("hrmlive"),"URL is invalid");
	  System.out.println("URL is valid: "+url);
  }
  
  @Test(priority=2)
  public void verifyTitle() 
  {
	  String title=lp.getAppTitle();
	  Assert.assertTrue(title.contains("OrangeHRM"), "Title is not matched");
	  System.out.println("Title is matched");
  }
  
  @Test(priority=3)
  public void verifylogin() 
  {
	  lp.doLogin("Admin", "admin123");
	  Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"),"Login not completed");
	  System.out.println("Login Completed");
  }
}
