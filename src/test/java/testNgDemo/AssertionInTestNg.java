package testNgDemo;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class AssertionInTestNg {
  @Test(priority=1)
  public void hardAssertion() // For Hard Assertion, it has static method
  {
	  String actual="Lionel Messi is the GOAT of Football";
	  
	  String expected="Leo Messi";
	  
	  //assertEquals() - case sensitive - when assertion fails it throws AssertionError
	// Assert.assertEquals(actual, expected,"Fail: Strings are not equal");
	// System.out.println("Pass: Strings are equal");
	  
	  //assertTrue()
	// Assert.assertTrue(actual.contains(expected),"Fail: Actual string contains Messi");
	// System.out.println("Actual String contains Messi");
	  
	  //assertFalse()
	  Assert.assertFalse(actual.contains(expected),"Fail: Actual String contains Leo");
	  System.out.println("Pass: Actual string doesn't contains Leo");
	  
	  System.out.println("Hard Assertion is completed!");
  }
  
  @Test(priority=2)   //To comment a test - //@Test
  public void softAssertionTest() //For Soft Assertion, we need to create object
  {
	  SoftAssert sf=new SoftAssert(); //import SoftAssert
	  
	  int a=100,b=100;
	  
	  //assertEquals()
	//  sf.assertEquals(a, b,"Fail: Numbers are not equal");
	//  System.out.println("Pass: Numbers are equal");
	
	  //assertTrue()
	  Assert.assertTrue(a==b,"Fail: Numbers are not equal");
	  System.out.println("Pass: Numbers are equal");
	  
	  sf.assertAll();     //to make test case fail in soft assertion, we use assertAll()
	  System.out.println("This is Soft Assertion test case");
  }
}
