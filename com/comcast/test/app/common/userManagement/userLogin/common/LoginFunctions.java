package comcast.test.app.common.userManagement.userLogin.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import comcast.test.config.configServices.DataServiceProperties;

/** 
 * Class Name: LoginFunctions
 * Description: This calss provides all login module function. 
 * in Comcast application
 * **/
public class LoginFunctions {
	
	/**
	* Method Name: ProvideInvalidUserNameWithValidPass
	* Description: Enter Invaliad UserName along with valid password.
	* @param <driver>: Native browser driver
	*/
	public void ProvideInvalidUserNameWithValidPass(WebDriver driver)
	{
	    driver.findElement(By.name("user[user_name]")).clear();
	    driver.findElement(By.name("user[user_name]")).sendKeys(DataServiceProperties._INVALID_USER_NAME);
	    
	    driver.findElement(By.name("user[password]")).clear();
	    driver.findElement(By.name("user[password]")).sendKeys(DataServiceProperties._PASSWORD);
	}
	
	/**
	* Method Name: ProvideInvalidPasswordWithValidUsername
	* Description: Enter Invaliad Pasword along with valid UserName.
	* @param <driver>: Native browser driver
	*/
	public void ProvideInvalidPasswordWithValidUsername(WebDriver driver)
	{
	    driver.findElement(By.name("user[user_name]")).clear();
	    driver.findElement(By.name("user[user_name]")).sendKeys(DataServiceProperties._USER_NAME);
	    driver.findElement(By.name("user[password]")).clear();
	    driver.findElement(By.name("user[password]")).sendKeys(DataServiceProperties._INVALID_PASSWORD);
	}
}
