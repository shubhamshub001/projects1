/*Test Scenario I: Actions
Step 1: Launch Chrome browser
Step 2: Open Test URL:
http://only-testing-blog.blogspot.com/2014/09/selectable.html
Step 3: Drag the slider up to 50% and drop the slider
Step 4: Close browser
*/

package practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assign15_1 {

	public static void main(String[] args) throws InterruptedException {
		
		//Step 1: Launch Chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Step 2: Open Test URL:http://only-testing-blog.blogspot.com/2014/09/selectable.html
		driver.get("http://only-testing-blog.blogspot.com/2014/09/selectable.html");
		Thread.sleep(5000);
		
		//Step 3: Drag the slider up to 50% and drop the slider
		WebElement element = driver.findElement(By.xpath("//li[contains(text(),'Item 6')]/following::*[2]"));
		Actions act = new Actions(driver);
		act.dragAndDropBy(element, 150, 0).build().perform();
		Thread.sleep(3000);
		
		//Step 4: Close browse
		driver.close();
	}

}
