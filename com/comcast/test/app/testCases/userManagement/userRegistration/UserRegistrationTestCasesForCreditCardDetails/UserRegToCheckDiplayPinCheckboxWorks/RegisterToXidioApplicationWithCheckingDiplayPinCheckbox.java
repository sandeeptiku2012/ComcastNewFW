package comcast.test.app.testCases.userManagement.userRegistration.UserRegistrationTestCasesForCreditCardDetails.UserRegToCheckDiplayPinCheckboxWorks;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;

import comcast.test.app.common.userManagement.userRegistration.common.UserRegistrationFunction;
import comcast.test.config.configServices.DataServiceProperties;
import comcast.test.config.configServices.utils.BaseTest;

/** Class Name: RegisterToXidioApplicationWithCheckingDisplayPinCheckbox
 *  Description: This test case is for user registration to comcast application
 *  by checking Display Pin Checkbox
 * **/

public class RegisterToXidioApplicationWithCheckingDiplayPinCheckbox extends BaseTest{
	
	UserRegistrationFunction useRegFun=new UserRegistrationFunction();
		
	@Test
	public void testRegisterToXidioApplicationWithCheckingDiplayPinCheckbox() throws Exception {
		
		driver.get(DataServiceProperties.APPURL);
		Thread.sleep(sleepTime);
		
	    driver.findElement(By.linkText("Register")).click();
	    Thread.sleep(sleepTime);
	    
	    //This method is used to enter registration fields details
	    useRegFun.RegistrationDetails(driver);
	    
	    driver.findElement(By.name("terms_conditions")).click();
	    
	    driver.findElement(By.linkText("Next")).click();	  
	    
	    //This method is used to enter user's credit card details
	    useRegFun.CreditCardDetials(driver);
	   	      
	    driver.findElement(By.cssSelector("input.change_input_type.ignore")).click();
	    
	    assertEquals(DataServiceProperties._CC_PIN_CODE, driver.findElement(By.name("user[cc_pin_code]")).getAttribute("value"));
	    
	    driver.findElement(By.linkText("Next")).click();
	    
	 }
}
