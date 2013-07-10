package comcast.test.app.testCases.userManagement.profileManagement.RegisteredUserTestCasesForChangePaymentInfo.ValidateExpiryMonthField;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import comcast.test.config.configServices.DataServiceProperties;
import comcast.test.config.configServices.utils.BaseTest;
import comcast.test.app.common.userManagement.profileManagement.common.ProfileManagementScenarioBasedFunctions;
import comcast.test.app.common.userManagement.userLogin.common.UserLoginFunctions;
import comcast.test.config.dataServices.userRegistration.UserRegistrationUsingComcast;

/**  
 * Class Name: ValidatePaymentInfoMonthMandatoryField
 * Description: This test case validates payment Details Month Mandatory field
 * By logging registered user into Comcast application.
 * **/

public class ValidatePaymentInfoMonthMandatoryField extends BaseTest{
	
	  UserLoginFunctions userLogin=new UserLoginFunctions();
	  UserRegistrationUsingComcast userReg=new UserRegistrationUsingComcast();
	  ProfileManagementScenarioBasedFunctions profMangScenarioFun=new ProfileManagementScenarioBasedFunctions();
	
	  @Test
	  public void testMonthMandatoryField() throws Exception {
		
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
	    
	    driver.findElement(By.linkText("Change payment info")).click();
	    
	    //This method is used to validate Payment Info Month mandatory field
	    profMangScenarioFun.ValidatePaymentInfoMonthMandatoryField(driver);
	    
	    driver.findElement(By.name("commit")).click();
	    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Expiration Month is required[\\s\\S]*$"));
	    
	    driver.findElement(By.cssSelector("#uniform-undefined > span")).click();
	    
	    Thread.sleep(sleepTime);
	    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Payment info has not been updated[\\s\\S]*$"));
	    
	    driver.findElement(By.linkText("Sign out")).click();
	}
}

