package comcast.test.app.common.userManagement.userRegistration.common;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import comcast.test.config.configServices.DataServiceProperties;
import comcast.test.config.configServices.utils.BaseTest;
import comcast.test.config.configServices.utils.TestDataGenerator;

/**
 * Class Name: UserRegistrationUsingComcast 
 * Description: This test case allows the user to register into Comcast application including
 * credit card details.
 **/

public class UserRegistrationFunction extends BaseTest{
	//public static long sleepTime=2500;
	
	/**
	* Method: CreditCardDetials
	* Description: This method is user to enter all credit card detail fields 
	* in Comcast Application.
	* @param driver: Native browser driver
	**/
	public void CreditCardDetials(WebDriver driver) throws FileNotFoundException, IOException, InterruptedException
	{
		driver.findElement(By.name("user[cc_number]")).clear();
	    driver.findElement(By.name("user[cc_number]")).sendKeys(DataServiceProperties._CC_NUMBER);
	    new Select(driver.findElement(By.name("user[cc_expiration_month]"))).selectByVisibleText(DataServiceProperties._CC_EXPIRY_MONTH);
	    driver.findElement(By.cssSelector("option[value=\"2\"]")).click();
	    driver.findElement(By.name("user[cc_security_code]")).clear();
	    driver.findElement(By.name("user[cc_security_code]")).sendKeys(DataServiceProperties._CC_SECURITY_CODE);
	    driver.findElement(By.name("user[cc_pin_code]")).clear();
	    driver.findElement(By.name("user[cc_pin_code]")).sendKeys(DataServiceProperties._CC_PIN_CODE);
	}
	
	/**
	* Method: RegistrationDetails
	* Description: This method is user to register new user in 
	* in Comcast Application.
	* @param driver: Native browser driver
	**/
	public void RegistrationDetails(WebDriver driver) throws FileNotFoundException, IOException, InterruptedException
	{
		TestDataGenerator.modifyDataProperties();
		
		driver.findElement(By.name("user[first_name]")).clear();
	    driver.findElement(By.name("user[first_name]")).sendKeys(DataServiceProperties._FIRST_NAME);
	    driver.findElement(By.name("user[last_name]")).clear();
	    driver.findElement(By.name("user[last_name]")).sendKeys(DataServiceProperties._LAST_NAME);
	    driver.findElement(By.name("user[address]")).clear();
	    driver.findElement(By.name("user[address]")).sendKeys(DataServiceProperties._ADDRESS);
	    driver.findElement(By.name("user[city]")).clear();
	    driver.findElement(By.name("user[city]")).sendKeys(DataServiceProperties._CITY);
	    driver.findElement(By.name("user[zip]")).clear();
	    driver.findElement(By.name("user[zip]")).sendKeys(DataServiceProperties._ZIP);
	    driver.findElement(By.name("user[email]")).clear();
	    //driver.findElement(By.name("user[email]")).sendKeys(DataServiceProperties._EMAIL);
	    //driver.findElement(By.name("user[email]")).sendKeys(proUtil.generateEmail());
	    driver.findElement(By.name("user[email]")).sendKeys(TestDataGenerator.emailId);
	    System.out.println("Email ID : "+TestDataGenerator.emailId);
	    driver.findElement(By.name("user[mobile_number]")).clear();
	   // driver.findElement(By.name("user[mobile_number]")).sendKeys(DataServiceProperties._MOBILE_NUMBER);
	    driver.findElement(By.name("user[mobile_number]")).sendKeys(String.valueOf(TestDataGenerator.mobileNumber));
	    driver.findElement(By.name("user[password]")).clear();
	    driver.findElement(By.name("user[password]")).sendKeys(DataServiceProperties._REG_PASSWORD);
	    //Thread.sleep(sleepTime);
/*	    
		TestDataGenerator proUtil = new TestDataGenerator();
		  proUtil.load(new FileInputStream(
		    new File("com/data.properties")));*/
	}
}

