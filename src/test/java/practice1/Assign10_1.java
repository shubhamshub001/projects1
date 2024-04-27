package practice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign10_1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(5000);
		
		List<WebElement> jack = driver.findElements(By.tagName("a"));
		int jackcount = jack.size();
		System.out.println("Number of links present in a given webPage is: "+jackcount);
		Thread.sleep(2000);
		
		for(int i=0; i<jackcount; i++)
		{
			System.out.println(jack.get(i).getText());
		}
		
		Thread.sleep(5000);
		driver.close();
		

	}

}
