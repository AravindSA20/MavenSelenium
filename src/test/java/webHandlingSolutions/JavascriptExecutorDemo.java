package webHandlingSolutions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorDemo {
	public static void scrollDown(WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.scrollHeight)");
	}
	
	public static void scrollUp(WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(document.scrollHeight,0)");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		
		/*
		 * JavascriptExecutor is an interface in selenium used to handle javascript events
		 */
		
		//Creating an alert
		JavascriptExecutor js=(JavascriptExecutor) driver; //add typcasting and import JavascriptExecutor
		js.executeScript("alert('Lionel Messi is better than Ronaldo')");

		
		
		//Handle alert
		Alert alt1=driver.switchTo().alert();
		System.out.println("Alert is: "+alt1.getText());
		alt1.accept();
		
		/*
		 * To get title of a page , there are two ways:
		  1. getTitle()
		  2. Using JavascriptExecutor
		 */
		
		//Get Title
		System.out.println(driver.getTitle());
		String title=js.executeScript("return document.title").toString();
		System.out.println("Title of the Page: "+title);
		 Thread.sleep(2000);
		//Scroll
	//	js.executeAsyncScript("window.scrollTo(0,6000)");
		
		//To scroll to particular element
		 WebElement ele=driver.findElement(By.xpath("(//h2[@class='a-color-base headline truncate-2line'])[16]"));
		 js.executeScript("arguments[0].scrollIntoView()",ele);
		 System.out.println("Page scrolled til the Selected element");
		 
	/*	//To scroll end and top of page
		scrollDown(driver);
		System.out.println("Page scroll down is done!");
		Thread.sleep(2000);
		scrollUp(driver);
		System.out.println("Page Scroll Up is done");
		*/
		
	}
}
