package SAMPreRequisite.SAM;


import org.openqa.selenium.By;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class Users extends LoginPage

{
	public void clickUserstab()
	{
		Wait(3000);
		driver.findElement(By.xpath("//div[@class='navbar-inner']//a[@tabindex='2']")).click();
		Wait(3000);
	}
	
	public void clickImportButton()
	{
	// Click on Import Button	
		driver.findElement(By.cssSelector("#import-users-button")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#ifrPreview")));
		
		
		driver.switchTo().frame("ifrPreview");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#ctl00_ContentPlaceHolder1_imgNext")));
		driver.findElement(By.cssSelector("#ctl00_ContentPlaceHolder1_imgNext")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#imgNext")));
		driver.findElement(By.cssSelector("#imgNext")).click();
		
		 driver.switchTo().frame("ifrImportUsers");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#imgNext")));
		driver.findElement(By.cssSelector("#FileUpload1")).sendKeys("C:\\Users\\Jyoti\\Desktop\\importuser.txt");
		driver.findElement(By.cssSelector("#imgNext")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".iframebody")));
		
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//select[@id='gvImportUserMapping_ctl02_ddImport']"));
		Select dropdown = new Select(driver.findElement(By.cssSelector("#gvImportUserMapping .GridViewItem #gvImportUserMapping_ctl02_ddImport")));
		dropdown.selectByVisibleText("Username");
		
		Select dropdown2 = new Select(driver.findElement(By.cssSelector("#gvImportUserMapping_ctl03_ddImport")));
		dropdown2.selectByVisibleText("Password");
		
		Select dropdown3 = new Select(driver.findElement(By.cssSelector("#gvImportUserMapping_ctl04_ddImport")));
		dropdown3.selectByVisibleText("FirstName");
		
		Select dropdown4 = new Select(driver.findElement(By.cssSelector("#gvImportUserMapping_ctl06_ddImport")));
		dropdown4.selectByVisibleText("LastName");
		
		driver.findElement(By.cssSelector("#imgbtnNext")).click();
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#imgNext")));
		
		driver.findElement(By.cssSelector("#imgNext")).click();
		
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains (text(),'No Error, click on 'Next' button')]")));
		driver.findElement(By.cssSelector("#imgNext")).click();
		
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='lblEmailNotify'] [contains (text(),'0')]")));
		driver.findElement(By.cssSelector("	imgbtnClose")).click();
		
		
		
	
		
		
		
		


		
		
    	
	}
	
	
}
