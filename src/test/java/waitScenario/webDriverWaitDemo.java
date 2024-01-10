package waitScenario;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class webDriverWaitDemo {
	
	public static WebElement waitForPrecenceofElement(WebDriver driver,By loc)   //Instead of void, we used WebElement to return the obj
	{
		WebDriverWait obj=new WebDriverWait(driver,Duration.ofSeconds(5));
		return obj.until(ExpectedConditions.presenceOfElementLocated(loc)); //return type is used instad of WebElement ele=obj
	}
	
	public static WebElement waitForElementCkickable(WebDriver driver,By loc) 
	{
		WebDriverWait btnobj=new WebDriverWait(driver,Duration.ofSeconds(5));
        return btnobj.until(ExpectedConditions.elementToBeClickable(loc));	
	}
	
	public static WebElement waitForVisiblityofElement(WebDriver driver,By loc)   
	{
		WebDriverWait obj=new WebDriverWait(driver,Duration.ofSeconds(5));
		return obj.until(ExpectedConditions.visibilityOfElementLocated(loc)); 
	}
	
	public static boolean waitForUrlContains(WebDriver driver,String url)  //Boolean is used to return 
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.urlContains(url));
	}
	
	public static boolean waitForTitleContains(WebDriver driver,String title)  //Boolean is used to return 
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.titleContains(title));
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		//By
		By email=By.id("input-email");
		By password=By.name("password");
		By btn=By.xpath("//input[@type='submit']");
		
		boolean status=waitForUrlContains(driver, "login");
		if(status)  //if status is true execute further steps
		{
			System.out.println("URL is"+driver.getCurrentUrl());
		
		   boolean title=waitForTitleContains(driver, "Account");
		   System.out.println("Status is :"+driver.getTitle());
		
		//email 
		WebElement ele1=waitForPrecenceofElement(driver,email);
		ele1.sendKeys("test@gmail.com");
		
		//password
        waitForVisiblityofElement(driver, password).sendKeys("pass123");
		
		//button click
		WebElement ele3=waitForPrecenceofElement(driver, btn);
		ele3.click();
		
		}
		
		//Explicit Wait- WebDriverWait class
//		WebDriverWait obj=new WebDriverWait(driver,Duration.ofSeconds(5));
//		WebElement ele=obj.until(ExpectedConditions.presenceOfElementLocated(email)); //An expectation for checking that an element is present on the DOM of a page.
//		ele.sendKeys("test@gmail.com");
		
//		WebDriverWait btnobj=new WebDriverWait(driver,Duration.ofSeconds(5));
//        btnobj.until(ExpectedConditions.elementToBeClickable(btn)).click();	
	}

}
