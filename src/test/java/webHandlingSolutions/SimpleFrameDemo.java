package webHandlingSolutions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleFrameDemo {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/iframe");
		
		//HAndling a Frame using index
		//driver.switchTo().frame(0);
		
		//Handling Frame using id/name
		//driver.switchTo().frame("mce_0_ifr");
		
		//Handling Frame using WebElement
		WebElement frameId=driver.findElement(By.id("mce_0_ifr"));
		driver.switchTo().frame(frameId);
		
		//Element is inside a frame
		WebElement ele=driver.findElement(By.id("tinymce"));
		ele.clear();
		ele.sendKeys("Lionel Messi won the World cup");
		
	}
}
