package comcast.test.app.testCases.userManagement.profileManagement.RegisteredUserTestCasesForEditProfileDetails.ValidateZipField;

import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import comcast.test.config.configServices.DataServiceProperties;
import comcast.test.config.configServices.utils.BaseTest;
import comcast.test.app.common.userManagement.userLogin.common.UserLoginFunctions;
import comcast.test.config.dataServices.userRegistration.UserRegistrationUsingComcast;

/**
 * Class Name: EditXidioZipInProfileManagement
 * Description: This test case edit Xidio Zip field in Profile Management
 * by logging registered user into Comcast application.
 **/

public class EditXidioZipInProfileManagement extends BaseTest{
	
  UserLoginFunctions userLogin=new UserLoginFunctions();
  UserRegistrationUsingComcast userReg=new UserRegistrationUsingComcast(); 
	
  @Test
  public void testEditXidioZipInProfileManagement() throws Exception {
	
	//This method is used to register new user into Comcast Application
	userReg.testUserRegistrationUsingComcast(driver);
	  
    driver.get(DataServiceProperties.APPURL);

    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Sign In[\\s\\S]*$"));
    
    //This method is used to enter user name and password credential
    userLogin.UserLoginCredentials(driver);
    
    driver.findElement(By.id("user_login")).click();
    
    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*HOME[\\s\\S]*$"));
    
    driver.findElement(By.cssSelector("span.translation_missing")).click();
    
    assertEquals(DataServiceProperties._ZIP, driver.findElement(By.name("user[zip]")).getAttribute("value"));
    
    driver.findElement(By.name("user[zip]")).clear();
    driver.findElement(By.name("user[zip]")).sendKeys(DataServiceProperties._UPD_ZIP);
    
    driver.findElement(By.linkText("Save profile")).click();
    
    Thread.sleep(sleepTime);
    
    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*HOME[\\s\\S]*$"));
    
    driver.findElement(By.cssSelector("span.translation_missing")).click();
    
    assertEquals(DataServiceProperties._UPD_ZIP, driver.findElement(By.name("user[zip]")).getAttribute("value"));
    
    driver.findElement(By.linkText("Sign out")).click();
  }
}
