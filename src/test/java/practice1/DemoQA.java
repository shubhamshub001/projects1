package practice1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoQA {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		
		
//		driver.get("https://demoqa.com/text-box");
//		Thread.sleep(3000);
//		
//		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("shubham Herwade");
//		Thread.sleep(3000);
//		
//		driver.findElement(By.xpath("//button[@id='submit']")).click();
//		Thread.sleep(3000);
		
		//checkbox
		driver.get("https://demoqa.com/checkbox");
		Thread.sleep(5000);
		
		WebElement ele = driver.findElement(By.xpath("//button[@title='Expand all']"));
		ele.click();
		Thread.sleep(5000);
		
		WebElement checkbox = driver.findElement(By.xpath("//span[contains(text(),'WorkSpace')]"));
		//initialising
		Actions ac = new Actions(driver);
		//check the checkbox
		ac.click(checkbox).build().perform();
		
		driver.close();
		
		

	}

}
