package webScenarios;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class RegistrationForm {
//  4. Implement a test case using WebDriver to validate the functionality of registration form
	public static void main(String[] args) {
		//Creating a session
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.instagram.com/");	
		
		//Opening Signup page of Instagram
		driver.findElement(By.xpath("//span[text()='Sign up']")).click();
		
		WebElement fbBtn=driver.findElement(By.xpath("//button[@type='button']"));
		System.out.println("Is Login with Facebook button enabled: "+fbBtn.isEnabled());
		
		WebElement email=driver.findElement(By.name("emailOrPhone"));
		System.out.println("Is Email box is enabled? :"+email.isEnabled());
		email.sendKeys("davidbeckham0007@gmail.com");
		
		WebElement fullname=driver.findElement(By.name("fullName"));
		System.out.println("Is Fullname box is enabled? :"+fullname.isEnabled());
		fullname.sendKeys("David Beckham");
		
		WebElement user=driver.findElement(By.name("username"));
		System.out.println("Is Username box is enabled? :"+user.isEnabled());
		user.sendKeys("davideckham07");
		
		WebElement password=driver.findElement(By.name("password"));
		System.out.println("Is  box is enabled? :"+password.isEnabled());
		password.sendKeys("harpervictoria");
		
		WebElement signup=driver.findElement(By.xpath("//button[@type='submit']"));
		System.out.println("Is Signup button enabled: "+signup.isEnabled());
	}
}
