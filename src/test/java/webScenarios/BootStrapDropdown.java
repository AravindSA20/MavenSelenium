package webScenarios;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDropdown {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.w3schools.com/bootstrap/bootstrap_dropdowns.asp");
		
		driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
		
		List<WebElement> dd=driver.findElements(By.xpath("//ul[@aria-labelledby='menu1']//li//a"));
		System.out.println("Total Options are: "+dd.size());
		
		 for(WebElement i:dd)
		 {
			 System.out.println(i.getText());
		 }
		
	}

}
