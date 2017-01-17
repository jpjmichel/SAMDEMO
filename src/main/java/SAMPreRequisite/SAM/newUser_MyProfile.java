package SAMPreRequisite.SAM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class newUser_MyProfile extends NewUserButton
{
	public static void Myprofile()
	{
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("firstname");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("lastname");
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("username6@swlearning.com");
		driver.findElement(By.xpath("//input[@id='verifyUserName']")).sendKeys("username6@swlearning.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
		driver.findElement(By.xpath("//input[@id='verifyPassword']")).sendKeys("password");
		//driver.findElement(By.xpath("//div[@id='secretQuestionValue']/a[@id='helpMenuOP']")).click();
		
		String comboSelector = "//div[@id='secretQuestionValue']/a[@id='helpMenuOP']";
		String selectionSelector = "//li//a[contains(text(),'What is the name of your hometown?')]";

		//Click your combo box.  I would suggest using a WebDriverWait or FluentWait rather than a hard-coded Thread.sleep here
		driver.findElement(By.xpath(comboSelector)).click();
		//Find the element to verify it is in the DOM 
		driver.findElement(By.xpath(selectionSelector));    

		//Execute JavaScript function scrollIntoView on the element to verify that it is visible before clicking on it.
		JavascriptExecutor jsExec = (JavascriptExecutor)driver;
		jsExec.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath(selectionSelector)));
		driver.findElement(By.xpath(selectionSelector)).click();	 
		driver.findElement(By.xpath("//input[@id='secretAnswer']")).sendKeys("answer");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		confirmProfile();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='descriptionEula']")));
		driver.findElement(By.xpath("//button[@id='eulaIAgreeButton']")).click();
		
		wait.until(ExpectedConditions.titleIs("SAM - Activity Calendar"));
		
	}

	public static void confirmProfile()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='descriptionUserInputConfirm']/div[@class='upper-wrapper']")));
		driver.findElement(By.xpath("//button[@id='btnSaveUserConfirmation']")).click();
	}

}