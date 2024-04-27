package practice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserstackAttribute {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://only-testing-blog.blogspot.com/2014/02/attributes.html");
		Thread.sleep(3000);
		
		//Extracting Text: How would you extract the text "This is sample text" from the webpage using Java Selenium?
		

	}

}
