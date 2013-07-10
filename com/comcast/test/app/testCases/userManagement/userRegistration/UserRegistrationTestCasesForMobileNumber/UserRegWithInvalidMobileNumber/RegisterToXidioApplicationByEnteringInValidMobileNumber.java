package comcast.test.app.testCases.userManagement.userRegistration.UserRegistrationTestCasesForMobileNumber.UserRegWithInvalidMobileNumber;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import comcast.test.config.configServices.DataServiceProperties;
import comcast.test.config.configServices.utils.BaseTest;
import comcast.test.app.common.userManagement.userRegistration.common.UserRegistrationValidationFuncitons;

/**
 * Class Name: RegisterToXidioApplicationByEnteringInValidMobileNumber 
 * Description: This test case registers to Xidio application by entering invalid mobile number.
 * **/

public class RegisterToXidioApplicationByEnteringInValidMobileNumber extends BaseTest{
	
	UserRegistrationValidationFuncitons userRegValFun=new UserRegistrationValidationFuncitons();
	
	@Test
	public void testRegisterToXidioApplicationByEnteringInValidMobileNumber() throws Exception {
		
		driver.get(DataServiceProperties.APPURL);
		
	    driver.findElement(By.linkText("Register")).click();
	    
	    //This method is used to validate invalid mobile number
	    userRegValFun.validateInvalidMobileNumber(driver);
	    
	    driver.findElement(By.linkText("Next")).click();
	    
	    Thread.sleep(sleepTime);
	    
	    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Please enter a valid Mobile number[\\s\\S]*$"));
	}
}