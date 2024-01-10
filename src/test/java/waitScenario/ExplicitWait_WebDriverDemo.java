package waitScenario;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import reusableMethods.Utility;

public class ExplicitWait_WebDriverDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //Implicit Wait 
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");

		//By locator
		By btn=By.xpath("//button[text()='Start']");
		By text=By.xpath("(//h4)[2]");
		
		Utility.waitForElementClickable(driver, btn).click();
		WebElement ele=Utility.waitForVisiblityofElement(driver, text);
		System.out.println("Text is :"+ele.getText());
	}

}
