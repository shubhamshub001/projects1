package element;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Element1 {
	
	WebDriver driver;
	
	//Specifying the locators
	By clickelements = By.xpath("(//div[@class='card-body'])[1]");
	By textbox =  By.xpath("//span[contains(text(),'Text Box')]");
	By fullname = By.xpath("//input[@type='text']");
	By emailid = By.xpath("//input[@type='email']");
	By curAddr = By.xpath("//textarea[@id='currentAddress']");
	By permAdd = By.xpath("//textarea[@id='permanentAddress']");
	By submitt = By.xpath("//button[@id='submit']");
	
	

	public void landingpage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void elemenclick() throws InterruptedException
	{
		driver.findElement(clickelements).click();
		Thread.sleep(3000);
	}
	
	public void elemtext() throws InterruptedException
	{
		driver.findElement(textbox).click();
		Thread.sleep(3000);
	}
	
	public void elemtname(String shubhamherwade) throws InterruptedException
	{
		driver.findElement(fullname).sendKeys(shubhamherwade);
		Thread.sleep(3000);
	}
	
	public void elemtemail(String shubhamherwade11gmail) throws InterruptedException
	{
		driver.findElement(emailid).sendKeys(shubhamherwade11gmail);
		Thread.sleep(3000);
	}
	
	public void elemtaddr(String chikdoi) throws InterruptedException
	{
		driver.findElement(curAddr).sendKeys(chikdoi);
		Thread.sleep(3000);
	}
	
	public void elemtper(String bangalore) throws InterruptedException
	{
		driver.findElement(permAdd).sendKeys(bangalore);
		Thread.sleep(3000);
	}
	
	public void submittt() throws InterruptedException
	{
		driver.findElement(submitt).click();
		Thread.sleep(3000);
	}

}
