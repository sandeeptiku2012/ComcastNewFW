package comcast.test.app.testCases.userManagement.userRegistration.UserRegistrationTestCasesForPassword.UserRegWithNoPassword;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import comcast.test.config.configServices.DataServiceProperties;
import comcast.test.config.configServices.utils.BaseTest;
import comcast.test.app.common.userManagement.userRegistration.common.UserRegistrationValidationFuncitons;

/**
 * Class Name: RegisterToXidioApplicationWithoutEnteringPassword 
 * Description: This test case registers to Xidio application without entering password.
 * **/

public class RegisterToXidioApplicationWithoutEnteringPassword extends BaseTest{
	
  UserRegistrationValidationFuncitons userRegValFun=new UserRegistrationValidationFuncitons();
  
  @Test
  public void testRegisterToXidioApplicationWithoutEnteringPassword() throws Exception {
	  
    driver.get(DataServiceProperties.APPURL);
    
    driver.findElement(By.linkText("Register")).click();
    
    //This method is used to validate password.
    userRegValFun.validatePassword(driver);
    
    driver.findElement(By.linkText("Next")).click();

    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Password is required[\\s\\S]*$"));
  }
}
