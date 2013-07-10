package comcast.test.app.testCases.userManagement.profileManagement.RegisteredUserTestCasesForEditProfileDetails.ValidateFirstNameField;

import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import comcast.test.config.configServices.DataServiceProperties;
import comcast.test.config.configServices.utils.BaseTest;
import comcast.test.app.common.userManagement.userLogin.common.UserLoginFunctions;

/**
 * Class Name: EditXidioFirstNameInProfileManagement
 * Description: This test case edits First Name field in Profile Management
 * by logging registered user into Comcast application.
 **/

public class EditXidioFirstNameInProfileManagement extends BaseTest {
	
	UserLoginFunctions userLogin = new UserLoginFunctions();

	@Test
	public void testEditXidioFirstNameInProfileManagement() throws Exception {

		driver.get(DataServiceProperties.APPURL);

		//This method is used to enter user name and password credential
		userLogin.UserLoginCredentials(driver);
		
		driver.findElement(By.id("user_login")).click();

		driver.findElement(By.linkText(DataServiceProperties._USER_NAME)).click();

		driver.findElement(By.name("user[first_name]")).clear();
		driver.findElement(By.name("user[first_name]")).sendKeys(DataServiceProperties._UPD_FIRST_NAME);

		driver.findElement(By.linkText("Save profile")).click();

		assertEquals("",driver.findElement(By.cssSelector("img[alt=\"Comcast Labs, XIDIO\"]")).getText());

		driver.findElement(By.linkText(DataServiceProperties._USER_NAME)).click();

		driver.findElement(By.linkText("Sign out")).click();
	}
}

