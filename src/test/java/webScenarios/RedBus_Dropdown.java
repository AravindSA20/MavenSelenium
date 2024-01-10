package webScenarios;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RedBus_Dropdown {
	public static void main(String[] args) throws InterruptedException {
		// To stop the notifications in Chrome we use ChromeOptions
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options); // options obj should be inside ChromeDriver(options)
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.redbus.in/");

		// From
		WebElement fromele = driver.findElement(By.id("src"));
		fromele.click();
		fromele.sendKeys("ch");

		List<WebElement> fromList=driver.findElements(By.xpath("//ul[@class='sc-dnqmqq eFEVtU']//li//text[@class='placeHolderMainText']"));
		System.out.println("Total Options are: "+fromList.size());
		for(WebElement i:fromList)
		{
			System.out.println(i.getText());
			if(i.getText().contains("Ashok Pillar"))
			{
				i.click();
				break;
			}
		}
		 System.out.println("-----------------------------");
		
		// To 
		WebElement toele = driver.findElement(By.id("dest"));
		toele.click();
		toele.sendKeys("ba");

		List<WebElement> toList=driver.findElements(By.xpath("//ul[@class='sc-dnqmqq eFEVtU']//li//text[@class='placeHolderMainText']"));
		System.out.println("Total Options are: "+toList.size());
		for(WebElement i:toList)
		{
			System.out.println(i.getText());
			if(i.getText().contains("KR Puram"))
			{
				i.click();
				break;
			}
		}
		
	}
}
