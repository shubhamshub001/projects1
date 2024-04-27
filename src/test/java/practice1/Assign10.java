/*1. Write a Test Script to get number of links available on Facebook Page
https://www.facebook.com/
*/

package practice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign10 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		
		//Number of links present in a webpage
		List<WebElement> ele = driver.findElements(By.tagName("a"));
		int linkscount = ele.size();
		System.out.println("Number of links present: "+linkscount);
		
		//Name of links
		for(int i=0; i<linkscount; i++)
		{
			System.out.println(ele.get(i).getText());
		}
		
		Thread.sleep(5000);
		
		driver.close();
	}

}
