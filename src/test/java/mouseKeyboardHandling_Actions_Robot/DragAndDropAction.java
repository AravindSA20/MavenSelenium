package mouseKeyboardHandling_Actions_Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropAction {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/#default");
		driver.manage().window().maximize();
		
		//When we right click on page, if there is view frame source, there are iframes in the page
		
		//Handle Frame
		driver.switchTo().frame(0);
		
		//Drag
		WebElement src=driver.findElement(By.id("draggable"));
		//Drop
		WebElement trgt=driver.findElement(By.id("droppable"));
		
		//Drag and Drop - dragAndDrop(source,target)
		Actions act=new Actions(driver);
		
		//act.clickAndHold(src).moveToElement(trgt).release().build().perform(); //manual drag and drop
		
		act.dragAndDrop(src, trgt).perform(); 
		System.out.println("Drag an Drop is performed");
		
		//When StaleException occurs, we should run the code again
	}

}
