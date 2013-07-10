package comcast.test.app.testCases.userManagement.userRegistration.UserRegistrationTestCasesForCreditCardDetails.UserRegWithInvalidSecurityCode.UserRegWithInvalidSecurityCodeLength;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;

import comcast.test.app.common.userManagement.userRegistration.common.UserRegistrationFunction;
import comcast.test.app.common.userManagement.userRegistration.common.UserRegistrationValidationFuncitons;
import comcast.test.config.configServices.DataServiceProperties;
import comcast.test.config.configServices.utils.BaseTest;

/** Class Name: ValidateInvalidSecurityCodeLength
 *  Description: This test case is to validate Security Code Length
 *  by registering to Comcast Application.
 * **/

public class ValidateInvalidSecurityCodeLength extends BaseTest{
	
	UserRegistrationFunction useRegFun=new UserRegistrationFunction();
	UserRegistrationValidationFuncitons userRegVal=new UserRegistrationValidationFuncitons();
  
	@Test
	public void terstValidateInvalidSecurityCodeLength() throws Exception {
		
	driver.get(DataServiceProperties.APPURL);
	
	Thread.sleep(sleepTime);
    driver.findElement(By.linkText("Register")).click();
    
    Thread.sleep(sleepTime);
    //This method is used to enter registration fields details
    useRegFun.RegistrationDetails(driver);
    
    driver.findElement(By.name("terms_conditions")).click();
    
    driver.findElement(By.linkText("Next")).click();
    
    Thread.sleep(sleepTime);
    //This method is used to validate security code length	    
    userRegVal.ValidateSecurityCodeLength(driver);
    
    driver.findElement(By.cssSelector("input.change_input_type.ignore")).click();
    
    Thread.sleep(sleepTime);
    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Please enter Security Code 3 characters long[\\s\\S]*$"));
    
    driver.findElement(By.linkText("Next")).click();
  }
}