package comcast.test.app.testCases.userManagement.userRegistration.UserRegistrationTestCasesForMobileNumber.UserRegWithNoMobileNumber;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import comcast.test.config.configServices.DataServiceProperties;
import comcast.test.config.configServices.utils.BaseTest;
import comcast.test.app.common.userManagement.userRegistration.common.UserRegistrationValidationFuncitons;

/**
 * Class Name: RegisterToXidioApplicationWithoutEnteringMobileNumber 
 * Description: This test case registers to Xidio application without entering mobile number.
 * **/

public class RegisterToXidioApplicationWithoutEnteringMobileNumber extends BaseTest{
	
  UserRegistrationValidationFuncitons userRegValFun=new UserRegistrationValidationFuncitons();

  @Test
  public void testRegisterToXidioApplicationWithoutEnteringMobileNumber() throws Exception {
	  
	driver.get(DataServiceProperties.APPURL);
	
    driver.findElement(By.linkText("Register")).click();
    
    //This method is used to validate mobile number
    userRegValFun.validateMobileNumber(driver);
    
    driver.findElement(By.linkText("Next")).click();

    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Mobile number is required[\\s\\S]*$"));
  }
}
