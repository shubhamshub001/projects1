/*Assignment-2
    1.Automate  Oracle  Registration Page in Chrome Browser   
    https://profile.oracle.com/myprofile/account/create-account.jspx
*/

package practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assign9 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='sView1:r1:0:email::content']")).sendKeys("shubhamherwade@gmail.com");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("9611096281");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("9611096281");
		Thread.sleep(3000);
		
		WebElement ele = driver.findElement(By.xpath("//select[@title='India']"));
		Select sc = new Select(ele);
		sc.selectByValue("AS");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//input[@type='text'])[10]")).sendKeys("591201");
		Thread.sleep(3000);
		
		driver.close();

	}

}
