package webHandlingSolutions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CalenderAutomation {

	public static void main(String[] args)
	{
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("http://www.redbus.in/");
	    
	    //Expectation
	    String month="Nov";
	    String date="15";
	    String year="2024";
	    
	    driver.findElement(By.xpath("//div//span[text()='Date']")).click();
	    
	    //month selection - We have to split the month from year then only we can click on a date
	    while(true)  // We use while loop to continue the process until the conditions get true
	    {
	    String text=driver.findElement(By.xpath("(//div[contains(@class,'DayNavigator')])[3]")).getText();
	    System.out.println(text);    // Dec 2023
	    String currentMonth=text.split(" ")[0];    // Dec
	    String currentYear=text.split(" ")[1];     // 2022
	    
	    //System.out.println("Current Month: "+currentMonth+" & Current Year: "+currentYear);
	   
	    if(currentMonth.contains(month) && currentYear.contains(year)) {
	    	break;
	    }
	    else
	    {
	    	//Click on Next month arrow
	    	driver.findElement(By.xpath("(//div[contains(@class,'DayNavigator')])[4]")).click();
	    }
	    }
	    
	    //date selection
	    List<WebElement> allDates=driver.findElements(By.xpath("//div//div[contains(@class,'DayTiles')]//span[contains(@class,'DayTiles')]"));  //41 eelements
	
	    for(WebElement i:allDates)
	    {
	    	if(i.getText().contains(date))
	    	{
	    		i.click();
	    		break;
	    	}
	    }
	
	}

}
