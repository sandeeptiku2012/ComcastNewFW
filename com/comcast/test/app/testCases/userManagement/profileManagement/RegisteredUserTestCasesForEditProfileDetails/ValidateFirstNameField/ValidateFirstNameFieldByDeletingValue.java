package comcast.test.app.testCases.userManagement.profileManagement.RegisteredUserTestCasesForEditProfileDetails.ValidateFirstNameField;

import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import comcast.test.config.configServices.DataServiceProperties;
import comcast.test.config.configServices.utils.BaseTest;
import comcast.test.app.common.userManagement.userLogin.common.UserLoginFunctions;
import comcast.test.config.dataServices.userRegistration.UserRegistrationUsingComcast;

/**
 * Class Name: ValidateFirstNameFieldByDeletingValue
 * Description: This test case validates first name field by deleting the value
 * by logging registered user into Comcast application.
 **/

public class ValidateFirstNameFieldByDeletingValue extends BaseTest{
	
  UserRegistrationUsingComcast userReg=new UserRegistrationUsingComcast();
  UserLoginFunctions userLogin=new UserLoginFunctions();
	
  @Test
  public void testValidateFirstNameFieldByDeletingValueInPM() throws Exception {
	
	//This method is used to register new user into Comcast Application
	userReg.testUserRegistrationUsingComcast(driver);
	
	driver.get(DataServiceProperties.APPURL);
	
	assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Sign In[\\s\\S]*$"));	
	
	//This method is used to enter user name and password credential
	userLogin.UserLoginCredentials(driver);
	
	driver.findElement(By.id("user_login")).click();
	
	//This method is used to Change Password
	userLogin.ChangePassword(driver);
	
    driver.findElement(By.name("commit")).click();
	
	Thread.sleep(sleepTime);
    
	driver.findElement(By.cssSelector("span.translation_missing")).click();
	
    driver.findElement(By.name("user[first_name]")).clear();
    driver.findElement(By.name("user[first_name]")).sendKeys("");
    
    driver.findElement(By.linkText("Save profile")).click();
    
    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*First name is required[\\s\\S]*$"));
    
    driver.findElement(By.linkText("Sign out")).click();
  }
}
