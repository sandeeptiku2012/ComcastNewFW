package comcast.test.app.testCases.userManagement.userRegistration.UserRegistrationTestCasesForCreditCardDetails.UserRegWithNoCCNumber;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import comcast.test.config.configServices.DataServiceProperties;
import comcast.test.config.configServices.utils.BaseTest;
import comcast.test.app.common.userManagement.userRegistration.common.UserRegistrationFunction;
import comcast.test.app.common.userManagement.userRegistration.common.UserRegistrationValidationFuncitons;

/** Class Name: RegisterToXidioApplicationWithNoCreditCardNumber
 *  Description: This test case is for user registration to comcast application
 *  without entering credit card number
 * **/

public class RegisterToXidioApplicationWithNoCreditCardNumber extends BaseTest{
	
	UserRegistrationFunction useRegFun=new UserRegistrationFunction();
	UserRegistrationValidationFuncitons userRegVal=new UserRegistrationValidationFuncitons();
	
	@Test
	public void testRegisterToXidioApplicationWithNoCreditCardNumber() throws Exception {
		
		driver.get(DataServiceProperties.APPURL);
		Thread.sleep(sleepTime);
			
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(sleepTime);
		 
		//This method is used to enter registration fields details
	    useRegFun.RegistrationDetails(driver);
	   
	    driver.findElement(By.name("terms_conditions")).click();
	   
	    driver.findElement(By.linkText("Next")).click();
	       
	    //This method is used to verify that credit card number is mandatory field
	    userRegVal.ValidateCreditCardNumberMandatoryField(driver);
	       
	    driver.findElement(By.linkText("Next")).click();
	    
	    driver.findElement(By.cssSelector("a.btn.submit")).click();
	    
	    Thread.sleep(sleepTime);
	    
	    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Credit Card Number is required[\\s\\S]*$"));
	}
}
