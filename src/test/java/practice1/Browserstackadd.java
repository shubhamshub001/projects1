package practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browserstackadd {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://only-testing-blog.blogspot.com/2014/04/add.html");
		Thread.sleep(5000);
		
		//finding the input fields by using the xpath
		WebElement Infield1 = driver.findElement(By.xpath("//input[@name='Numbers']"));
		WebElement addition = driver.findElement(By.xpath("//input[@onclick=\"document.Calc.Numbers.value += '+'\"]"));
		WebElement Infield2 = driver.findElement(By.xpath("//input[@name='Numbers']"));
		WebElement equals = driver.findElement(By.xpath("//input[@onclick='document.Calc.Numbers.value = eval(Calc.Numbers.value)']"));
		
		// Input numbers into the input fields
		Infield1.sendKeys("55");
		Thread.sleep(3000);
		addition.click();
		Thread.sleep(3000);
		Infield2.sendKeys("44");
		Thread.sleep(3000);
		equals.click();
		
		String str = equals.getText();
		System.out.println(str);
		
		driver.quit();
		
	}

}
