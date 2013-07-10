package comcast.test.app.testCases.userManagement.profileManagement.RegisteredUserTestCasesForChangePinCode;

import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import comcast.test.config.configServices.DataServiceProperties;
import comcast.test.config.configServices.utils.BaseTest;
import comcast.test.app.common.userManagement.userLogin.common.UserLoginFunctions;
import comcast.test.config.dataServices.userRegistration.UserRegistrationUsingComcast;

/**  
 * Class Name: VerifyChangePinCodeDetailsUpdatedSuccessfully
 * Description: This test case validates Pin Code Details are updated successfully
 * by logging registered user into Comcast application.
 * **/

public class VerifyChangePinCodeDetailsUpdatedSuccessfully extends BaseTest{
	
	UserLoginFunctions userLogin=new UserLoginFunctions();
	UserRegistrationUsingComcast userReg=new UserRegistrationUsingComcast();
  
    @Test
    public void testVerifyChangePinCodeDetailsUpdatedSuccessfully() throws Exception {
	
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
		
		driver.findElement(By.cssSelector("span.translation_missing")).click();
		
		driver.findElement(By.linkText("Change pin code")).click();
		
		driver.findElement(By.name("cc_pin_code")).clear();
		driver.findElement(By.name("cc_pin_code")).sendKeys(DataServiceProperties._CC_PIN_CODE);
				
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys(DataServiceProperties._PASSWORD);
	   
		driver.findElement(By.name("commit")).click();
		
		try{
				assertEquals("", driver.findElement(By.cssSelector("a.logo")).getText());
	       }
		catch (Error e){
				verificationErrors.append(e.toString());
		   }
			
		driver.findElement(By.linkText("Sign out")).click();
	}
}
