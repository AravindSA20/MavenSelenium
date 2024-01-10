package webScenarios;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableAutomation {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(
				"https://automationplayground.com/crm/customers.html?email-name=test123%40gmail.com&password-name=test12&submit-name=");

		System.out.println("--------All Headings---------");
		List<WebElement> heading = driver.findElements(By.xpath("//thead//tr//th"));
		System.out.println("Total headings are :" + heading.size());
		for (WebElement i : heading) {
			System.out.println(i.getText());
		}

		System.out.println("--------Total Rows---------");
		int rows = driver.findElements(By.xpath("//tbody//tr")).size();
		System.out.println("Total Rowss are :" + rows);

		System.out.println("--------Total Columns---------");
		int columns = driver.findElements(By.xpath("//tbody//tr[1]//td")).size();
		System.out.println("Total Columns are :" + columns);

		System.out.println("--------Print Specific Row 4---------");
		String row4 = driver.findElement(By.xpath("//tbody//tr[4]")).getText();
		System.out.println(row4);

		System.out.println("--------Print Specific Column 2(Firstname)---------");
		List<WebElement> firstname=driver.findElements(By.xpath("//tbody//tr//td[2]"));
		for(WebElement i:firstname)
		{
			System.out.println(i.getText());
		}
		
        System.out.println("--------Print Complete Table-----------");
        List<WebElement> table=driver.findElements(By.xpath("//tbody//tr//td"));
        for(WebElement i:table)
        {
        	System.out.println(i.getText());
        }
	}

}
