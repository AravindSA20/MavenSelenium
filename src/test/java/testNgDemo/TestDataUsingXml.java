package testNgDemo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestDataUsingXml {
  @Parameters({"un","pswd"})
  @Test
  public void loginTest(String un,String pswd)
  {
	  System.out.println("User Name is: "+un);
	  System.out.println("Password is: "+pswd);
  }
}
