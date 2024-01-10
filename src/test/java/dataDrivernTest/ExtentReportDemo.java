package dataDrivernTest;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportDemo {
  @Test
  public void reportTest()
  {
	  //Create ExtentReport instance
	  ExtentReports extent=new ExtentReports();
	  
	  //Using reporter we can add path  - it will create folder automatically
	  ExtentSparkReporter spark = new ExtentSparkReporter("Reports/Automation.html");
	  
	  //setup any configuration
	  spark.config().setDocumentTitle("Sprint1 report");
	  spark.config().setReportName("Automation Testing Report");
	  spark.config().setTheme(Theme.DARK);
	  
	  //attach the report
	  extent.attachReporter(spark);
	  
	  //Create a test - ExtentTest
	  ExtentTest test=extent.createTest("Test1");
	  
	  //logs
	  test.pass("Test case is Pass!");
	  test.fail("Test case is Fail!");
	  test.info("Test is in progress");
	  test.skip("Test case is skipped");
	  
	 // test.log(Status.PASS, "Test is pass!");
	  
	  //exit from report
	  extent.flush();
  }
}
