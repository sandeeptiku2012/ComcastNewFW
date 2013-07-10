package comcast.test.app.common.userManagement.userLogin.common;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import comcast.test.config.configServices.DataServiceProperties;
import comcast.test.config.configServices.utils.TestDataGenerator;

/**
 * Class Name: UserLoginFunctions
 * Description: This class provides login module function.
 */
public class UserLoginFunctions {

	/**
	 * Method: UserLoginCredentials
	 * Description: This method is used to login into comcast application.
	 * @param driver: Native browser driver.
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public void UserLoginCredentials(WebDriver driver) throws FileNotFoundException, IOException
	{
		TestDataGenerator proUtil = new TestDataGenerator();
		  proUtil.load(new FileInputStream(
		    new File("com/data.properties")));
		  
		driver.findElement(By.name("user[user_name]")).clear();
	    driver.findElement(By.name("user[user_name]")).sendKeys(proUtil.getProperty("USER_NAME"));
	    //driver.findElement(By.name("user[user_name]")).sendKeys(DataServiceProperties._USER_NAME);
	    driver.findElement(By.name("user[password]")).clear();
	    //driver.findElement(By.name("user[password]")).sendKeys(DataServiceProperties._PASSWORD);
	    driver.findElement(By.name("user[password]")).sendKeys(proUtil.getProperty("REG_PASSWORD"));
	}
	
	/**
	 * Method: ChangePassword
	 * Description: This method is used to change password.
	 * @param driver: Native browser driver.
	 */
	public void ChangePassword(WebDriver driver)
	{
	    driver.findElement(By.name("old_password")).clear();
	    driver.findElement(By.name("old_password")).sendKeys(DataServiceProperties._PASSWORD);
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys(DataServiceProperties._RESET_PASSWORD);
	    driver.findElement(By.name("confirm_password")).clear();
	    driver.findElement(By.name("confirm_password")).sendKeys(DataServiceProperties._CONFIRM_PASSWORD);
	}
}
