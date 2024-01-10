package webHandlingSolutions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo2_Herokuapp {
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//Alert 1
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Thread.sleep(2000);
		Alert alt1=driver.switchTo().alert();
		System.out.println("Text of the First Alert is : "+alt1.getText());
		alt1.accept();
		WebElement result1=driver.findElement(By.id("result"));
		System.out.println("Result of Alert 1 is : "+result1.getText());
		
		//Alert 2
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Thread.sleep(2000);
		Alert alt2=driver.switchTo().alert();
		System.out.println("Text of the Second Alert is : "+alt2.getText());
		alt2.dismiss();
		WebElement result2=driver.findElement(By.id("result"));
		System.out.println("Result of Alert 2 is : "+result2.getText());
		
		//Alert 3
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Thread.sleep(2000);
		Alert alt3=driver.switchTo().alert();
		System.out.println("Text of the Third Alert is : "+alt3.getText());
		alt3.sendKeys("Hello Everyone!");
		alt3.accept();
		WebElement result3=driver.findElement(By.id("result"));
		System.out.println("Result of Alert 3 is : "+result3.getText());
	}
}
