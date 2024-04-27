/*Assignment-1
1.	Automate Facebook Registration Page  using Direct Locator's in Chrome Browser
     https://www.facebook.com/
*/

package practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assign8 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		WebElement ele = driver.findElement(By.xpath("//a[contains(text(),'Create new account')]"));
		ele.click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Shubham");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Herwade");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8660136054");
		Thread.sleep(2000);
		
		WebElement dino = driver.findElement(By.xpath("//select[@id='day']"));
		Select day = new Select(dino);
		day.selectByValue("15");
		Thread.sleep(2000);
		
		WebElement dino1 = driver.findElement(By.xpath("//select[@id='month']"));
		Select month = new Select(dino1);
		month.selectByValue("1");
		Thread.sleep(2000);
		
		WebElement dino2 = driver.findElement(By.xpath("(//select[@id='year'])"));
		Select year = new Select(dino2);
		year.selectByValue("1994");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		Thread.sleep(5000);
		
		driver.close();

	}

}
