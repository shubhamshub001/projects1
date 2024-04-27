/*Test Scenario I: Actions
Step 1: Launch Chrome browser
Step 2: Open test URL- https://www.flipkart.com/
Step 3: If found any screen hiding actual page, close the screen
Step 4: Move mouse pointer towards Women
Step 5: Click on Shoes
Step 6: Close browser
*/

package practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assign13 {

	public static void main(String[] args) throws InterruptedException {
		
		//Step 1: Launch Chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Step 2:Open test URL- https://www.flipkart.com/
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		
		//Step 3:If found any screen hiding actual page, close the screen
		
		//Step 4:Move mouse pointer towards Women ethnic
		Actions ac = new Actions(driver);
		WebElement nt = driver.findElement(By.xpath("//span[contains(text(),'Fashion')]"));
		ac.moveToElement(nt).build().perform();
		Thread.sleep(2000);
		WebElement st = driver.findElement(By.xpath("//a[contains(text(),'Women Ethnic')]"));
		ac.moveToElement(st).build().perform();
		Thread.sleep(2000);
		
		//Step 5: Click on Saree
		WebElement ib = driver.findElement(By.xpath("//a[contains(text(),'Women Sarees')]"));
		ib.click();
		Thread.sleep(2000);
		
		//Step 6: Close browser
		driver.close();	
	}

}
