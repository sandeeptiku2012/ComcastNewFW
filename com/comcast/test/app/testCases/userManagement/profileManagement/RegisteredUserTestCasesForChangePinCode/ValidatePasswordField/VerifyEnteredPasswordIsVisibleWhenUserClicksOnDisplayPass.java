package comcast.test.app.testCases.userManagement.profileManagement.RegisteredUserTestCasesForChangePinCode.ValidatePasswordField;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;

import comcast.test.app.common.userManagement.userLogin.common.UserLoginFunctions;
import comcast.test.config.configServices.DataServiceProperties;
import comcast.test.config.configServices.utils.BaseTest;
import comcast.test.config.dataServices.userRegistration.UserRegistrationUsingComcast;

/**  
 * Class Name: VerifyEnteredPasswordIsVisibleWhenUserClicksOnDisplayPass
 * Description: This test case Verifies Entered Password is Visible when user clicks on Display Password
 * by logging registered user into Comcast application.
 * **/

public class VerifyEnteredPasswordIsVisibleWhenUserClicksOnDisplayPass extends BaseTest{
	UserLoginFunctions userLogin=new UserLoginFunctions();
	UserRegistrationUsingComcast userReg=new UserRegistrationUsingComcast();  
		
	@Test
	public void testEnteredPasswordIsVisibleWhenUserClicksOnDisplayPass() throws Exception {
	
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
	    
		driver.findElement(By.name("password")).clear();
	    driver.findElement(By.name("password")).sendKeys(DataServiceProperties._PASSWORD);
	    
	    driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
	    
	    assertEquals(DataServiceProperties._PASSWORD, driver.findElement(By.name("password")).getAttribute("value"));
	    
	    Thread.sleep(sleepTime);
	    
	    driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
	    Thread.sleep(sleepTime);
	        
	    driver.findElement(By.linkText("Sign out")).click();
	}
}
