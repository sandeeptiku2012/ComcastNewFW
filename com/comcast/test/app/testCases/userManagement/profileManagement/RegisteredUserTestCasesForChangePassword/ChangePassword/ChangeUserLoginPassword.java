package comcast.test.app.testCases.userManagement.profileManagement.RegisteredUserTestCasesForChangePassword.ChangePassword;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;

import comcast.test.app.common.userManagement.userLogin.common.UserLoginFunctions;
import comcast.test.config.configServices.DataServiceProperties;
import comcast.test.config.configServices.utils.BaseTest;
import comcast.test.config.dataServices.userRegistration.UserRegistrationUsingComcast;

/**  
 * Class Name: ChangeUserLoginPassword
 * Description: This test case validates changing user login password feature
 * by logging registered user into Comcast application.
 * **/

public class ChangeUserLoginPassword extends BaseTest{
	
  UserLoginFunctions userLogin=new UserLoginFunctions();
  UserRegistrationUsingComcast userReg=new UserRegistrationUsingComcast();
  
  @Test
  public void testLoginToCamcast() throws Exception {
	  
	  //This method is used to register new user into Comcast Application
	  userReg.testUserRegistrationUsingComcast(driver);
	  
	  driver.get(DataServiceProperties.APPURL);
	
	  assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*User name[\\s\\S]*$"));
	  
	  Thread.sleep(sleepTime);
	  assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Password[\\s\\S]*$"));
	    
	  //This method is used to enter user name and password credential
	  userLogin.UserLoginCredentials(driver);
	  
	  driver.findElement(By.id("user_login")).click();
	    
	  //This method is used to Change Password
	  userLogin.ChangePassword(driver);
	  
	  driver.findElement(By.name("commit")).click();
	    
	  assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Sign out[\\s\\S]*$"));
	  
	  driver.findElement(By.linkText("Sign out")).click();
  }
}


