package webHandlingSolutions;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Main Page
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		String parentId=driver.getWindowHandle();
		System.out.println(parentId);
		
		//Child Page
		Set<String> allId=driver.getWindowHandles();
		System.out.println(allId);
		
		/*
		 * Ask driver to switch based on ID
		 * If the IDs are not same, then Switch
		 */
		
		for(String childId:allId)
		{
			if(!parentId.equals(childId))
			{
				driver.switchTo().window(childId);
				//Child window
				driver.findElement(By.name("EmailHomePage")).sendKeys("test@gamil.com");
				
				Thread.sleep(2000);
				//driver.close(); // child window will be closed
				//driver.quit(); // closes all window
			}
		}
		
		//Main page
		driver.switchTo().window(parentId);
		driver.findElement(By.name("username")).sendKeys("Mitzichan");
	}

}
