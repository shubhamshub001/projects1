package practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browserstackmul {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();

	        // Open the multiplication calculator webpage
	        driver.get("http://only-testing-blog.blogspot.com/2014/04/mul.html");

	        // Find the input fields and buttons
	        WebElement inputField1 = driver.findElement(By.name("Numbers"));
	        WebElement inputField2 = driver.findElement(By.name("Numbers"));
	        WebElement multiplyButton = driver.findElement(By.xpath("(//input[@type='button'])[4]"));
	        WebElement resultElement = driver.findElement(By.xpath("(//input[@type='button'])[13]"));

	        // Input numbers into the input fields
	        inputField1.sendKeys("5");
	        Thread.sleep(3000);
	     // Click on the multiplication button
	        multiplyButton.click();
	        Thread.sleep(3000);
	        inputField2.sendKeys("10");
	        resultElement.click();
	        Thread.sleep(2000);
	        

	        // Retrieve the result
	        String result = resultElement.getText();
	        System.out.println("Multiplication result: " + result);

	        // Close the browser
	        driver.quit();
		
	}

}
