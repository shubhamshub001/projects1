/*Test Scenario I: File Upload
Step 1: Launch Chrome browser
Step 2: Open test URL: https://smallpdf.com/word-to-pdf
Step 3: Click on Choose File Button
Step 4: Automate Window Alert by uploading file
Step 5: Close browser
*/

package practice1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assign16_1 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://smallpdf.com/word-to-pdf");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
		Thread.sleep(5000);
		
		//file upload
		//path of the file
		StringSelection r = new StringSelection("D:\\SHUBHAM\\PSI\\EAadhaar_xxxxxxxx0824_20052021114505_510608.pdf");
		//robot class
		Robot t = new Robot();
		//paste
		t.keyPress(KeyEvent.VK_CONTROL);
		t.keyPress(KeyEvent.VK_C);
		Thread.sleep(3000);
		//release
		t.keyRelease(KeyEvent.VK_CONTROL);
		t.keyRelease(KeyEvent.VK_V);
		Thread.sleep(3000);
		//enter
		t.keyPress(KeyEvent.VK_ENTER);
		t.keyRelease(KeyEvent.VK_ENTER);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//button[@type='submit'])[3]")));
		
		driver.findElement(By.xpath("(//button[@type='submit'])[3]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'Download')]")).click();
		Thread.sleep(5000);
		
		//close
		driver.close();

	}

}
