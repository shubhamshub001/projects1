/*Write a Test Script for following:
1. TC-1 launch Chrome browser
2. TC-2 go to Facebook Registration Page
3. TC-3 fill First Name Textbox with input
4. TC-4 clear the input from First Name Textbox
5. TC-5 again fill the First Name Textbox with input
6. TC-6 Get the input from Textbox and display it in Console
7. TC-6 Close browser*/

package practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign10_3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(5000);
		
		//TC-3 fill First Name Textbox with input
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Jackson");
		Thread.sleep(3000);
		
		//TC-4 clear the input from First Name Textbox
		driver.findElement(By.xpath("//input[@name='firstname']")).clear();
		Thread.sleep(2000);
		
		//TC-5 again fill the First Name Textbox with input
		WebElement rock = driver.findElement(By.xpath("//input[@name='firstname']"));
		rock.sendKeys("jackson");
		Thread.sleep(3000);
		
		//TC-6 Get the input from Textbox and display it in Console
		String str = rock.getAttribute("jackson");
		System.out.println(str);
		Thread.sleep(3000);
		
		//TC-6 Close browser*/
		driver.close();
		
	}

}
