package SAMPreRequisite.SAM;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Setup 
{
	static WebDriver driver=new FirefoxDriver();
	
	public void browserSetup()
	{
		
	driver.manage().deleteAllCookies();
	driver.get("http://qa2-sam.cengage.com");
	wait.until(ExpectedConditions.titleIs("Login"));
    }
	
	static WebDriverWait wait= new WebDriverWait(driver, 80);
	
	JavascriptExecutor js =(JavascriptExecutor)driver;
	
	public void Wait(long timeout) 
	{
		
			
			try {
				Thread.sleep(timeout);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
		}
}
	