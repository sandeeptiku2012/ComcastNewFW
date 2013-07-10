package comcast.test.app.testCases.userManagement.profileManagement.RegisteredUserTestCasesForChangePassword.ValidateCurrentUserPassWhileChangingPass;

import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import comcast.test.config.configServices.DataServiceProperties;
import comcast.test.config.configServices.utils.BaseTest;
import comcast.test.app.common.userManagement.userLogin.common.UserLoginFunctions;
import comcast.test.config.dataServices.userRegistration.UserRegistrationUsingComcast;

/**  
 * Class Name: ValidateCurrentPasswordWhenChangingPassword
 * Description: This test case validates changing password form Profile Management
 * by registered user into Comcast application.
 * **/
 
public class ValidateCurrentPasswordWhenChangingPassword extends BaseTest{
	
 UserLoginFunctions userLogFun=new UserLoginFunctions();
 UserRegistrationUsingComcast userReg=new UserRegistrationUsingComcast();
 
  @Test
  public void testValidateCurrentPasswordWhenChangingPassword() throws Exception {
	
	//This method is used to register new user into Comcast Application
	userReg.testUserRegistrationUsingComcast(driver);
	
	driver.get(DataServiceProperties.APPURL);
	
	//This method is used to enter user name and password credential
	userLogFun.UserLoginCredentials(driver);
	
	driver.findElement(By.id("user_login")).click();
	
	//This method is used to Change Password
	userLogFun.ChangePassword(driver);
	
	driver.findElement(By.name("commit")).click();
	
	Thread.sleep(sleepTime);
	driver.findElement(By.cssSelector("span.translation_missing")).click();
    
    driver.findElement(By.linkText("Change password")).click();
    
    driver.findElement(By.name("old_password")).clear();
    driver.findElement(By.name("old_password")).sendKeys(DataServiceProperties._NONDIGIT_PASSWORD);
    
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys(DataServiceProperties._RESET_PASSWORD);
    
    driver.findElement(By.name("confirm_password")).clear();
    driver.findElement(By.name("confirm_password")).sendKeys(DataServiceProperties._INVALID_PASSWORD);
    
    driver.findElement(By.name("commit")).click();
   
    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Password has not been updated[\\s\\S]*$"));

    driver.findElement(By.linkText("Sign out")).click();
  }
}

