package SAMPreRequisite.SAM;

import org.apache.commons.io.filefilter.FalseFileFilter;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;



public class LoginTest extends SAMAssignments
{
	@Test 
	public void Setup()
	{
		browserSetup();
		Assert.assertEquals("Login",driver.getTitle());
	}
	
		
	@Test (dependsOnMethods={"Setup"})
	
	public void Login() 
	{
		
		sendUserName();
		sendPassword();
		click();	
		
	}
	
	@Test (dependsOnMethods={"Login"})
	public void LoginCheck()
	{
		loginCheck();
		Assert.assertEquals("http://qa2-sam.cengage.com/App/Instructor#/home", driver.getCurrentUrl());
		
	}
	@Test (enabled=false)
	//(dependsOnMethods={"Login"})
	public void Users()
	{
		clickUserstab();
		Assert.assertEquals("SAM - Users", driver.getTitle());
	}
	
	@Test (enabled=false)
	// (dependsOnMethods={"Users"})
	public void importUser()
	{
		clickImportButton();
	}
	
	@Test  (enabled = false) 
	//(dependsOnMethods={"Setup"})
	public void NewStudentUser()
	{
		String value=StudentCreation();
		System.out.println(value);
	}
	
	@Test (enabled = false) 
	//(dependsOnMethods={"NewStudentUser"})
	public void Profile()
	{
		Myprofile();
		Assert.assertEquals(driver.getTitle(), "SAM - Activity Calendar");
	}
	
	@Test (enabled = false) 
	public void CreateInstructorUsers()
	{
		
	}
	
	@Test (enabled = false) 
	public void CreateSection()
	{
		
	}
	@Test (dependsOnMethods={"LoginCheck"})
	public void CreateExam()
	{

		Exam();
	}
	
	 
}
