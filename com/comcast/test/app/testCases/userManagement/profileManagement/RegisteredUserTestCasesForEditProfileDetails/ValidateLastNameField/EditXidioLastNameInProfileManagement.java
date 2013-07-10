package comcast.test.app.testCases.userManagement.profileManagement.RegisteredUserTestCasesForEditProfileDetails.ValidateLastNameField;

import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import comcast.test.config.configServices.DataServiceProperties;
import comcast.test.config.configServices.utils.BaseTest;
import comcast.test.app.common.userManagement.userLogin.common.UserLoginFunctions;
import comcast.test.config.dataServices.userRegistration.UserRegistrationUsingComcast;

/**
 * Class Name: EditXidioLastNameInProfileManagement
 * Description: This test case edits Xidio Last Name in Profile Management
 * by logging registered user into Comcast application.
 **/

public class EditXidioLastNameInProfileManagement extends BaseTest{
	
  UserLoginFunctions userLogin=new UserLoginFunctions();
  UserRegistrationUsingComcast userReg=new UserRegistrationUsingComcast();
	 
  @Test
  public void testEditXidioLastNameInProfileManagement() throws Exception {
	
	//This method is used to register new user into Comcast Application
	userReg.testUserRegistrationUsingComcast(driver);
	
    driver.get(DataServiceProperties.APPURL);

    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Sign In[\\s\\S]*$"));
    
    //This method is used to enter user name and password credential
    userLogin.UserLoginCredentials(driver);
    
    driver.findElement(By.id("user_login")).click();
      
    //This method is used to Change Password
    userLogin.ChangePassword(driver);
	
    driver.findElement(By.name("commit")).click();
	
    Thread.sleep(sleepTime);
        
    driver.findElement(By.className("translation_missing")).click();  
    
    driver.findElement(By.name("user[last_name]")).clear();
    driver.findElement(By.name("user[last_name]")).sendKeys(DataServiceProperties._UPD_LAST_NAME);
    
    driver.findElement(By.linkText("Save profile")).click();
             
    Thread.sleep(sleepTime);
    driver.findElement(By.className("translation_missing")).click();  
	
    assertEquals(DataServiceProperties._UPD_LAST_NAME, driver.findElement(By.name("user[last_name]")).getAttribute("value"));
    
    driver.findElement(By.linkText("Sign out")).click();
    
  }
}
