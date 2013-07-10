package comcast.test.app.testCases.userManagement.profileManagement.RegisteredUserTestCasesForChangeActivationCode.ValidateActivationCodeRequiredField;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;

import comcast.test.app.common.userManagement.userLogin.common.UserLoginFunctions;
import comcast.test.config.configServices.DataServiceProperties;
import comcast.test.config.configServices.utils.BaseTest;
import comcast.test.config.configServices.utils.TestDataGenerator;
import comcast.test.config.dataServices.userRegistration.UserRegistrationUsingComcast;

/**  
 * Class Name: ValidateUserActivationCodeMandatoryField
 * Description: This test case validates if user activation code is the mandatory field
 * by logging registered user into Comcast application.
 * **/

public class ValidateUserActivationCodeMandatoryField extends BaseTest{
	
	UserLoginFunctions userLogin=new UserLoginFunctions();
	UserRegistrationUsingComcast userReg=new UserRegistrationUsingComcast();
		
	@Test
	public void testUserActivationCodeMandatoryField() throws Exception {
		
		//This method is used to register new user into Comcast Application
		userReg.testUserRegistrationUsingComcast(driver);
		TestDataGenerator.modifyDataProperties();
		
		driver.get(DataServiceProperties.APPURL);
		
		//This method is used to enter user name and password credential
		userLogin.UserLoginCredentials(driver);
		
		driver.findElement(By.id("user_login")).click();
		
		//This method is used to Change Password
		userLogin.ChangePassword(driver);
		
		driver.findElement(By.name("commit")).click();
		
	    driver.findElement(By.linkText(DataServiceProperties._USER_NAME)).click();
	    
	    driver.findElement(By.linkText("Change activation code")).click();
	    
	    Thread.sleep(sleepTime);
	    driver.findElement(By.linkText("Activate")).click();
	  
	    Thread.sleep(sleepTime);
	    assertEquals("Activation code is required",driver.findElement(By.xpath("//*[@id='step-2']/fieldset[1]/div[2]/label/label")).getText());
	    
	    driver.findElement(By.linkText("Sign out")).click();
	}
}
