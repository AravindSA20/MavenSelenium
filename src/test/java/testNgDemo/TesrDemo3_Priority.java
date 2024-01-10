package testNgDemo;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TesrDemo3_Priority {
  @Test(priority=1,description="This is First Test Case")
  public void registerTest() {
	  System.out.println("This is Registeration test");
  }
  
  @Test(priority=2,description="This is Second Test Case")
  public void loginTest() {
	  System.out.println("This is Login test");
  }
  
  @Test(priority=3,description="This is Third Test Case")
  public void searchProductTest() {
	  System.out.println("This is Search Product test");
  }
  
  @Test(priority=4,description="This is Fourth Test Case")
  public void addToCartTest() {
	  System.out.println("This is Add to Cart test");
  }
}
