/*Test Scenario I: File download
Step 1: Launch Firefox browser
Step 2: Open test URL: https://www.selenium.dev/downloads/
Step 3: In Selenium Client and Web Driver Language Bindings, click on link text
to download Selenium with Java Language binding
Step 4: Automate file download
Step 5: Close browser
*/

package practice1;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assign17 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/downloads/");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[contains(text(),'4.19.1 (March 29, 2024)')]")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//a[contains(text(),'4.19.1 (March 29, 2024)')]")));
		
		WebElement downloadButton = driver.findElement(By.linkText("Download"));
        downloadButton.click();
        
     // Wait for the file to be downloaded
        File downloadedFile = new File("path_to_downloaded_file");
        WebDriverWait downloadWait = new WebDriverWait(driver, Duration.ofSeconds(30));
        downloadWait.until((WebDriver d) -> downloadedFile.exists());
		
	}

}
