package practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign3 {

	
	public static void main(String[] args) throws InterruptedException {
		//Launch Chrome Browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//Go to Test URL-https://www.facebook.com/
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		//Click on Create New Button
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(3000);
		
		//Click on privacy
		driver.findElement(By.xpath("//a[@id='privacy-link']")).click();
		Thread.sleep(2000);
		
		//close
		driver.close();
		

	}

}
