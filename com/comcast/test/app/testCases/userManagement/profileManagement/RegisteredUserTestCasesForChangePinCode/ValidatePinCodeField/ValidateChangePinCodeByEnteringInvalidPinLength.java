package comcast.test.app.testCases.userManagement.profileManagement.RegisteredUserTestCasesForChangePinCode.ValidatePinCodeField;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;

import comcast.test.app.common.userManagement.userLogin.common.UserLoginFunctions;
import comcast.test.config.configServices.DataServiceProperties;
import comcast.test.config.configServices.utils.BaseTest;
import comcast.test.config.dataServices.userRegistration.UserRegistrationUsingComcast;

/**  
 * Class Name: ValidateChangePinCodeByEnteringInvalidPinLength
 * Description: This test case validates Pin by entering invalid pin length
 * by logging registered user into Comcast application.
 * **/

public class ValidateChangePinCodeByEnteringInvalidPinLength extends BaseTest{
	UserLoginFunctions userLogin=new UserLoginFunctions();
	UserRegistrationUsingComcast userReg=new UserRegistrationUsingComcast();  
		
	@Test
	public void testChangePinCodeByEnteringInvalidPinLength() throws Exception {
	
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
	    
	    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*HOME[\\s\\S]*$"));
	    
	    driver.findElement(By.cssSelector("span.translation_missing")).click();
	    
	    driver.findElement(By.linkText("Change pin code")).click();
	    
	    driver.findElement(By.name("cc_pin_code")).clear();
	    driver.findElement(By.name("cc_pin_code")).sendKeys(DataServiceProperties._INVALID_CC_PIN_CODE_LENGTH);
	    
	    driver.findElement(By.name("commit")).click();
	    
	    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Pin code has not been updated[\\s\\S]*$"));
	    
	    driver.findElement(By.linkText("Sign out")).click();
	}
}
