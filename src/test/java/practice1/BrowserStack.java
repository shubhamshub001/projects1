package practice1;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserStack {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Relationship
		driver.get("http://only-testing-blog.blogspot.com/");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Relationship')]")).click();
		Thread.sleep(3000);
//		
		driver.findElement(By.xpath("//input[@id='gparent_1']")).sendKeys("Adam");
		Thread.sleep(3000);
//		
		driver.findElement(By.xpath("//input[@id='parent_1']")).sendKeys("smith");
		Thread.sleep(3000);
//		
		driver.findElement(By.xpath("//input[@id='child_1']")).sendKeys("joe");
		Thread.sleep(3000);
		
		WebElement ele = driver.findElement(By.xpath("//a[contains(text(),'Only Testing')]"));
		String str = new String(ele.getText());
		System.out.println(str);
		Thread.sleep(3000);
//		
		//home
		driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
		Thread.sleep(5000);
//		
		//ToolTip
		WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Tooltip')]"));
		element.click();
		Thread.sleep(3000);
//
		//using actions class hover over it
		Actions a = new Actions(driver);
		WebElement titos = driver.findElement(By.xpath("//a[contains(text(),'Hover over me')]"));
		a.moveToElement(titos).build();
//
		//home
		driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
		Thread.sleep(5000);
//				
		//frames
		driver.findElement(By.xpath("//a[contains(text(),'iframe1')]")).click();
		Thread.sleep(3000);
//		
		// Check the number of frames on the page
        int frameCount = driver.findElements(By.tagName("frame")).size();
        frameCount += driver.findElements(By.tagName("iframe")).size();
//
        // If frame count is greater than 0, the webpage contains frames
        if (frameCount > 0) {
            System.out.println("The webpage contains frames.");
        } else {
            System.out.println("The webpage does not contain frames.");
        }
//        
//		driver.get("http://only-testing-blog.blogspot.com/");
//     	Thread.sleep(5000);
//     	
//		//home
//		driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
//		Thread.sleep(5000);
//		
//		driver.findElement(By.xpath("//a[contains(text(),'Table W')]")).click();
//		Thread.sleep(3000);
//		
//		//checkbox
//		List<WebElement> box = driver.findElements(By.xpath("//input[@type='checkbox']"));
//		
//		for(WebElement boxes : box)
//		{
//			boxes.click();
//		}
//		Thread.sleep(3000);
//		
//		//home
//		driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
//		Thread.sleep(5000);
//		
//		driver.findElement(By.xpath("//a[contains(text(),'Selectable')]")).click();
//		Thread.sleep(3000);
//		
//		//Selectable
//		driver.findElement(By.xpath("//li[contains(text(),'Item 0')]")).click();
//		Thread.sleep(3000);
//	
//		Actions ac = new Actions(driver);
//		WebElement ele4 = driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-state-default ui-corner-all']"));
//		ac.dragAndDropBy(ele4, 150, 0).build().perform();
//		Thread.sleep(3000);
//		
//		
//		WebElement ele5 = driver.findElement(By.xpath("//button[contains(text(),'Double-Cl')]"));
//		ac.doubleClick(ele5).build().perform();
//		Thread.sleep(3000);
//		
//		driver.switchTo().alert().accept();
//		Thread.sleep(1000);
//		
//		//by using Robot class
//		try
//		{
//			//create intance of robot class
//			Robot robot =new Robot();
//			
//			//simulate press doen key
//			robot.keyPress(KeyEvent.VK_DOWN);
//			robot.keyPress(KeyEvent.VK_DOWN);
//			robot.keyPress(KeyEvent.VK_DOWN);
//			robot.keyPress(KeyEvent.VK_DOWN);
//			robot.keyPress(KeyEvent.VK_DOWN);
//			robot.keyRelease(KeyEvent.VK_DOWN);
//		}
//		catch(AWTException e) 
//		{
//			e.printStackTrace();
//		}
		
		//home
//		driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
//		Thread.sleep(5000);
		
//		//drag and drop
//		driver.findElement(By.xpath("//a[contains(text(),'Drag and Drop')]")).click();
//		Thread.sleep(3000);
//		
//		
//		Actions ac = new Actions(driver);
//		WebElement roger =driver.findElement(By.xpath("//div[@id='dragdiv']"));
//		WebElement roger1 = driver.findElement(By.xpath("//div[@id='dropdiv']"));
//		ac.dragAndDrop(roger, roger1).build().perform();
//		
//		Thread.sleep(3000);
//		
//		//resizable
//		// Locate the resizable div element
//		WebElement resize =driver.findElement(By.id("resizable"));
//		
//		// Locate the resizing handle element (if any)
//		WebElement rehandle =driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
//		
//		// Perform drag-and-drop to resize the element
//		ac.clickAndHold(rehandle).moveByOffset(0, 100).release().perform();
//		Thread.sleep(3000);
		
		
//		//Alert
//		driver.findElement(By.xpath("//a[contains(text(),'Alert')]")).click();
//		Thread.sleep(3000);
//		
//		driver.switchTo().alert().accept();
//		Thread.sleep(2000);
//		
//		driver.findElement(By.name("fname")).sendKeys("shubham");
//		Thread.sleep(2000);
//		
//		driver.findElement(By.name("lname")).sendKeys("Herwade");
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
//		Thread.sleep(5000);
		
		
		driver.findElement(By.xpath("//a[normalize-space()='LogIn']")).click();
		Thread.sleep(2000);
		
		//downloading a file 
		WebElement fileLink = driver.findElement(By.xpath("//a[contains(text(),'Download Text File')]"));
		// Click the download link
		fileLink.click();
		
		// Wait for the file to be downloaded
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[contains(text(), 'Downloading...')]")));
	    //After the file is downloaded, locate the downloaded file
		File downloadFile = new File("C:\\Users\\HP\\Desktop\\JAVA");
		// Verify if the file exists
		if(downloadFile.exists())
		{
			System.out.println("File Downloaded succesfully.");
		}
		else
		{
			System.out.println("File Downloaded failed.");
		}

		driver.close();
		
		
	}

}
