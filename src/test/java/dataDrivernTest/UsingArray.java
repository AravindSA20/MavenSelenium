package dataDrivernTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class UsingArray 
{
//	@DataProvider(name="testdata1")  //DataProvider is used to achieve datadriventest by running multiple set of data multiple times 
//	public Object testData()
//	{
//		//Two dimensional array with 4 rows and 2 columns
//		Object data[][]= {{"Sanju","pswd1234"},{"Susila","test123"},{"Madhan","maaks123"},{"Raam","raamsub3"}};
//		return data;
//	}
	
	
	
  @Test(dataProvider="testdata1", dataProviderClass=CustomData.class)
  public void loginTest(String un,String pwd)
  {
	  System.out.println("Username is: "+un);
	  System.out.println("Password is:  "+pwd);
  }
  
  //If @DataProvider is available in same class then, only name is enough for test case
  //But if the provider is available in different class then, test case need one more argument i.e, dataProviderClass name
}
