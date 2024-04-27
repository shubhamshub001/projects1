package practice1;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrwoserStacktxt {

	public static void main(String[] args) throws InterruptedException {

		
		// Set Chrome options to specify download directory 
		ChromeOptions options = new ChromeOptions();
				
		// Replace "C:\\Downloads\\" with the actual path where your file will be downloaded
		options.addArguments("download.default_directory=/path/to/download/directory");
		
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
		driver.get("http://only-testing-blog.blogspot.com/");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[contains(text(),'LogIn')]")).click();
		Thread.sleep(3000);
		
		//downloading a file
		WebElement ele = driver.findElement(By.xpath("//a[contains(text(),'Download Text File')]"));
		//click a download link
		ele.click();
		
		//wait for the file to be download
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[contains(text(), 'Downloading...')]")));
		
		////After the file is downloaded, locate the downloaded file
		String filePath = "C:\\Users\\HP\\Desktop\\Certification\\Testing text.txt";
		File f = new File(filePath);
		Thread.sleep(3000);
		
		//// Verify if the file exists
		if(f.exists())
		{
			System.out.println("File is downloaded and exist");
		}
		else
		{
			System.out.println("File is not download : failed");
		}
		
	
	}

}
