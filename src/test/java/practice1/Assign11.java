/*Step 1: Launch Firefox browser
Step 2: Open test URL: https://www.jquery-az.com/javascript/demo.php?ex=151.1_1 in Chrome browser
Step 3: Click on click here to show confirm alert button
Step 4: Get the text displayed on alert into console
Step 5: Accept the web alert to delete account
Step 6: Get the text displayed on alert into console
Step 7: Accept the alert
Step 8: Close browser
*/

package practice1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign11 {

	public static void main(String[] args) throws InterruptedException {
		
		//Step 1: Launch Chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Step 2: Open test URLhttps:https://www.jquery-az.com/javascript/demo.php?ex=151.1_1 in Chrome browser
		driver.get("https://www.jquery-az.com/javascript/demo.php?ex=151.1_1");
		Thread.sleep(5000);
		
		//Step 3: Click on click here to show confirm alert button
		WebElement element = driver.findElement(By.xpath("//button[contains(text(),'Click here to')]"));
		element.click();
		Thread.sleep(3000);
		
		//Step 4: Get the text displayed on alert into console
		Alert ale = driver.switchTo().alert();
		String str = ale.getText();
		Thread.sleep(3000);
		System.out.println("Text on Alert: "+str);
		Thread.sleep(3000);
		
		//Step 5: Accept the web alert to delete account
		ale.accept();
		Thread.sleep(3000);
		
		//Step 6: Get the text displayed on alert into console
		Alert ele1 = driver.switchTo().alert();
		String gettext = ele1.getText();
		Thread.sleep(3000);
		System.out.println("Text on Alert for: "+gettext);
		Thread.sleep(3000);
		
		//Step 7: Accept the alert
		ele1.accept();
		Thread.sleep(3000);
		
		//Step 8: Close browser
		driver.close();
		
	}

}
