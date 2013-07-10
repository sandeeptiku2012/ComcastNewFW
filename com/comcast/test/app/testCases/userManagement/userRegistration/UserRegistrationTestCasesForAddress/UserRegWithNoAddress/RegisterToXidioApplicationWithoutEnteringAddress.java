package comcast.test.app.testCases.userManagement.userRegistration.UserRegistrationTestCasesForAddress.UserRegWithNoAddress;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import comcast.test.config.configServices.DataServiceProperties;
import comcast.test.config.configServices.utils.BaseTest;
import comcast.test.app.common.userManagement.userRegistration.common.UserRegistrationValidationFuncitons;

/** Class Name: RegisterToXidioApplicationWithoutEnteringAddress
 *  Description: This test case is for user registration to comcast application
 *  Without Entering Address
 * **/

public class RegisterToXidioApplicationWithoutEnteringAddress extends BaseTest{
	
	UserRegistrationValidationFuncitons userRegValFun=new UserRegistrationValidationFuncitons();
		
	@Test
	public void testRegisterToXidioApplicationWithoutEnteringAddress() throws Exception {
		
	    driver.get(DataServiceProperties.APPURL);
	    
	    driver.findElement(By.linkText("Register")).click();
	    
	    //This method is used to verify Address field in registration page
	    userRegValFun.validateAddress(driver);
	    
	    driver.findElement(By.linkText("Next")).click();
	    
	    Thread.sleep(sleepTime);
	    
	    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Address is required[\\s\\S]*$"));
	}
}