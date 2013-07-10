package comcast.test.app.testCases.userManagement.profileManagement.RegisteredUserTestCasesForChangePinCode.ValidatePasswordField;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import comcast.test.config.configServices.DataServiceProperties;
import comcast.test.config.configServices.utils.BaseTest;
import comcast.test.app.common.userManagement.profileManagement.common.ProfileManagementScenarioBasedFunctions;
import comcast.test.app.common.userManagement.userLogin.common.UserLoginFunctions;
import comcast.test.config.dataServices.userRegistration.UserRegistrationUsingComcast;

/**  
 * Class Name: ValidateChangePinPasswordByEnteringInvalidPass
 * Description: This test case validates Password by entering invalid Password
 * by logging registered user into Comcast application.
 * **/

public class ValidateChangePasswordByEnteringInvalidPass extends BaseTest{
	
	UserLoginFunctions userLogin=new UserLoginFunctions();
	UserRegistrationUsingComcast userReg=new UserRegistrationUsingComcast();  
	ProfileManagementScenarioBasedFunctions profMangScenarioFun=new ProfileManagementScenarioBasedFunctions();
	
	@Test
	public void testChangePasswordByEnteringInvalidPass() throws Exception {
	
		//This method is used to register new user into Comcast Application	
		userReg.testUserRegistrationUsingComcast(driver);
		
		driver.get(DataServiceProperties.APPURL);
	    
		//This method is used to enter user name and password credential
	    userLogin.UserLoginCredentials(driver);
	    
	    driver.findElement(By.id("user_login")).click();
	    
	    //This method is used to Change Password
	    userLogin.ChangePassword(driver);
	    
	    driver.findElement(By.name("commit")).click();
	    
	    Thread.sleep(sleepTime);
	    
	    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*HOME[\\s\\S]*$"));
	    
	    driver.findElement(By.cssSelector("span.translation_missing")).click();
	    
	    driver.findElement(By.linkText("Change pin code")).click();
	    
	    //This method is used to validate password filed by entering invalid password
	    profMangScenarioFun.ValidatePasswordFieldByEnteringInvalidPass(driver);
	        
	    driver.findElement(By.name("commit")).click();
	    
	    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Pin code has not been updated[\\s\\S]*$"));
	    
	    driver.findElement(By.linkText("Sign out")).click();
	}
}
