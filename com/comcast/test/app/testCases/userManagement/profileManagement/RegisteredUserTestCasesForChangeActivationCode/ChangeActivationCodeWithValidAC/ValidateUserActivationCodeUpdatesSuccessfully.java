package comcast.test.app.testCases.userManagement.profileManagement.RegisteredUserTestCasesForChangeActivationCode.ChangeActivationCodeWithValidAC;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.openqa.selenium.By;
import comcast.test.config.configServices.DataServiceProperties;
import comcast.test.config.configServices.utils.BaseTest;
import comcast.test.app.common.userManagement.profileManagement.common.ProfileManagementScenarioBasedFunctions;
import comcast.test.app.common.userManagement.userLogin.common.UserLoginFunctions;
import comcast.test.config.dataServices.userRegistration.UserRegistrationUsingComcast;

/**  
 * Class Name: ValidateUserActivationCodeUpdatesSuccessfully
 * Description: This test case validates activation code is updated successfully
 * by logging registered user into Comcast application.
 * **/

public class ValidateUserActivationCodeUpdatesSuccessfully extends BaseTest{
	
	UserLoginFunctions userLogin=new UserLoginFunctions();
	UserRegistrationUsingComcast userRegistrationDS=new UserRegistrationUsingComcast();
	ProfileManagementScenarioBasedFunctions profManagementScenario=new ProfileManagementScenarioBasedFunctions();
		
	@Test
	public void testUserActivationCodeUpdatesSuccessfully() throws Exception {
		
		//This method is used to register new user into Comcast Application
		userRegistrationDS.testUserRegistrationUsingComcast(driver);
			
		driver.get(DataServiceProperties.APPURL);
		
		//This method is used to enter user name and password credential
		userLogin.UserLoginCredentials(driver);
		
		driver.findElement(By.id("user_login")).click();
	    
		//This method is used to Change Password
		userLogin.ChangePassword(driver);
		
		driver.findElement(By.name("commit")).click();
		
		Thread.sleep(sleepTime);		
		driver.findElement(By.cssSelector("span.translation_missing")).click();
	    
	    driver.findElement(By.linkText("Change activation code")).click();
	    
	    //This method is used to update activation code
	    profManagementScenario.UpdateActivationCode(driver);
	    	    
	    driver.findElement(By.linkText("Activate")).click();
	  
	    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*HOME[\\s\\S]*$"));
	    
	    driver.findElement(By.linkText("Sign out")).click();
	}
}
