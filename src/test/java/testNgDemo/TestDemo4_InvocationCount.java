package testNgDemo;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestDemo4_InvocationCount //invocationCount -To run a test case multiple number of time
{
  @Test(priority=1)
  public void enrollForTheCourse() {
	  System.out.println("Student enrolls for the course");
  }
  
  @Test(priority=2)
  public void training() {
	  System.out.println("Student gets the training for the course");
  }
  
  @Test(priority=3,invocationCount=3) // Test case will run 3 times , test runs=3
  public void placementCall() {
	  System.out.println("Student get the Placements for the course");
  }
}
