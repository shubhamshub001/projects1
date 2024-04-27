package practice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assign10_2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("one plus");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		
		List<WebElement> ele1 = driver.findElements(By.xpath("//span[contains(text(),'OnePlus')]"));
		int gyan = ele1.size();
		System.out.println("Numb of OnePlus links present: "+gyan);
		
		for(int i=0; i<gyan; i++)
		{
			System.out.println(ele1.get(i).getText());
		}
		Thread.sleep(5000);
		
		WebElement sc = driver.findElement(By.xpath("//span[contains(text(),'Account & Lists')]"));
		Actions ac = new Actions(driver);
		ac.moveToElement(sc).build().perform();
		driver.findElement(By.xpath("//span[contains(text(),'Your Orders')]")).click();
		Thread.sleep(3000);
		
		driver.close();
	}

}
