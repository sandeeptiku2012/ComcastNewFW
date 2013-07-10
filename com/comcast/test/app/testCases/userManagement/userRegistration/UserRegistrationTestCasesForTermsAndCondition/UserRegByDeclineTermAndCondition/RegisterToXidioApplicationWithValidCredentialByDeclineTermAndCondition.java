package comcast.test.app.testCases.userManagement.userRegistration.UserRegistrationTestCasesForTermsAndCondition.UserRegByDeclineTermAndCondition;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import comcast.test.config.configServices.DataServiceProperties;
import comcast.test.config.configServices.utils.BaseTest;
import comcast.test.config.dataServices.userRegistration.UserRegistrationUsingComcast;
import comcast.test.app.common.userManagement.userRegistration.common.UserRegistrationFunction;

/**
 * Class Name: RegisterToXidioApplicationWithValidCredentialByDeclineTermAndCondition 
 * Description: This test case registers to Xidio application by entering valid credential without 
 * accepting Terms And Condition.
 * **/

public class RegisterToXidioApplicationWithValidCredentialByDeclineTermAndCondition extends BaseTest{
	
  UserRegistrationFunction urf=new UserRegistrationFunction();
  UserRegistrationUsingComcast userReg=new UserRegistrationUsingComcast();
  
  @Test
  public void testRegistrationToXidioApplicationWithValidCredentialByDeclingTermAndCondition() throws Exception {
	
	driver.manage().deleteAllCookies();
	
	//This method is used to register new user into Comcast Application
	userReg.testUserRegistrationUsingComcast(driver);
	  
	driver.get(DataServiceProperties.APPURL);
	
	driver.findElement(By.linkText("Register")).click();
    
	//This method is user to enter registration fields details
    urf.RegistrationDetails(driver);
    
    driver.findElement(By.linkText("Next")).click();
    
    driver.findElement(By.id("terms_conditions_decline")).click();
    
    Thread.sleep(sleepTime);
    
    try {
    	
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*You have to agree to terms and conditions[\\s\\S]*$"));
    } 
    catch (Error e) {
    	
      verificationErrors.append(e.toString());
    }
  }
}
