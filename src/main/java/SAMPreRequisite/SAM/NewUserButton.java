package SAMPreRequisite.SAM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;



public class NewUserButton extends Users

{
	
	public static String StudentCreation()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='col-50']")));
    	driver.findElement(By.xpath("//div[@class='col-50']/a[@href='/App/login#/newuser']")).click();
		keycode();
		confirmIkey();
		String result=checkIkey();
		return result;
	}
	
	public static void keycode()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".col-100>h1")));
    	driver.findElement(By.cssSelector("#iKeyCode")).sendKeys("T2111111");
		driver.findElement(By.xpath("//div[@class='blue-footer']/div[@class='right-align']/button[@tabindex='3']")).click();
		
}
	public static void confirmIkey()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='confirmIkeyOkButton']")));
		driver.findElement(By.xpath("//button[@id='confirmIkeyOkButton']")).click();
	}
	
	public static String checkIkey()
	{
		String val = null;
		if(driver.getClass().equals("ng-scope"))
				
						val= "keycode";
				
				
		else
			if(driver.getClass().equals("upper-wrapper"))
			
				val="Profile";
		return val;
				
			
	}
	public static void sendkeycode()
	{
		driver.findElement(By.xpath("//input[@id='keyCode']")).sendKeys("bhhhhhhhhh");
	}
	
	public static void profile()
	{
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("aaaaaaaa");
	}


}