/*Step 1: Launch chrome browser
Step 2: Open test URL :
https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt in Chrome
browser
Step 3: Switch into Frame
Step 4: Click on Try it Button
Step 5: Send the text into Alert
Step 6: Accept the Web Alert
Step 7: Get the text displayed on page into Console
Step 8: Close browser*/

package practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign12_2 {

	public static void main(String[] args) throws InterruptedException {
		
		//Step 1: Launch chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Step 2: Open test URL:https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt in Chrome browser
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		Thread.sleep(3000);
		
		//Step 3: Switch into Frame
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		
		//Step 4: Click on Try it Button
		WebElement fire = driver.findElement(By.xpath("//button[contains(text(),'Try it')]"));
		fire.click();
		Thread.sleep(3000);
		
		//Step 5: Send the text into Alert
		String don = "Shubham Herwade";
		driver.switchTo().alert().sendKeys(don);
		Thread.sleep(3000);
		
		//Step 6: Accept the Web Alert
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
		//Step 7: Get the text displayed on page into Console
		WebElement rat = driver.findElement(By.xpath("//p[@id='demo']"));
		Thread.sleep(3000);
		String jojo = rat.getText();
		Thread.sleep(3000);
		System.out.println(jojo);
		
		//Step 8: Close browser*/
		driver.close();

	}

}
