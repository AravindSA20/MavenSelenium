package testNgDemo;

import org.testng.annotations.*; 
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationDemo {
  @Test(priority=1)
  public void registerTest()
  {
	  System.out.println("This is Register Test!");
  }
  
  @Test(priority=2)
  public void loginTest()
  {
	  System.out.println("This is Login Test!");
  }
  
  @Test(priority=3)
  public void logoutTest()
  {
	  System.out.println("This is Logout Test!");
  }
  
  //Annotations - This anotations wont be calculated in console
  @BeforeMethod
  public void bMethod()
  {
	  System.out.println("BeforeMethod executes before every test case!");
  }
  @AfterMethod
  public void aMethod()
  {
	  System.out.println("AfterMethod executes after every test case!");
  }
  
  
  @BeforeClass
  public void bClass() {
	  System.out.println("BeforeClass executes before only first test case!");
  }
  @AfterClass
  public void aClass() {
	  System.out.println("AfterClass executes after only last test case!");
  }
  
  
  @BeforeTest
  public void bTest()
  {
	  System.out.println("BeforeTest will run before class / All classes!");
  }
  @AfterTest
  public void aTest()
  {
	  System.out.println("AfterTest will run after class / All classes!");
  }
  
  
  @BeforeSuite
  public  void bSuite()
  {
	  System.out.println("BeforeSuite will run before Test!");
  }
  @AfterSuite
  public void aSuite()
  {
	  System.out.println("AfterSuite will run after Test!");
  }
}
