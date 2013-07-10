package comcast.test.app.testCases.userManagement.userRegistration.UserRegistrationTestCasesForCreditCardDetails.UserRegWithNoPINCode;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import comcast.test.config.configServices.DataServiceProperties;
import comcast.test.config.configServices.utils.BaseTest;
import comcast.test.app.common.userManagement.userRegistration.common.UserRegistrationFunction;
import comcast.test.app.common.userManagement.userRegistration.common.UserRegistrationValidationFuncitons;

/** Class Name: RegisterToXidioApplicationWithNoPinCode
 *  Description: This test case is for user registration to comcast application
 *  without entering pin code
 * **/

public class RegisterToXidioApplicationWithNoPinCode extends BaseTest{
	
	UserRegistrationFunction useRegFun=new UserRegistrationFunction();
	UserRegistrationValidationFuncitons userRegVal=new UserRegistrationValidationFuncitons();
	
	@Test
	public void testRegisterToXidioApplicationWithNoPincode() throws Exception {
	
		driver.get(DataServiceProperties.APPURL);
		Thread.sleep(sleepTime);
		
	    driver.findElement(By.linkText("Register")).click();
	    Thread.sleep(sleepTime);
		 
	    //This method is used to enter registration fields details
	    useRegFun.RegistrationDetails(driver);
	    
	    driver.findElement(By.name("terms_conditions")).click();
	    
	    driver.findElement(By.linkText("Next")).click();
	    
	    Thread.sleep(sleepTime);
	    
	    //This method is used to verify that Pin code is mandatory field
	    userRegVal.ValidatePinCodeMandatoryField(driver);
		     
	    Thread.sleep(sleepTime);
	    
	    driver.findElement(By.linkText("Next")).click();
	    
	    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Create-pin code is required[\\s\\S]*$"));
    
	}
}
