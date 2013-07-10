package comcast.test.app.testCases.userManagement.userRegistration.UserRegistrationTestCasesForPassword.UserRegWithInvalidPasswordLength;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import comcast.test.config.configServices.DataServiceProperties;
import comcast.test.config.configServices.utils.BaseTest;
import comcast.test.app.common.userManagement.userRegistration.common.UserRegistrationValidationFuncitons;

/**
 * Class Name: RegisterToXidioApplicationByEnteringInValidLengthOfPassword
 * Description: This test case registers to Xidio application by entering invalid length of password.
 **/

public class RegisterToXidioApplicationByEnteringInValidLengthOfPassword extends BaseTest {

	UserRegistrationValidationFuncitons userRegValFun = new UserRegistrationValidationFuncitons();

	@Test
	public void testRegisterToXidioApplicationByEnteringInValidLengthOfPassword()throws Exception {
		driver.get(DataServiceProperties.APPURL);
		
		driver.findElement(By.linkText("Register")).click();

		//This method is used to validate length of password
		userRegValFun.validateLengthOfPassword(driver);

		driver.findElement(By.linkText("Next")).click();
		
		Thread.sleep(sleepTime);
		
		assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Please enter at least 8 characters in Password[\\s\\S]*$"));

	}
}
