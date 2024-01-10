package webScenarios;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import reusableMethods.Utility;

public class GobiboFromTo {
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.goibibo.com/flights/");
		driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();

		// From
		driver.findElement(By.xpath("(//p[@class='sc-12foipm-20 bhnHeQ'])[1]")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("barc");
		Utility.gobibo(driver, "Madrid, Spain");
		
		System.out.println("------------------------------");
		
		// To
     	driver.findElement(By.xpath("//span[text()='To']//following-sibling::input")).sendKeys("mu");
		Utility.gobibo(driver, "Munich, Germany");
	}
}
