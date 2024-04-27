package practice1;

import java.io.File;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Browserstackpdf {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://only-testing-blog.blogspot.com/2014/05/login.html");
		Thread.sleep(5000);
		
		List<WebElement> ele = driver.findElements(By.tagName("a"));
		int tito = ele.size();
		System.out.println(tito);
		
		for(WebElement e : ele)
		{
			String str = e.getText();
			System.out.println(str);
		}
		
		WebElement thunder = driver.findElement(By.xpath("//a[contains(text(),'Download PDF File')]"));
		thunder.click();
		Thread.sleep(4000);
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[contains(text(), 'Downloading...')]")));
		
		String filepathpdf = "D:\\SHUBHAM\\PSI";
		File fpdf = new File(filepathpdf);
		Thread.sleep(3000);
		 
		//verify if its downloaded
		if(fpdf.exists())
		{
			System.out.println("File is downloaded succesfully");
		}
		else
		{
			System.out.println("File is not succesfully downloaded");
		}
		
		driver.close();
		
		

	}

}
