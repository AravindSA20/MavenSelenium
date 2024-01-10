package webScenarios;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import reusableMethods.Utility;

public class DropDownAutomation_Amazon {

	public static void main(String[] args) throws InterruptedException {
		// Cntrl+Shift+O --> To import WebDriver
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		System.out.println("Title is: "+driver.getTitle());
		
		//Identify Select based dropdown
		WebElement ele=driver.findElement(By.name("url"));
		
		//Select Base
		// When Dropdown is designed with <select> tag, use Select class from selenium
		Select dd=new Select(ele);
		System.out.println("Is Dropdown supports multiple selection? : "+dd.isMultiple());
		
		//Single selection - selectByIndex(), selectByVisibleText(), selectByValue()
		dd.selectByIndex(2);
		Thread.sleep(2000);
		dd.selectByVisibleText("Gift Cards");
		Thread.sleep(2000);
		dd.selectByValue("search-alias=office-products");
		
		//Print all the options from the drop down
		List<WebElement> allOptions=dd.getOptions();
		System.out.println("Total Options are: "+allOptions.size());
		for(WebElement i:allOptions)
		{
			System.out.println(i.getText());
			if(i.getText().contains("Video Games"))
			{
				i.click();
				break;
			}
		}
		
		//Using reusable method
		WebElement element=driver.findElement(By.name("url"));
		Utility.selectBasedDropdown(element, "Baby");
				
		
	}

}
