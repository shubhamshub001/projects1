/*TC-1	Launch Chrome Browser
TC-2	Go to Test URL https://netbanking.hdfcbank.com/netbanking/
TC-3	Maximize the Browser Window
TC-4	Get the Title of Page
TC-5	Click on new window/new tab Link Text 
TC-6	Switch from 0th   Window to 1st   Window
TC-7	After Switching Get the Title of Page 
TC-8    Close 1st Window 
TC-8	Switch from 1st   Window to 0th  Window
TC-9    After Switching Get the Title of Page 
TC-10	Close 0th Window*/

package practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign5 {

	public static void main(String[] args) throws InterruptedException {
		// TC-1	Launch Chrome Browser
		WebDriver driver = new ChromeDriver();
		
		//TC-2	Go to Test URL  https://netbanking.hdfcbank.com/netbanking/
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		Thread.sleep(3000);
		
		//TC-3	Maximize the Browser Window
		driver.manage().window().maximize();
		
		//TC-4	Get the Title of Page
		String jack = driver.getTitle();
		System.out.println(jack);
		Thread.sleep(3000);
		
		//TC-5	Click on new window/new tab Link Text
		driver.findElement(By.xpath("//button[@id='windowButton']")).click();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//TC-6	Switch from 0th   Window to 1st   Window
		//driver.switchTo().frame(1);
		
		//TC-7	After Switching Get the Title of Page
		String daniel = driver.getTitle();
		System.out.println(daniel);
		Thread.sleep(3000);
		
		//TC-8    Close 1st Window
		driver.close();
	
		

	}

}
