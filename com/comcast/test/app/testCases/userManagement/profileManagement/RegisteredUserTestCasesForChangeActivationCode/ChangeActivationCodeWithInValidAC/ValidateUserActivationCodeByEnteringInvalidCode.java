package comcast.test.app.testCases.userManagement.profileManagement.RegisteredUserTestCasesForChangeActivationCode.ChangeActivationCodeWithInValidAC;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;

import comcast.test.app.common.userManagement.userLogin.common.UserLoginFunctions;
import comcast.test.config.configServices.DataServiceProperties;
import comcast.test.config.configServices.utils.BaseTest;
import comcast.test.config.dataServices.userRegistration.UserRegistrationUsingComcast;

/** Class Name: ValidateUserActivationCodeByEnteringInvalidCode
 *  Description: This test case validates Activation code by entering invalid code
 *  by logging registered user into Comcast application.
 * **/

public class ValidateUserActivationCodeByEnteringInvalidCode extends BaseTest{
	
	UserLoginFunctions userLogin=new UserLoginFunctions();
	UserRegistrationUsingComcast userReg=new UserRegistrationUsingComcast();
		
	@Test
	public void testActivationCodeByEnteringInvalidCode() throws Exception {
	
		//This method is used to register new user into Comcast Application
		userReg.testUserRegistrationUsingComcast(driver);
			
		driver.get(DataServiceProperties.APPURL);
		
		//This method is used to enter user name and password credential
		userLogin.UserLoginCredentials(driver);
	    
		driver.findElement(By.id("user_login")).click();
		
		//This method is used to Change Password
		userLogin.ChangePassword(driver);
		
		driver.findElement(By.name("commit")).click();
		
		Thread.sleep(sleepTime);
		driver.findElement(By.cssSelector("span.translation_missing")).click();
	    
	    driver.findElement(By.linkText("Change activation code")).click();
	    
	    driver.findElement(By.name("user[activation_code]")).clear();
	    driver.findElement(By.name("user[activation_code]")).sendKeys(DataServiceProperties._INVALID_ACTION_CODE);
	    
	    driver.findElement(By.linkText("Activate")).click();
	  
	    Thread.sleep(sleepTime);
	    assertEquals("Activation code "+DataServiceProperties._INVALID_ACTION_CODE+" is invalid", driver.findElement(By.cssSelector("label.error")).getText());
	    
	    driver.findElement(By.linkText("Sign out")).click();
	}
}
