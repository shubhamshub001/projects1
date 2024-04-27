/*TC-1 Launch Chrome Browser 
 * ************************
TC-1 Launch Firefox Browser 
TC-2 Goto Test URL https://www.google.com
TC-3 Specify Wait Time for 5 Sec
TC-4 Get the Title of Page into Console
TC-5 Close the Browser */

package practice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign4 {
	
	public static void main(String[] args) throws InterruptedException {
		//TC-1 Launch Chrome Browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//TC-2 Goto Test URL https://www.google.com
		driver.get("https://www.google.com");
		Thread.sleep(3000);
		
		//TC-3 Get the Title of Page into Console
		String st = driver.getTitle();
		System.out.println(st);
		Thread.sleep(3000);
		
		//TC-4 close
		driver.close();
		
	}

}
