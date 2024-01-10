package mouseKeyboardHandling_Actions_Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderAction {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		
		//Handle the frame
		driver.switchTo().frame(0);
		
		WebElement ele=driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
		
		//Slider -Sliding on x/y axis
		Actions act=new Actions(driver);
		//clickAndHold(src) and moveToElement(src, x-axis, y-axis)ui-slider-handle ui-corner-all ui-state-default
		act.clickAndHold(ele).moveToElement(ele, 200, 0).build().perform();
	
	}

}
