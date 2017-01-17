package SAMPreRequisite.SAM;

import org.junit.rules.DisableOnDebug;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class SAMAssignments extends eulaPages
{
	public static void Exam()
	{
		driver.findElement(By.xpath("//a[@href='#/assignments']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='AssignmentFilterDiv']")));
	    
		driver.findElement(By.xpath("//a[@id='aExams']")).click();
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='#/addExam']")));
	    
	   driver.findElement(By.xpath("//a[@href='#/addExam']")).click();
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='examName']")));
	   driver.findElement(By.xpath("//input[@id='examName']")).click();
	   driver.findElement(By.xpath("//input[@id='examName']")).click();
	    driver.findElement(By.xpath("//input[@id='examName']")).sendKeys("Exam_Name1");
	    
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='trainingCheckbox']")));
		 
		driver.findElement(By.xpath("//input[@id='trainingCheckbox']")).click();
		Select dropdown=new Select(driver.findElement(By.xpath("//select[@id='contentVersionSelect']")));
				dropdown.selectByIndex(1);
		driver.findElement(By.xpath("//button[@class='btn btn-primary ng-binding']")).click();
		Page2();
	}
	
	public static void Page2()
	{
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='allTasksCheckBox']")));
		driver.findElement(By.xpath("//input[@id='allTasksCheckBox']")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@title='Next Step']")));
		
		WebElement emp =driver.findElement(By.xpath("//button[@title='Next Step']"));
		
		try{
		Thread.sleep(200000);
		String isDisabled = emp.getAttribute("disabled");
		if (isDisabled==null || !isDisabled.equals("disabled")){
		  emp.click();
		}else{
		   System.out.println("View link: Disabled");
		}}
		catch(Exception e)
		{
		
			driver.findElement(By.xpath("//button[@title='Next Step']")).click();
		}
		
		
		
	
	}
}
