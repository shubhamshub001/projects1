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
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assign16 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		//Step 1: Launch Chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Step 2: Open test URL: https://smallpdf.com/word-to-pdf
		driver.get("https://smallpdf.com/word-to-pdf");
		Thread.sleep(5000);
		
		//Step 3: Click on Choose File Button
		WebElement element1 = driver.findElement(By.xpath("(//button[@type='button'])[1]"));
		element1.click();
		Thread.sleep(5000);
		
		
		//path of the file
		//Step 4: Automate Window Alert by uploading file
		StringSelection s = new StringSelection("D:\\SHUBHAM\\whatsapp pix\\1kpa.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		
		//send the data from clipboard to screen
		//paste Operation CONTROL + V
		//Implement JAVA Robot to handle
		Robot r = new Robot();
		//paste
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		Thread.sleep(3000);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		Thread.sleep(3000);
		//enter
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		
		//click on download button
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//button[@type='submit'])[3]")));
		driver.findElement(By.xpath("(//button[@type='submit'])[3]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'Download')]")).click();
		Thread.sleep(5000);
		
		//close
		driver.close();
		
	}

}
