package comcast.test.app.testCases.userManagement.userRegistration.UserRegistrationTestCasesForPassword.UserRegWithNoFirstCapitalLetter;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import comcast.test.config.configServices.DataServiceProperties;
import comcast.test.config.configServices.utils.BaseTest;
import comcast.test.app.common.userManagement.userRegistration.common.UserRegistrationValidationFuncitons;

/**
 * Class Name: RegisterToXidioApplicationByEnteringNonCapitalLetterPassword
 * Description: This test case registers to Xidio application by entering non capital letter password.
 **/

public class RegisterToXidioApplicationByEnteringNonCapitalLetterPassword extends BaseTest {

	UserRegistrationValidationFuncitons userRegValFun = new UserRegistrationValidationFuncitons();

	@Test
	public void testRegisterToXidioApplicationByEnteringNonCapitalLetterPassword()throws Exception {
		driver.get(DataServiceProperties.APPURL);
		
		driver.findElement(By.linkText("Register")).click();

		//This method is used to validate password containing non capital letter.
		userRegValFun.validateNonCapitalLetterPassword(driver);

		driver.findElement(By.linkText("Next")).click();
		
		Thread.sleep(sleepTime);
		
		assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Password should contain at least one uppercase letter\\.[\\s\\S]*$"));
	}
}
