package practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assign13_1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
		
		Actions a = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("//span[contains(text(),'Account & Lists')]"));
		a.moveToElement(ele).build().perform();
		Thread.sleep(3000);
		
		WebElement wax = driver.findElement(By.xpath("//span[contains(text(),'Your Orders')]"));
		wax.click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("9067621762");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("9611096281");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		
		driver.close();
	}

}
