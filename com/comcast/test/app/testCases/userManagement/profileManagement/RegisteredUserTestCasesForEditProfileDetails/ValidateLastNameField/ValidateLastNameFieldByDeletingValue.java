package comcast.test.app.testCases.userManagement.profileManagement.RegisteredUserTestCasesForEditProfileDetails.ValidateLastNameField;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import comcast.test.config.configServices.utils.BaseTest;
import comcast.test.app.common.userManagement.userLogin.common.UserLoginFunctions;
import comcast.test.config.dataServices.userRegistration.UserRegistrationUsingComcast;

/**
 * Class Name: ValidateLastNameFieldByDeletingValue
 * Description: This test case validates Last Name field by deleting the value
 * by logging registered user into Comcast application.
 **/

public class ValidateLastNameFieldByDeletingValue extends BaseTest{
	
  UserRegistrationUsingComcast userRegDS=new UserRegistrationUsingComcast();
  UserLoginFunctions userLogin=new UserLoginFunctions();
	
  @Test
  public void testValidateLastNameFieldByDeletingValueInPM() throws Exception {

	//This method is used to register new user into Comcast Application
	userRegDS.testUserRegistrationUsingComcast(driver);
	
	//This method is used to enter user name and password credential
	userLogin.UserLoginCredentials(driver);
	
	driver.findElement(By.id("user_login")).click();
    
	//This method is used to Change Password
	userLogin.ChangePassword(driver);
	
    driver.findElement(By.name("commit")).click();
	
	Thread.sleep(sleepTime);
	
	driver.findElement(By.cssSelector("span.translation_missing")).click();
	
    driver.findElement(By.name("user[last_name]")).clear();
    driver.findElement(By.name("user[last_name]")).sendKeys("");
    
    driver.findElement(By.linkText("Save profile")).click();
	
    Thread.sleep(sleepTime);
    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Last name is required[\\s\\S]*$"));
    
    driver.findElement(By.linkText("Sign out")).click();
  }
}
