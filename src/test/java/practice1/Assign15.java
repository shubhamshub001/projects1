/*Test Scenario I: Actions
Step 1: Launch Chrome browser
Step 2: Open test URL:
http://only-testing-blog.blogspot.com/2014/09/selectable.html
Step 3: Right click on Double-Click Me to See Alert Button
Step 4: Close browser*/

package practice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assign15 {

	public static void main(String[] args) throws InterruptedException {
		
		//Step 1: Launch Chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Step 2: Open test URL:http://only-testing-blog.blogspot.com/2014/09/selectable.html
		driver.get("http://only-testing-blog.blogspot.com/2014/09/selectable.html");
		Thread.sleep(5000);
		
		//Step 3: Select item4
		WebElement ele1 = driver.findElement(By.xpath("//li[contains(text(),'Item 4')]"));
		ele1.click();
		Thread.sleep(5000);
		
		//get all selected options
		List<WebElement> tito = ((Select) ele1).getAllSelectedOptions();
		
		for(WebElement op : tito)
		{
			System.out.println("Selected options: "+op.getText());
		}
		
		//close browser
		driver.close();

	}

}
