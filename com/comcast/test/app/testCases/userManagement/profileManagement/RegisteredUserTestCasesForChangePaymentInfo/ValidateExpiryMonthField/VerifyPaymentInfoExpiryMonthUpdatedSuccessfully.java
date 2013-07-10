package comcast.test.app.testCases.userManagement.profileManagement.RegisteredUserTestCasesForChangePaymentInfo.ValidateExpiryMonthField;

import org.junit.*;
import static org.junit.Assert.*;

import org.openqa.selenium.*;
import comcast.test.config.configServices.utils.BaseTest;
import comcast.test.app.common.userManagement.userLogin.common.UserLoginFunctions;
import comcast.test.app.common.userManagement.userRegistration.common.UserRegistrationValidationFuncitons;
import comcast.test.config.dataServices.userRegistration.UserRegistrationUsingComcast;

/**  
 * Class Name: VerifyPaymentInfoExpiryMonthUpdatedSuccessfully
 * Description: This test case validates whether Payment Info Expiry Month is updated successfully 
 * By logging registered user into Comcast application.
 * **/

public class VerifyPaymentInfoExpiryMonthUpdatedSuccessfully extends BaseTest{
	
	UserLoginFunctions userLogFun=new UserLoginFunctions();
	UserRegistrationValidationFuncitons userRegValFun=new UserRegistrationValidationFuncitons();
	UserRegistrationUsingComcast userReg=new UserRegistrationUsingComcast();
	
	@Test
	public void testVefiryChangePaymentInfoDetailsUpdatedSuccessfully() throws Exception {
		
	//This method is used to register new user into Comcast Application
	userReg.testUserRegistrationUsingComcast(driver);
	
	//This method is used to enter user name and password credential
	userLogFun.UserLoginCredentials(driver);
	
	driver.findElement(By.id("user_login")).click();
    
	//This method is used to Change Password
	userLogFun.ChangePassword(driver);
	
	driver.findElement(By.name("commit")).click();
	
	driver.findElement(By.cssSelector("span.translation_missing")).click();
    
    driver.findElement(By.linkText("Change payment info")).click();
    
    //This month is used to update Expiry month of credit card
    userRegValFun.UpdateCCExpiryMonth(driver);
    
    driver.findElement(By.name("commit")).click();
    
    Thread.sleep(sleepTime);
    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*HOME[\\s\\S]*$"));
    
    driver.findElement(By.linkText("Sign out")).click();
  }
}
