package practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assign2 {
	public static void main(String[] args) throws InterruptedException {
		//Launch Chrome Browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//Go To Test URL https://www.moneycontrol.com/
		driver.get("https://www.moneycontrol.com/");
		Thread.sleep(3000);
		
		//Click on Forum dropdown
		driver.findElement(By.xpath("(//a[@title='Forum'])[1]")).click();
		Thread.sleep(5000);
		
		//close
		driver.close();
		
		
	}

}
