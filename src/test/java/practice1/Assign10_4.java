/*Automate Facebook Registration Page using Relative XPath in 2 different
Browsers https://www.facebook.com/
*/

package practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assign10_4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[@name='login']/following::a[@role='button'][1]")).click();
		Thread.sleep(5000);
		
		//TC-3 fill First Name Textbox with input
		driver.findElement(By.xpath("//div[contains(text(),'Sign Up')]/following::input[@name='firstname']")).sendKeys("Jackson");
		Thread.sleep(3000);
		
		//TC-4 clear the input from First Name Textbox
		driver.findElement(By.xpath("//div[contains(text(),'Sign Up')]/following::input[@name='firstname']")).clear();
		Thread.sleep(2000);
		
		WebDriver driver1 = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver1.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		
		
	}

}
