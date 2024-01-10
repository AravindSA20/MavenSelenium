package webScenarios;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnSpecificLink {
//  1. Write a WebDriver script to navigate to a website and click on a specific link.
	public static void main(String[] args){
		// Creating a session
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://www.cristianoronaldo.com/#cr7");
		System.out.println("Tite of Page 1: "+driver.getTitle());
		
		// Navigating from CristianoRonaldo website --> LionelMessi website
		driver.navigate().to("https://messi.com/en/");
		System.out.println("Tite of Page 2: "+driver.getTitle());
		
		// Clicking on a specific link - Adidas website
		driver.findElement(By.xpath("//a[@href='https://www.adidas.es/']")).click();
	}
}
