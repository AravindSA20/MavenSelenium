package webHandlingSolutions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrameDemo {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
	
		//top frame --> left frame
		//driver.switchTo().frame("frame-top");
		//driver.switchTo().frame(0);
		
		//left frame
		//driver.switchTo().frame("frame-left");
		driver.switchTo().frame(0).switchTo().frame("frame-top");   //Single line top to left frame
		String text1=driver.findElement(By.xpath("//body[normalize-space()='LEFT']")).getText();
		System.out.println("Left Frame Text: "+text1);
		System.out.println("----Left Frame Page Source----");
		System.out.println(driver.getPageSource());
		
		System.out.println("------------------------------");
		
		//To comeback to Top Frame
		driver.switchTo().defaultContent(); //defaultContent() -Selects either the first frame on the page, or the main document when a page containsiframes. 
		
		//Top Frame-->Middle Frame
		driver.switchTo().frame(0); // Top
		driver.switchTo().frame("frame-middle");
		String text2=driver.findElement(By.id("content")).getText();
		System.out.println("Middle Frame Text: "+text2);
		
		System.out.println("------------------------------");
		
		//To comeback to Top Frame
		driver.switchTo().defaultContent();  
		
		//Top frame to Right frame
		driver.switchTo().frame(0).switchTo().frame("frame-right");
		System.out.println("----Right Frame Page Source----");
		System.out.println(driver.getPageSource());

		System.out.println("------------------------------");
		
		//To Bottom frame
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		System.out.println("---Page Source for Bottom frame---");
		System.out.println(driver.getPageSource());
		
	}
}
