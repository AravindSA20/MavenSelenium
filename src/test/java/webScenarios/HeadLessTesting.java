package webScenarios;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessTesting {
	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--headless");  //Run in headless mode, i.e., without a UI or display server dependencies)
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		System.out.println("Google Application opening!");
		
		driver.findElement(By.cssSelector("textarea#APjFqb")).sendKeys("Lionel Messi");
		System.out.println("In searchbox, Messi is searched");
		
		//Lionel messi suggetions in Google search 
		List<WebElement> list1=driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
		System.out.println("Total Suggetions displayed are: "+list1.size());
		System.out.println("Capturing the list of suggetions!");
		
		for(WebElement i:list1)
		{
			System.out.println(i.getText());
		}
	}

}
