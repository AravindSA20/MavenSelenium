package webScenarios;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookCreateAccount {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Facebook Login page --> Create Account
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		//Entering Details to create a new account
		//First name
		driver.findElement(By.name("firstname")).sendKeys("David");
		
	    //Surname
		driver.findElement(By.name("lastname")).sendKeys("Beckham");
		
		//E-mail or Mobile number
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("harperbecks07@gmail.com");
		
		//Re-entering E-mail
		driver.findElement(By.xpath("//input[@aria-label='Re-enter email address']")).sendKeys("harperbecks07@gmail.com");
		
		//Password
		driver.findElement(By.id("password_step_input")).sendKeys("harpervictoria7");
		
		//Date of Birth
		//Day using selectByIndex()
		WebElement day=driver.findElement(By.name("birthday_day"));
		Select dd1=new Select(day);
		System.out.println("Is Day dropdown selects multiple selection? :"+dd1.isMultiple()); 
		dd1.selectByIndex(1);
		
		//Month using selectByVisibleText()
		WebElement month=driver.findElement(By.name("birthday_month"));
		Select dd2=new Select(month);
		System.out.println("Is Month dropdown selects multiple selection? :"+dd2.isMultiple());
		dd2.selectByVisibleText("May");
		
		//Year using selectByValaue()
		WebElement year=driver.findElement(By.name("birthday_year"));
		Select dd3=new Select(year);
		System.out.println("Is Year dropdown selects multiple selection? :"+dd3.isMultiple());
		dd3.selectByValue("1975");
		
		//Gender
		driver.findElement(By.xpath("(//label[@class='_58mt'])[2]")).click();
		
		//Sign Up
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	}
}
