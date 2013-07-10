package comcast.test.app.testCases.userManagement.profileManagement.RegisteredUserTestCasesForEditProfileDetails.ValidateEmailField;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.openqa.selenium.By;
import comcast.test.config.configServices.utils.TestDataGenerator;
import comcast.test.config.configServices.DataServiceProperties;
import comcast.test.config.configServices.utils.BaseTest;
import comcast.test.app.common.userManagement.userLogin.common.UserLoginFunctions;
import comcast.test.config.dataServices.userRegistration.UserRegistrationUsingComcast;

/**  
 * Class Name: EditXidioUserEmail
 * Description: This test case edits Xidio UserEmail field value  by
 * logging registered user into Comcast application.
 * **/

public class EditXidioUserEmail extends BaseTest{
	
	UserRegistrationUsingComcast userRegDS=new UserRegistrationUsingComcast();
	UserLoginFunctions userLogin=new UserLoginFunctions();
	
	@Test
	 public void testEditXidioUserEmail() throws Exception {
	   
		//This method is used to register new user into Comcast Application
		userRegDS.testUserRegistrationUsingComcast(driver);
		
		driver.get(DataServiceProperties.APPURL);
   
		//This method is used to enter user name and password credential
	    userLogin.UserLoginCredentials(driver);
	    
	    driver.findElement(By.id("user_login")).click();
	    
	    //This method is used to Change Password
	    userLogin.ChangePassword(driver);
		
        driver.findElement(By.name("commit")).click();
		
	    Thread.sleep(sleepTime);
	    driver.findElement(By.cssSelector("span.translation_missing")).click();
	    
		//This method is used to update the Email Data Properties fields
		TestDataGenerator.updateEmailDataPropertiesFields();
		
		Thread.sleep(sleepTime);
		
	    driver.findElement(By.name("user[email]")).clear();
	    driver.findElement(By.name("user[email]")).sendKeys(DataServiceProperties._UPD_EMAIL);
	    
	    driver.findElement(By.linkText("Save profile")).click();
		
	    Thread.sleep(sleepTime);
	    driver.findElement(By.cssSelector("span.translation_missing")).click();
		
	    Thread.sleep(sleepTime);
	    
		String userEmail = driver.findElement(By.name("user[email]")).getAttribute("value");
	    System.out.println("test user"+ userEmail);
	    
	    String userTest = DataServiceProperties._UPD_EMAIL;
	    System.out.println("test user"+ userTest);
	    
	    try {
	    	
	        assertEquals("", driver.findElement(By.cssSelector("a.logo")).getText());
	      } 
	    catch (Error e) {
	    	
	        verificationErrors.append(e.toString());
	      }
	    driver.findElement(By.linkText("Sign out")).click();
	  }

}
