package testNgDemo;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestDisableExecution {
  @Test
  public void testcase1() 
  {
	  System.out.println("This is test case 1");
  }
  
  @Test
  public void testcase2() 
  {
	  System.out.println("This is test case 2");
  }
  //Method 1: To disable a method,Using xml file, we can use exclude/include a testcase
  
  @Test(enabled=false) //Method 2: using enable, This will disable the testcase3 without deleting the code
  public void testcase3() 
  {
	  System.out.println("This is test case 3");
  }
  
  @Test
  public void testcase4() 
  {
	  System.out.println("This is test case 4");
  }
}
