package comcast.test.app.testCases.userManagement.userRegistration;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.openqa.selenium.By;
import comcast.test.config.configServices.DataServiceProperties;
import comcast.test.config.configServices.utils.BaseTest;
import comcast.test.app.common.userManagement.userLogin.common.UserLoginFunctions;
import comcast.test.app.common.userManagement.userRegistration.common.UserRegistrationFunction;

/**  
 * Class Name: RegisterToXidioApplicationUsingValidCredentials
 * Description: This test case validates user registration functionality in the Comcast application.
 * **/

public class RegisterToXidioApplicationUsingValidCredentials extends BaseTest{
	
  UserRegistrationFunction userReg=new UserRegistrationFunction();
  UserLoginFunctions userLogin=new UserLoginFunctions();
	
  @Test
  public void testRegisterToXidioApplicationUsingValidCredentials() throws Exception {
	  
	//TestDataGenerator.modifyDataProperties();
			
	driver.get(DataServiceProperties.APPURL);
	
	Thread.sleep(sleepTime);
	
	//Thread.sleep(sleepTime);
	
    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Sign In[\\s\\S]*$"));
    
    driver.findElement(By.linkText("Register")).click();
    
    //This method is used to register new user into Comcast Application
    userReg.RegistrationDetails(driver);    
      
    driver.findElement(By.name("terms_conditions")).click();
    
    driver.findElement(By.linkText("Next")).click();
          
    //This method is used to enter credit card details.
    userReg.CreditCardDetials(driver);
    
    driver.findElement(By.cssSelector("a.btn.submit")).click();
    
    driver.findElement(By.linkText("Skip activation, go to XIDIO")).click();

    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*HOME[\\s\\S]*$"));
    
    driver.findElement(By.linkText("Sign out")).click(); 
    
       
  }
}