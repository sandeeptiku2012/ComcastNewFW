package comcast.test.app.testCases.userManagement.profileManagement.RegisteredUserTestCasesForEditProfileDetails.ValidateCityField;

import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import comcast.test.config.configServices.DataServiceProperties;
import comcast.test.config.configServices.utils.BaseTest;
import comcast.test.app.common.userManagement.userLogin.common.UserLoginFunctions;
import comcast.test.config.dataServices.userRegistration.UserRegistrationUsingComcast;

/**  
 * Class Name: EditXidioCityInProfileManagement
 * Description: This test case edits the Xidio City field in Profile Management by
 * logging registered user into Comcast application.
 * **/

public class EditXidioCityInProfileManagement extends BaseTest{
	
    UserLoginFunctions userLogin=new UserLoginFunctions();
    UserRegistrationUsingComcast userReg = new UserRegistrationUsingComcast();
	
	@Test
    public void testEditXidioCityInProfileManagement() throws Exception {
		
	//This method is used to register new user into Comcast Application
	userReg.testUserRegistrationUsingComcast(driver);
	
	driver.get(DataServiceProperties.APPURL);

    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Sign In[\\s\\S]*$"));
    
    //This method is used to enter user name and password credential
    userLogin.UserLoginCredentials(driver);
    
    driver.findElement(By.id("user_login")).click();
    
	driver.findElement(By.cssSelector("span.translation_missing")).click();
           
    driver.findElement(By.name("user[city]")).clear();
    driver.findElement(By.name("user[city]")).sendKeys(DataServiceProperties._UPD_CITY);
    
    driver.findElement(By.linkText("Save profile")).click();

    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*HOME[\\s\\S]*$"));
	
	driver.findElement(By.cssSelector("span.translation_missing")).click();
    
    assertEquals(DataServiceProperties._UPD_CITY, driver.findElement(By.name("user[city]")).getAttribute("value"));
    
    driver.findElement(By.linkText("Sign out")).click();
  }
}
