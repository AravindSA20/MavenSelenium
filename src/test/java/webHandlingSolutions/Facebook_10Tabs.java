package webHandlingSolutions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_10Tabs {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.getTitle();
		for(int i=1;i<10;i++)
		{
			WebDriver driver2=driver.switchTo().newWindow(WindowType.TAB);
			driver2.get("https://www.facebook.com/");
			System.out.println("Title is: "+driver2.getTitle());
		}
	}
}
