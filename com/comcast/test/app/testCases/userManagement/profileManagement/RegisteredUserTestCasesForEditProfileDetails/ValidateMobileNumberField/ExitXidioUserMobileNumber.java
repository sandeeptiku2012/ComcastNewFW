package comcast.test.app.testCases.userManagement.profileManagement.RegisteredUserTestCasesForEditProfileDetails.ValidateMobileNumberField;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import comcast.test.config.configServices.DataServiceProperties;
import comcast.test.config.configServices.utils.BaseTest;
import comcast.test.app.common.userManagement.userLogin.common.UserLoginFunctions;
import comcast.test.config.dataServices.userRegistration.UserRegistrationUsingComcast;

/**
 * Class Name: ExitXidioUserMobileNumber
 * Description: This test case exits Xidio user mobile number
 * by logging registered user into Comcast application.
 **/

public class ExitXidioUserMobileNumber extends BaseTest{
	
	UserRegistrationUsingComcast userRegDS=new UserRegistrationUsingComcast();
	UserLoginFunctions userLogin=new UserLoginFunctions();
	
	@Test
	public void testEditXidioUserMobileNumber() throws Exception {
		
		//This method is used to register new user into Comcast Application
	    userRegDS.testUserRegistrationUsingComcast(driver);
	    
		driver.get(DataServiceProperties.APPURL);
		
	    //This method is used to enter user name and password credential
	    userLogin.UserLoginCredentials(driver);
	    
	    driver.findElement(By.id("user_login")).click();
	    
	    //This method is used to Change Password
	    userLogin.ChangePassword(driver);
	    
        driver.findElement(By.name("commit")).click();
		
	    Thread.sleep(sleepTime);
		
	    driver.findElement(By.cssSelector("span.translation_missing")).click();
	    		
		Thread.sleep(sleepTime);
	    
	    driver.findElement(By.name("user[mobile_number]")).clear();
	    driver.findElement(By.name("user[mobile_number]")).sendKeys(DataServiceProperties._UPD_MOBILE_NUMBER);
	    
	    driver.findElement(By.linkText("Save profile")).click();
	    
	    driver.findElement(By.cssSelector("span.translation_missing")).click();
	    
	    assertEquals(DataServiceProperties._MOBILE_NUMBER, driver.findElement(By.name("user[mobile_number]")).getAttribute("value"));
	    
	    Thread.sleep(sleepTime);
	    
	    driver.findElement(By.linkText("Sign out")).click();
	  }
}
