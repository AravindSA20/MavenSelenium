package webScenarios;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdown {
//  3. Write a WebDriver script to handle a dropdown and select an option based on specific criteria.
	public static void main(String[] args) throws InterruptedException {
		// Creating a session
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");

		WebElement ele=driver.findElement(By.name("url"));
		Select dd=new Select(ele);
		System.out.println("Is Dropdown supports multiple selection? : "+dd.isMultiple());
		
		dd.selectByIndex(3);
		Thread.sleep(2000);
		dd.selectByValue("search-alias=electronics");
		Thread.sleep(2000);
		dd.selectByVisibleText("Movies & TV Shows");
		
		List<WebElement> allOptions=dd.getOptions();
		System.out.println("Total Options are: "+allOptions.size());
	}
}