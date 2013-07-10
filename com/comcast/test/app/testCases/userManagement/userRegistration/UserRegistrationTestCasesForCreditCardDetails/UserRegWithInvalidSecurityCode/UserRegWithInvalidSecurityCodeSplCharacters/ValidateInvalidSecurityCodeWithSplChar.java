package comcast.test.app.testCases.userManagement.userRegistration.UserRegistrationTestCasesForCreditCardDetails.UserRegWithInvalidSecurityCode.UserRegWithInvalidSecurityCodeSplCharacters;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;

import comcast.test.app.common.userManagement.userRegistration.common.UserRegistrationFunction;
import comcast.test.app.common.userManagement.userRegistration.common.UserRegistrationValidationFuncitons;
import comcast.test.config.configServices.DataServiceProperties;
import comcast.test.config.configServices.utils.BaseTest;

/** Class Name: ValidateInvalidSecurityCodeWithSplChar
 *  Description: This test case is to validate Security Code with special character
 *  by registering to Comcast Application.
 * **/

public class ValidateInvalidSecurityCodeWithSplChar extends BaseTest{
	
	UserRegistrationFunction useRegFun=new UserRegistrationFunction();
	UserRegistrationValidationFuncitons userRegVal=new UserRegistrationValidationFuncitons();
	
	@Test
	public void testInvalidSecurityCodeWithSplChar() throws Exception {
		
	driver.get(DataServiceProperties.APPURL);
	
	Thread.sleep(sleepTime);
    driver.findElement(By.linkText("Register")).click();
    
    Thread.sleep(sleepTime);
    //This method is used to enter registration fields details
    useRegFun.RegistrationDetails(driver);
    
    driver.findElement(By.linkText("Next")).click();
    
    driver.findElement(By.id("terms_conditions_accept")).click();
    
    //This method validates Security Code with invalid data
    userRegVal.ValidateInvalidSecurityCodeNumber(driver);
    
    driver.findElement(By.cssSelector("input.change_input_type.ignore")).click();
  
    Thread.sleep(sleepTime);
    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Please enter only digits in Security Code[\\s\\S]*$"));
    
    driver.findElement(By.linkText("Next")).click();
	}

}
