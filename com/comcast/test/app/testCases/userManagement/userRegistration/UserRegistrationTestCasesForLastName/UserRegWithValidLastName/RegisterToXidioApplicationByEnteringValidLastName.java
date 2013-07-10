package comcast.test.app.testCases.userManagement.userRegistration.UserRegistrationTestCasesForLastName.UserRegWithValidLastName;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;

import comcast.test.app.common.userManagement.userRegistration.common.UserRegistrationFunction;
import comcast.test.config.configServices.DataServiceProperties;
import comcast.test.config.configServices.utils.BaseTest;

/**
 * Class Name: RegisterToXidioApplicationByEnteringValidLastName 
 * Description: This test case registers to Xidio application by entering valid last name.
 * **/

public class RegisterToXidioApplicationByEnteringValidLastName extends BaseTest {
	
	UserRegistrationFunction userRegFun = new UserRegistrationFunction();
	
	@Test
	public void testRegisterToXidioApplicationByEnteringValidLastName() throws Exception {
		
		driver.get(DataServiceProperties.APPURL);
		
		driver.findElement(By.linkText("Register")).click();
		
		//This method is used to validate last name.
		userRegFun.RegistrationDetails(driver);
		
		driver.findElement(By.name("terms_conditions")).click();
		
		driver.findElement(By.linkText("Next")).click();
		
		Thread.sleep(sleepTime);
		
		//This method is used to enter credit card details
		userRegFun.CreditCardDetials(driver);
		
		driver.findElement(By.cssSelector("a.btn.submit")).click();
		
		Thread.sleep(sleepTime);
	    
	    driver.findElement(By.name("user[activation_code]")).clear();
	    
	    driver.findElement(By.linkText("Activate")).click();
	    
	    Thread.sleep(sleepTime);
	    
	    driver.findElement(By.linkText("Skip activation, go to XIDIO")).click();
	
	    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*$"));
	    
	    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*HOME[\\s\\S]*$"));
	    
	    driver.findElement(By.linkText("Sign out")).click();
		
	}
}
