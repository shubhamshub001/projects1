package practice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//TC-1 Launch Chrome Browser 
//TC-2 Goto Test URL https://www.google.com
//TC-3 Specify Wait Time for 5 Sec
//Get the Title of Page into Console
//TC-5 Close the Browser *

public class Assign1 {

	public static void main(String[] args) throws InterruptedException {
		//TC-1 Launch Chrome Browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//TC-2 Goto Test URL https://www.google.com
		driver.get("https://www.google.com");
		Thread.sleep(3000);
		
		//TC-3 Get the Title of Page into Console
		String str = driver.getTitle();
		System.out.println(str);
		Thread.sleep(3000);
		
		//TC-4 Close the Browser
		driver.close();
		

	}

}
