package webScenarios;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import reusableMethods.Utility;

public class Facebook_Dropdown {
	

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Facebook Login page --> Create Account using Reusable method
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		//Day dropdown
		WebElement day=driver.findElement(By.name("birthday_day"));
		Utility.selectBasedDropdown(day,"20");
		
		//Month dropdown 
		WebElement month=driver.findElement(By.name("birthday_month"));
		Utility.selectBasedDropdown(month, "Aug");
		
		//Year dropdown
		WebElement year=driver.findElement(By.name("birthday_year"));
		Utility.selectBasedDropdown(year, "1996");
		
//		Select dd=new Select(day);
//		System.out.println("Is Day dropdown selects multiple selection? :"+dd1.isMultiple()); 
//		List<WebElement> allOptions=dd.getOptions();
//		System.out.println("Total Options are: "+allOptions.size());
//		for(WebElement i:allOptions)
//		{
//			System.out.println(i.getText());
//			if(i.getText().contains(20))
//			{
//				i.click();
//				break;
//			}
		}
	}


