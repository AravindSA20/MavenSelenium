package webHandlingSolutions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import reusableMethods.Utility;

public class AlertDemo1_RediffMail {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Utility.getScreenshot(driver);
		
		//Username
		driver.findElement(By.id("login1")).sendKeys("MitziChan");
	
		//click on signin button
		driver.findElement(By.name("proceed")).click();
		
		Thread.sleep(2000);
		
		//ALert appears for not entering password by directly clicking login button
		//UnhandledException will occur - org.openqa.selenium.UnhandledAlertException: unexpected alert open: {Alert text : Please enter your password}
		Alert alt=driver.switchTo().alert();  //Alert is an interface which should be imported
		System.out.println("Alert text is :"+alt.getText());
		alt.accept(); 
		Utility.getScreenshot(driver);
		
		// Finally entering password
		driver.findElement(By.id("password")).sendKeys("pass123");
		Utility.getScreenshot(driver);
	}

}
