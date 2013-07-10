package comcast.test.app.testCases.userManagement.profileManagement.RegisteredUserTestCasesForChangePaymentInfo;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;

import comcast.test.app.common.userManagement.userLogin.common.UserLoginFunctions;
import comcast.test.app.common.userManagement.userRegistration.common.UserRegistrationValidationFuncitons;
import comcast.test.config.configServices.DataServiceProperties;
import comcast.test.config.configServices.utils.BaseTest;
import comcast.test.config.dataServices.userRegistration.UserRegistrationUsingComcast;

/**  
 * Class Name: ValidateChangePaymentInfoMandatoryFields
 * Description: This test case validates payment Details All Mandatory Fields by
 * logging registered user into Comcast application.
 * **/

public class ValidateChangePaymentInfoMandatoryFields extends BaseTest{
	
	  UserLoginFunctions userLogin=new UserLoginFunctions();
	  UserRegistrationValidationFuncitons userRegValFun=new UserRegistrationValidationFuncitons();
	  UserRegistrationUsingComcast userReg=new UserRegistrationUsingComcast();
	
	  @Test
	  public void testUserProfileChanges() throws Exception {
		try{
		
		//This method is used to register new user into Comcast Application
		userReg.testUserRegistrationUsingComcast(driver);
		
		driver.get(DataServiceProperties.APPURL);
		
		//This method is used to enter user name and password credential
		userLogin.UserLoginCredentials(driver);
		
		driver.findElement(By.id("user_login")).click();

		//This method is used to Change Password
		userLogin.ChangePassword(driver);
		
		driver.findElement(By.name("commit")).click();
		
	    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*HOME[\\s\\S]*$"));
	    
	    driver.findElement(By.cssSelector("span.translation_missing")).click();
	    
	    driver.findElement(By.linkText("Change payment info")).click();
	    
	    driver.findElement(By.name("commit")).click();
	    
	    Thread.sleep(500);
	    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Credit Card Number is required[\\s\\S]*$"));
	    
	    Thread.sleep(500);
	    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Expiration Month is required[\\s\\S]*$"));
	    
	    Thread.sleep(500);
	    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Expiration Year is required[\\s\\S]*$"));
	    
	    Thread.sleep(500);
	    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Security Code is required[\\s\\S]*$"));
	    
	    driver.findElement(By.linkText("Sign out")).click();
	    
		}
		catch(Exception e){
				captureScreenshot();
				}
		}
}

