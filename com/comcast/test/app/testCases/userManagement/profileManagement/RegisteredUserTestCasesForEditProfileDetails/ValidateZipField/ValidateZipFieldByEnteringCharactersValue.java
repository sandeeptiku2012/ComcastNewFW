package comcast.test.app.testCases.userManagement.profileManagement.RegisteredUserTestCasesForEditProfileDetails.ValidateZipField;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import comcast.test.config.configServices.DataServiceProperties;
import comcast.test.config.configServices.utils.BaseTest;
import comcast.test.app.common.userManagement.userLogin.common.UserLoginFunctions;
import comcast.test.config.dataServices.userRegistration.UserRegistrationUsingComcast;

/**
 * Class Name: ValidateZipFieldByEnteringCharactersValue
 * Description: This test case validates Zip field by entering characters value
 * by logging registered user into Comcast application.
 **/

public class ValidateZipFieldByEnteringCharactersValue extends BaseTest{
	
  UserRegistrationUsingComcast userRegDS=new UserRegistrationUsingComcast();
  UserLoginFunctions userLogin=new UserLoginFunctions();
	
  @Test
  public void testValidateZipFieldByCharValue() throws Exception {

	//This method is used to register new user into Comcast Application
	userRegDS.testUserRegistrationUsingComcast(driver);
	
	//This method is used to enter user name and password credential
	userLogin.UserLoginCredentials(driver);
	
	driver.findElement(By.id("user_login")).click();
    
	//This method is used to Change Password
	userLogin.ChangePassword(driver);
	
	driver.findElement(By.name("commit")).click();
	
	driver.findElement(By.cssSelector("span.translation_missing")).click();
	
    driver.findElement(By.name("user[zip]")).clear();
    driver.findElement(By.name("user[zip]")).sendKeys(DataServiceProperties._INVALID_ZIP);
    
    driver.findElement(By.linkText("Save profile")).click();
    
    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Please enter only digits in Zip[\\s\\S]*$"));
    
    driver.findElement(By.linkText("Sign out")).click();
  }
}
