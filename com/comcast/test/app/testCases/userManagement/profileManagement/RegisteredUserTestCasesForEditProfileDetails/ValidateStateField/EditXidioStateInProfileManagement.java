package comcast.test.app.testCases.userManagement.profileManagement.RegisteredUserTestCasesForEditProfileDetails.ValidateStateField;

import org.junit.*;
import static org.junit.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import comcast.test.config.configServices.DataServiceProperties;
import comcast.test.config.configServices.utils.BaseTest;
import comcast.test.app.common.userManagement.userLogin.common.UserLoginFunctions;
import comcast.test.config.dataServices.userRegistration.UserRegistrationUsingComcast;

/**
 * Class Name: EditXidioStateInProfileManagement
 * Description: This test case edit Xidio state field in Profile Management
 * by logging registered user into Comcast application.
 **/

public class EditXidioStateInProfileManagement extends BaseTest{
	
  UserLoginFunctions userLogin=new UserLoginFunctions();
  UserRegistrationUsingComcast userReg=new UserRegistrationUsingComcast();
	
  @Test
  public void testEditXidioStateInProfileManagement() throws Exception {
	
	//This method is used to register new user into Comcast Application
	userReg.testUserRegistrationUsingComcast(driver); 
	
    driver.get(DataServiceProperties.APPURL);

    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Sign In[\\s\\S]*$"));
    
    //This method is used to enter user name and password credential
    userLogin.UserLoginCredentials(driver);
    
    driver.findElement(By.id("user_login")).click();
     
    driver.findElement(By.className("translation_missing")).click(); 
    
    new Select(driver.findElement(By.name("user[state]"))).selectByVisibleText("AL - Alabama");
    
    driver.findElement(By.cssSelector("option[value=\"AL\"]")).click();
    
    driver.findElement(By.linkText("Save profile")).click();

    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*$"));
    
    driver.findElement(By.className("translation_missing")).click(); 
    
    driver.findElement(By.linkText("Sign out")).click();

  }
}

