package comcast.test.app.testCases.userManagement.profileManagement.RegisteredUserTestCasesForChangePassword.ValidateNewAndConfirmPassword;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import comcast.test.config.configServices.DataServiceProperties;
import comcast.test.config.configServices.utils.BaseTest;
import comcast.test.app.common.userManagement.profileManagement.common.ProfileManagementScenarioBasedFunctions;
import comcast.test.app.common.userManagement.userLogin.common.UserLoginFunctions;
import comcast.test.config.dataServices.userRegistration.UserRegistrationUsingComcast;

/**  
 * Class Name: ValidateNewPasswordAndConfirmPasswordMatch
 * Description: This test case validates whether New and Confirm password matches 
 * for registered user into Comcast application.
 * **/

public class ValidateNewPasswordAndConfirmPasswordMatch extends BaseTest{
	
	UserLoginFunctions userLogFun=new UserLoginFunctions();
	ProfileManagementScenarioBasedFunctions profMangScenarioFun=new ProfileManagementScenarioBasedFunctions();
	UserRegistrationUsingComcast userReg=new UserRegistrationUsingComcast();
	
	@Test
  public void testVerifyPasswordChangeWorks() throws Exception {
	
	//This method is used to register new user into Comcast Application
	userReg.testUserRegistrationUsingComcast(driver);
	
	driver.get(DataServiceProperties.APPURL);
	
	//This method is used to enter user name and password credential
	userLogFun.UserLoginCredentials(driver);
	
	driver.findElement(By.id("user_login")).click();
    
	driver.findElement(By.cssSelector("span.translation_missing")).click();
   
    driver.findElement(By.linkText("Change password")).click();
    
    //This method is used to validate whether new and confirm password matches
    profMangScenarioFun.VerifyNewPassAndConfirmPassMatch(driver);
    Thread.sleep(sleepTime);
    
    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Passwords doesn't match[\\s\\S]*$"));
    
    driver.findElement(By.linkText("Sign out")).click();
  }
}
