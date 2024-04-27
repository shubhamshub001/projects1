/*Test Scenario I: Actions
Step 1: Launch Chrome browser
Step 2: Open test URL:
http://only-testing-blog.blogspot.com/2014/09/selectable.html
Step 3: Double click on Double-Click Me to see Alert Button to generate Alert
Step 4: Accept Alert
Step 5: Close browser
*/

package practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assign14 {

	public static void main(String[] args) throws InterruptedException {
		
		//Step 1: Launch Chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Step 2: Open test URL:http://only-testing-blog.blogspot.com/2014/09/selectable.html
		driver.get("http://only-testing-blog.blogspot.com/2014/09/selectable.html");
		Thread.sleep(5000);
		
		//Step 3: Double click on Double-Click Me to see Alert Button to generate Alert
		WebElement ele = driver.findElement(By.xpath("//button[contains(text(),'Double-Click Me To See Alert')]"));
		Thread.sleep(5000);
		Actions ac = new Actions(driver);
		Thread.sleep(5000);
		ac.doubleClick(ele).build().perform();
		Thread.sleep(5000);
		
		//Step 4: Accept Alert
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
		//Step 5: Close browser
		driver.quit();
		
	}

}
