package comcast.test.app.testCases.userManagement.userRegistration.UserRegistrationTestCasesForFirstName.UserRegWithNoFirstName;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import comcast.test.config.configServices.DataServiceProperties;
import comcast.test.config.configServices.utils.BaseTest;
import comcast.test.app.common.userManagement.userRegistration.common.UserRegistrationValidationFuncitons;

/**
 * Class Name: RegisterToXidioApplicationWithoutEnteringFirstName 
 * Description: This test case registers to Xidio application without entering first name.
 * **/

public class RegisterToXidioApplicationWithoutEnteringFirstName extends BaseTest{
	
  UserRegistrationValidationFuncitons userRegValFun=new UserRegistrationValidationFuncitons();
	
  @Test
  public void testRegisterToXidioApplicationWithoutEnteringFirstName() throws Exception {
	  
    driver.get(DataServiceProperties.APPURL);
    
    driver.findElement(By.linkText("Register")).click();
    
    //This method is used to validate first name.
    userRegValFun.validateFirstName(driver);
    
    driver.findElement(By.linkText("Next")).click();
    
    Thread.sleep(sleepTime);
    
    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*First name is required[\\s\\S]*$"));
  }
}
