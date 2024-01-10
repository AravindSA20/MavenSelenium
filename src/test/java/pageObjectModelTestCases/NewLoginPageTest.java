
package pageObjectModelTestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjectModelPages.NewLoginPage;

public class NewLoginPageTest extends BaseClass
{
	@Test(priority=1)
	public void verifyUrl()
	{
		System.out.println(np.getUrl());
	}
	
  @Test(priority=2)
  public void verifyLogin() 
  {
	//NewLoginPage np=PageFactory.initElements(driver, NewLoginPage.class); 
	np.doLogin("Admin", "pwd123");
  }
}
