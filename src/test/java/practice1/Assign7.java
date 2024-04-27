//Test cases for th following process
//***********************************
//TC-1	Launch Chrome  Browser
//TC-2	Go to Test URL  https://www.google.com
//TC-3	Maximize the Browser Window
//TC-4	Get the URL of Page
//TC-5	Navigate to Test URL  https://www.selenium.dev/
//TC-6	Get the URL of Page
//TC-7	Navigate back to Test URL  https://www.google.com
//TC-8    Get the URL of Page 
//TC-8	Navigate one step forward to Test URL  https://www.selenium.dev/ 
//TC-9    Get the URL of Page 
//TC-10	Refresh the Current Page 
//TC-11	Get the URL of Page 
//TC-12   Close the Browser */

package practice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign7 {

	public static void main(String[] args) throws InterruptedException {
		
		
		//TC-1	Launch Chrome  Browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//TC-2	Go to Test URL  https://www.google.com
		driver.get("https://www.google.com");
		Thread.sleep(3000);
		
		//TC-4	Get the URL of Page
		String pgeURL = driver.getCurrentUrl();
		System.out.println(pgeURL);
		Thread.sleep(3000);
		
		//TC-5 Navigate to Test URL  https://www.selenium.dev/
		driver.navigate().to("https://www.selenium.dev/");
		Thread.sleep(3000);
		
		//TC-6	Get the URL of Page
		String urlpage = driver.getCurrentUrl();
		System.out.println(urlpage);
		Thread.sleep(3000);
		
		//TC-7	Navigate back to Test URL  https://www.google.com
		driver.navigate().back();
		Thread.sleep(3000);
		
		//TC-8 Get the URL of Page
		String thanos = driver.getCurrentUrl();
		System.out.println(thanos);
		Thread.sleep(3000);
		
		//TC-9 Navigate one step forward to Test URL  https://www.selenium.dev/
		driver.navigate().to("https://www.selenium.dev/");
		Thread.sleep(3000);
		
		//Get the URL of Page 
		String str = driver.getCurrentUrl();
		System.out.println(str);
		Thread.sleep(3000);
		
		//TC-10	Refresh the Current Page
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		//TC-11	Get the URL of Page
		String str1 = driver.getCurrentUrl();
		System.out.println(str1);
		Thread.sleep(3000);
		
		//TC-12   Close the Browser */
		driver.close();

	}

}
