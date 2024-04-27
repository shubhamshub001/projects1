/*Step 1: Launch Firefox browser
Step 2: Open test URL :
https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt in firefox
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
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assign12_1 {

	public static void main(String[] args) throws InterruptedException {
		
		//Step 1: Launch Firefox browser
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		//Step 2: Open test URL :https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt in firefox browser
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		Thread.sleep(3000);
		
		//Step 3: Switch into Frame
		driver.switchTo().frame(0);
		Thread.sleep(3000);
		
		//Step 4: Click on Try it Button
		WebElement ele = driver.findElement(By.xpath("//button[contains(text(),'Try it')]"));
		ele.click();
		Thread.sleep(3000);
		
		//Step 5: Send the text into Alert
		String inputtxt = "Harry Potter from Hogwarts!";
		driver.switchTo().alert().sendKeys(inputtxt);
		Thread.sleep(3000);
		
		//Step 6: Accept the Web Alert
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
		//Step 7: Get the text displayed on page into Console
		WebElement king = driver.findElement(By.xpath("//p[@id='demo']"));
		Thread.sleep(3000);
		String queen = king.getText();
		Thread.sleep(3000);
		System.out.println(queen);
		
		driver.close();
		
	}

}
