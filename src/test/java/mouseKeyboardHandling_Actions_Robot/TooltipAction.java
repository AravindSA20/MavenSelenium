package mouseKeyboardHandling_Actions_Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TooltipAction {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/tooltip/");
		
		//Handle Frame
		driver.switchTo().frame(0);
		WebElement ele=driver.findElement(By.id("age"));
		
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
		
		//To capture the tooltip, inspect--> go to sources and pause in debug --> Cntrl+\ after paused, we can go to elements and webelement of tooltip is found 
		String tooltip=driver.findElement(By.className("ui-tooltip-content")).getText();
	    System.out.println("Tooltip displayed is: "+tooltip);
	}

}
