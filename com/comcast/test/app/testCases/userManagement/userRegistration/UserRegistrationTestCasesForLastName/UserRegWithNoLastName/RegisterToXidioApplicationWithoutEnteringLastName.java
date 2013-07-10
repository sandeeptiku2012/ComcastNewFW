package comcast.test.app.testCases.userManagement.userRegistration.UserRegistrationTestCasesForLastName.UserRegWithNoLastName;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import comcast.test.config.configServices.DataServiceProperties;
import comcast.test.config.configServices.utils.BaseTest;
import comcast.test.app.common.userManagement.userRegistration.common.UserRegistrationValidationFuncitons;

/**
 * Class Name: RegisterToXidioApplicationWithoutEnteringLastName 
 * Description: This test case registers to Xidio application without entering last name.
 * **/

public class RegisterToXidioApplicationWithoutEnteringLastName extends BaseTest{
	
  UserRegistrationValidationFuncitons userRegValFun=new UserRegistrationValidationFuncitons();
	
  @Test
  public void testRegisterToXidioApplicationWithoutEnteringLastName() throws Exception {
	  
    driver.get(DataServiceProperties.APPURL);
    
    driver.findElement(By.linkText("Register")).click();
    
    //This method is used to validate last name
    userRegValFun.validateLastName(driver);
    
    driver.findElement(By.linkText("Next")).click();
    
    Thread.sleep(sleepTime);
    
    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Last name is required[\\s\\S]*$"));
  }
}
