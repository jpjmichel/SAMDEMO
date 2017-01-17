package SAMPreRequisite.SAM;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;



public class LoginPage extends Setup
{
    public void sendUserName()
    {
    	
       driver.findElement(By.cssSelector(".ng-pristine #username")).sendKeys("institution1.sam2010@cengage.com");
           
    }
    
    public void sendPassword()
    {
    	driver.findElement(By.cssSelector("#password")).sendKeys("password");
        
    }
    
    public void click() 
    {
    	
    	
    	driver.findElement(By.cssSelector(".login-button")).click();
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".site-logo")));
    	
    	
    }
    
    public void loginCheck()
    {
    	
    	String url= driver.getCurrentUrl();
    	
    	 if(url.equals("http://qa2-sam.cengage.com/App/Instructor#/home"))
      	{
      		System.out.println("Login Successful");
      	}
     	
     	else 
     	{
     		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#descriptionDupSession>.col-100")));
      	    driver.findElement(By.xpath("//div[@class='right-align']//button[2]")).click();
      	
     	}
     	
     wait.until(ExpectedConditions.urlToBe("http://qa2-sam.cengage.com/App/Instructor#/home"));
     	
    	
    }
    
}

