/*1. TC-1 launch chrome browser
2. TC-2 go to test URL - https://netbanking.hdfcbank.com/netbanking/
3. TC-3 maximize the browser window
4. TC-4 get the title of page
5. TC-5 click on know more link text
6. TC-6 switch from 0th window to 1st window
7. TC-7 after switching get the title of page
8. TC-8 close 1st window
9. TC-8 switch from 1st window to 0th window
10. TC-9 after switching get the title of page
11.TC-10 close 0th window */

package practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign6 {

	public static void main(String[] args) throws InterruptedException {
		//TC-1 launch chrome browser
		WebDriver driver = new ChromeDriver();
		
		//TC-2 go to test URL - https://netbanking.hdfcbank.com/netbanking/
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		Thread.sleep(3000);
		
		//TC-3 maximize the browser window
		driver.manage().window().maximize();
		
		//TC-4 get the title of page
		String str = driver.getTitle();
		System.out.println(str);
		Thread.sleep(3000);
		
		
		//Switch from 0th Window/Top window to 1st Window
		driver.switchTo().frame(0);
		
		//TC-5 click on know more link text
		driver.findElement(By.xpath("(//a[contains(text(),'Know')])[2]")).click();
		Thread.sleep(3000);
		
		//TC-6 switch from 0th window to 1st window
		driver.switchTo().defaultContent();
		
		//TC-7 after switching get the title of page
		String fire = driver.getTitle();
		System.out.println(fire);
		Thread.sleep(3000);
		
		//TC-8 close 1st window
		driver.close();
		
		//TC-8 switch from 1st window to 0th window
		
		

	}

}
