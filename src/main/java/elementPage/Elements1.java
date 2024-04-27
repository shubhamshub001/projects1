package elementPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Elements1 {
	
	WebDriver driver;
	
	//Specify the Object/Element Locators 
	//By ElementsTab =  By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]");
	By TextBox =  By.xpath("(//span[@class='text'])[1]");
	By fullname =  By.xpath("//input[@id='userName']");
	By email =  By.xpath("//input[@id='userEmail']");
	By curadd = By.xpath("//textarea[@id='currentAddress']");
	By peradd = By.xpath("//textarea[@id='permanentAddress']");
	By submit = By.xpath("//button[@id='submit']");
	
	public Elements1(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	/*
	 * //TC-02: click on elements public void clickelement() throws
	 * InterruptedException { driver.findElement(ElementsTab).click();
	 * Thread.sleep(3000); }
	 */
	
	//TC-03: Click on TextBox
	public void textboxElement() throws InterruptedException
	{
		driver.findElement(TextBox).click();
		Thread.sleep(3000);
	}
	
	//TC-04:full name
	public void fullnameElement(String shubhamherwade) throws InterruptedException
	{
		driver.findElement(fullname).sendKeys(shubhamherwade);
		Thread.sleep(3000);
	}
	
	public void emailElement(String shubhamherwade11gmail) throws InterruptedException
	{
		driver.findElement(email).sendKeys(shubhamherwade11gmail);
		Thread.sleep(3000);
	}
	
	public void curaddElement(String Belagavi) throws InterruptedException
	{
		driver.findElement(curadd).sendKeys(Belagavi);
		Thread.sleep(3000);
	}
	
	public void peraddElement(String Bangalore) throws InterruptedException
	{
		driver.findElement(peradd).sendKeys(Bangalore);
		Thread.sleep(3000);
	}
	
	public void submitElement() throws InterruptedException
	{
		driver.findElement(submit).click();
		Thread.sleep(3000);
	}
}
