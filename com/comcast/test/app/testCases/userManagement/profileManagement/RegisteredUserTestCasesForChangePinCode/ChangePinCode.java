package comcast.test.app.testCases.userManagement.profileManagement.RegisteredUserTestCasesForChangePinCode;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.openqa.selenium.By;
import comcast.test.config.configServices.DataServiceProperties;
import comcast.test.config.configServices.utils.BaseTest;
import comcast.test.app.common.userManagement.userLogin.common.UserLoginFunctions;

/**  
 * Class Name: ChangePinCode
 * Description: This test case validates user pin code updation feature
 * by logging registered user into Comcast application.
 * **/

public class ChangePinCode extends BaseTest{
	
	UserLoginFunctions userLogin=new UserLoginFunctions();
	
	@Test
	public void testChangePinCode() throws Exception {
		
		driver.get(DataServiceProperties.APPURL);
		
		//This method is used to enter user name and password credential
		userLogin.UserLoginCredentials(driver);
		
		driver.findElement(By.id("user_login")).click();
	    
		driver.findElement(By.linkText(DataServiceProperties._USER_NAME)).click();
		
	    driver.findElement(By.linkText("Change pin code")).click();
	
	    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*User Account[\\s\\S]*$"));
	    
	    driver.findElement(By.name("cc_pin_code")).clear();
	    driver.findElement(By.name("cc_pin_code")).sendKeys(DataServiceProperties._INVALID_CC_PIN_CODE);
	    
	    driver.findElement(By.name("password")).clear();
	    driver.findElement(By.name("password")).sendKeys(DataServiceProperties._INVALID_PASSWORD);
	    
	    driver.findElement(By.name("commit")).click();
	    
	    Thread.sleep(sleepTime);
	    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Pin code has not been updated[\\s\\S]*$"));
	    
	    driver.findElement(By.linkText("Sign out")).click();
	}
}
