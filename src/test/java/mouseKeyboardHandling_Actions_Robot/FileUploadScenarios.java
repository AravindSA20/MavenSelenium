package mouseKeyboardHandling_Actions_Robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadScenarios {

	public static void main(String[] args) throws AWTException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		
		//Path of a file
        String path="C:\\Users\\aravi\\Pictures\\Screenshots\\Employee Class.png";
        //When there is no type="file", we can't automate it
        
        //Upoading a file using sendKeys()
//        driver.findElement(By.id("file-upload")).sendKeys(path);
  
        //Clicking on the upload button
//       driver.findElement(By.id("file-submit")).click();
	
        
        //Using Robot class
        //Transferable File name declaration
        StringSelection contents=new StringSelection(path);
        
        //Getting toolkit
        Toolkit toolkit=Toolkit.getDefaultToolkit();
        
        //Getting clipboard as file upload window
        Clipboard clipBoard=toolkit.getSystemClipboard();
        
        //Copying sting file name to the file upload window
        clipBoard.setContents(contents,null);
	
        //failed click()
        //driver.findElement(By.id("file-upload")).click();
        
        //Using Actions, we click file upload
        WebElement ele=driver.findElement(By.id("file-upload"));
        
        Actions act=new Actions(driver);
        act.moveToElement(ele).click().build().perform();
        
        //Cntrl+V
        Robot rt=new Robot();
        rt.delay(2000);
        
        rt.keyPress(KeyEvent.VK_CONTROL);
        rt.keyPress(KeyEvent.VK_V);
        rt.keyRelease(KeyEvent.VK_CONTROL);
        rt.keyRelease(KeyEvent.VK_V);
        rt.delay(2000);
        
        rt.keyPress(KeyEvent.VK_ENTER);
        rt.keyRelease(KeyEvent.VK_ENTER);

        //Clicking on the upload button
       driver.findElement(By.id("file-submit")).click();
	}

}
