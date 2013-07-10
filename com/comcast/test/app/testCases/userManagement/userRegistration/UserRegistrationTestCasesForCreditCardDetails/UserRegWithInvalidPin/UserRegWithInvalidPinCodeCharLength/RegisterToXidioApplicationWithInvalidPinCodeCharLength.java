package comcast.test.app.testCases.userManagement.userRegistration.UserRegistrationTestCasesForCreditCardDetails.UserRegWithInvalidPin.UserRegWithInvalidPinCodeCharLength;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import comcast.test.config.configServices.DataServiceProperties;
import comcast.test.config.configServices.utils.BaseTest;
import comcast.test.app.common.userManagement.userRegistration.common.UserRegistrationFunction;
import comcast.test.app.common.userManagement.userRegistration.common.UserRegistrationValidationFuncitons;

/** Class Name: RegisterToXidioApplicationWithInvalidPinCodeCharLength
 *  Description: This test case is for user registration to comcast application
 *  by entering invalid Pin code character length
 * **/

public class RegisterToXidioApplicationWithInvalidPinCodeCharLength extends
	BaseTest {
	
	UserRegistrationFunction useRegFun = new UserRegistrationFunction();
	UserRegistrationValidationFuncitons userRegVal = new UserRegistrationValidationFuncitons();

	@Test
	public void testRegisterToXidioApplicationWithInvalidPinCodeCharLength()
		throws Exception {

		driver.get(DataServiceProperties.APPURL);
		Thread.sleep(sleepTime);
		
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(sleepTime);

		//This method is used to enter registration fields details
		useRegFun.RegistrationDetails(driver);

		driver.findElement(By.name("terms_conditions")).click();

		driver.findElement(By.linkText("Next")).click();

		//This method is used to verify invalid security code character length
		userRegVal.ValidateInvalidPinCodeCharLength(driver);
		
		//driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		Thread.sleep(sleepTime);
		driver.findElement(By.linkText("Next")).click();		
		
		assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Please enter Create-pin code 4 characters long[\\s\\S]*$"));
	}
}
