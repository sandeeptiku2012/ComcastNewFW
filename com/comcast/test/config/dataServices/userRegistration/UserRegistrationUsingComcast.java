package comcast.test.config.dataServices.userRegistration;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import comcast.test.app.common.userManagement.userRegistration.common.UserRegistrationFunction;
import comcast.test.config.configServices.DataServiceProperties;
import comcast.test.config.configServices.utils.BaseTest;

/** 
 * Class Name: UserRegistrationUsingComcast
 *  Description: This DataService Registers new user using Comcast application
 *  @param <driver>: Native browser driver
 **/

public class UserRegistrationUsingComcast extends BaseTest{
	
	UserRegistrationFunction userReg=new UserRegistrationFunction();
  
	@Test
	public void testUserRegistrationUsingComcast(WebDriver driver) throws Exception 
	{	
		driver.get(DataServiceProperties.APPURL);
		
		Thread.sleep(sleepTime);
	    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Sign In[\\s\\S]*$"));
	    
	    driver.findElement(By.linkText("Register")).click();
	    
	    //This method is user to enter registration fields details
	    userReg.RegistrationDetails(driver);
	   	    
	    driver.findElement(By.name("terms_conditions")).click();
	    
	    driver.findElement(By.linkText("Next")).click();
	    
	    //This method is user to enter Credit Card field Details
	    userReg.CreditCardDetials(driver);
	    
	    driver.findElement(By.cssSelector("a.btn.submit")).click();
	    
	    driver.findElement(By.linkText("Skip activation, go to XIDIO")).click();

	    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*$"));
	    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*HOME[\\s\\S]*$"));

	    driver.findElement(By.linkText("Sign out")).click();  
	}
}

