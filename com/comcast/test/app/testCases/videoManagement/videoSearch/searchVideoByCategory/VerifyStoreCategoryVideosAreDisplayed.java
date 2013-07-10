package comcast.test.app.testCases.videoManagement.videoSearch.searchVideoByCategory;

import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;

import comcast.test.config.configServices.DataServiceProperties;
import comcast.test.config.configServices.utils.BaseTest;
import comcast.test.config.dataServices.userRegistration.UserRegistrationUsingComcast;
import comcast.test.app.common.userManagement.userLogin.common.UserLoginFunctions;

/**
 * Class Name: VerifyStoreCategoryVideosAreDisplayed 
 * Description: This test case is used to verify Store category video/videos are displayed
 * for registered Comcast Application user.
 * **/

public class VerifyStoreCategoryVideosAreDisplayed extends BaseTest{
  
  UserLoginFunctions userLogin=new UserLoginFunctions();
  UserRegistrationUsingComcast userReg = new UserRegistrationUsingComcast();
  
  @Test
  public void testVerifyStoreCategoryVideosAreDisplayed() throws Exception {
	
	//This method is used to register new user into Comcast Application
	userReg.testUserRegistrationUsingComcast(driver);
	  
	driver.get(DataServiceProperties.APPURL);
    
	//This method is used to enter user name and password credential
	userLogin.UserLoginCredentials(driver);
	
	driver.findElement(By.id("user_login")).click();
    
	//This method is used to Change Password
	userLogin.ChangePassword(driver);
	
	driver.findElement(By.name("commit")).click();
	
	driver.findElement(By.linkText("STORE")).click();

    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Featured[\\s\\S]*$"));
    
    assertTrue(driver.findElement(By.xpath("html/body/div[1]/div[2]/div[1]/section/div[1]/div/ul[1]/li[1]/article/a/img")));
    
    Thread.sleep(sleepTime);
    assertEquals("", driver.findElement(By.xpath("//div[@id='content-wrap']/div/section/div/div/ul/li/article/a/img")).getText());
    
    assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Popular[\\s\\S]*$"));
    
    assertTrue(driver.findElement(By.xpath(".//*[@id='content-wrap']/div[2]/section/div[1]/div/ul[1]/li[1]/article/a/img")));
    
    driver.findElement(By.linkText("Sign out")).click();
  }

	private void assertTrue(boolean matches) {
		
	}
	
	private void assertTrue(WebElement findElement) {
		
	}
}
