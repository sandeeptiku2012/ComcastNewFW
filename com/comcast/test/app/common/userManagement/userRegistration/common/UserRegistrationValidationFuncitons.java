package comcast.test.app.common.userManagement.userRegistration.common;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import comcast.test.config.configServices.DataServiceProperties;
import comcast.test.config.configServices.utils.BaseTest;
import comcast.test.config.configServices.utils.TestDataGenerator;

/**
 * Class Name: UserRegistrationValidationFuncitons 
 * Description: This class file provides all Registration field related function.
 **/
public class UserRegistrationValidationFuncitons extends BaseTest{
	
	/**
	* Method: validateFirstName
	* Description: This method is used to validate First Name field
	* in registration page using Comcast Application.
	* @param driver: Native browser driver
	**/
	public void validateFirstName(WebDriver driver) throws FileNotFoundException, IOException, InterruptedException
	{	
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
	    driver.findElement(By.name("user[email]")).sendKeys(TestDataGenerator.emailId);
	    driver.findElement(By.name("user[mobile_number]")).clear();
	    //driver.findElement(By.name("user[mobile_number]")).sendKeys(DataServiceProperties._MOBILE_NUMBER);
	    driver.findElement(By.name("user[mobile_number]")).sendKeys(String.valueOf(TestDataGenerator.mobileNumber));
	    driver.findElement(By.name("user[password]")).clear();
	    driver.findElement(By.name("user[password]")).sendKeys(DataServiceProperties._REG_PASSWORD);
	    //TestDataGenerator.modifyDataProperties();
	    Thread.sleep(sleepTime);
	}
	
	/**
	* Method: validateLastName
	* Description: This method is used to validate Last Name field
	* in registration page using Comcast Application.
	* @param driver: Native browser driver
	**/
	public void validateLastName(WebDriver driver) throws FileNotFoundException, IOException, InterruptedException
	{	
		driver.findElement(By.name("user[first_name]")).clear();
	    driver.findElement(By.name("user[first_name]")).sendKeys(DataServiceProperties._FIRST_NAME);
	    driver.findElement(By.name("user[address]")).clear();
	    driver.findElement(By.name("user[address]")).sendKeys(DataServiceProperties._ADDRESS);
	    driver.findElement(By.name("user[city]")).clear();
	    driver.findElement(By.name("user[city]")).sendKeys(DataServiceProperties._CITY);
	    driver.findElement(By.name("user[zip]")).clear();
	    driver.findElement(By.name("user[zip]")).sendKeys(DataServiceProperties._ZIP);
	    driver.findElement(By.name("user[email]")).clear();
	    //driver.findElement(By.name("user[email]")).sendKeys(DataServiceProperties._EMAIL);
	    driver.findElement(By.name("user[email]")).sendKeys(TestDataGenerator.emailId);
	    driver.findElement(By.name("user[mobile_number]")).clear();
	    //driver.findElement(By.name("user[mobile_number]")).sendKeys(DataServiceProperties._MOBILE_NUMBER);
	    driver.findElement(By.name("user[mobile_number]")).sendKeys(String.valueOf(TestDataGenerator.mobileNumber));
	    driver.findElement(By.name("user[password]")).clear();
	    driver.findElement(By.name("user[password]")).sendKeys(DataServiceProperties._REG_PASSWORD);
	    
	    //TestDataGenerator.modifyDataProperties();
	    Thread.sleep(sleepTime);
	
	}
	
	/**
	* Method: validateAddress
	* Description: This method is used to validate Address field
	* in registration page using Comcast Application.
	* @param driver: Native browser driver
	**/
	public void validateAddress(WebDriver driver) throws FileNotFoundException, IOException, InterruptedException
	{
		driver.findElement(By.name("user[first_name]")).clear();
	    driver.findElement(By.name("user[first_name]")).sendKeys(DataServiceProperties._FIRST_NAME);
	    driver.findElement(By.name("user[last_name]")).clear();
	    driver.findElement(By.name("user[last_name]")).sendKeys(DataServiceProperties._LAST_NAME);
	    driver.findElement(By.name("user[city]")).clear();
	    driver.findElement(By.name("user[city]")).sendKeys(DataServiceProperties._CITY);
	    driver.findElement(By.name("user[zip]")).clear();
	    driver.findElement(By.name("user[zip]")).sendKeys(DataServiceProperties._ZIP);
	    driver.findElement(By.name("user[email]")).clear();
	    //driver.findElement(By.name("user[email]")).sendKeys(DataServiceProperties._EMAIL);
	    driver.findElement(By.name("user[email]")).sendKeys(TestDataGenerator.emailId);
	    driver.findElement(By.name("user[mobile_number]")).clear();
	    //driver.findElement(By.name("user[mobile_number]")).sendKeys(DataServiceProperties._MOBILE_NUMBER);
	    driver.findElement(By.name("user[mobile_number]")).sendKeys(String.valueOf(TestDataGenerator.mobileNumber));
	    driver.findElement(By.name("user[password]")).clear();
	    driver.findElement(By.name("user[password]")).sendKeys(DataServiceProperties._REG_PASSWORD);
	    //TestDataGenerator.modifyDataProperties();
	    Thread.sleep(sleepTime);
	}
	
	/**
	* Method: validateCity
	* Description: This method is used to validate City field
	* in registration page using Comcast Application.
	* @param driver: Native browser driver
	**/
	public void validateCity(WebDriver driver) throws FileNotFoundException, IOException, InterruptedException
	{	
		driver.findElement(By.name("user[first_name]")).clear();
	    driver.findElement(By.name("user[first_name]")).sendKeys(DataServiceProperties._FIRST_NAME);
	    driver.findElement(By.name("user[last_name]")).clear();
	    driver.findElement(By.name("user[last_name]")).sendKeys(DataServiceProperties._LAST_NAME);
	    driver.findElement(By.name("user[address]")).clear();
	    driver.findElement(By.name("user[address]")).sendKeys(DataServiceProperties._ADDRESS);
	    driver.findElement(By.name("user[zip]")).clear();
	    driver.findElement(By.name("user[zip]")).sendKeys(DataServiceProperties._ZIP);
	    driver.findElement(By.name("user[email]")).clear();
	    //driver.findElement(By.name("user[email]")).sendKeys(DataServiceProperties._EMAIL);
	    driver.findElement(By.name("user[email]")).sendKeys(TestDataGenerator.emailId);
	    driver.findElement(By.name("user[mobile_number]")).clear();
	    //driver.findElement(By.name("user[mobile_number]")).sendKeys(DataServiceProperties._MOBILE_NUMBER);
	    driver.findElement(By.name("user[mobile_number]")).sendKeys(String.valueOf(TestDataGenerator.mobileNumber));
	    driver.findElement(By.name("user[password]")).clear();
	    driver.findElement(By.name("user[password]")).sendKeys(DataServiceProperties._REG_PASSWORD);
	    //TestDataGenerator.modifyDataProperties();
	    Thread.sleep(sleepTime);
	}
	
	/**
	* Method: validateZipcode
	* Description: This method is used to validate Zip field
	* in registration page using Comcast Application.
	* @param driver: Native browser driver
	**/
	public void validateZip(WebDriver driver) throws FileNotFoundException, IOException, InterruptedException
	{	
		driver.findElement(By.name("user[first_name]")).clear();
	    driver.findElement(By.name("user[first_name]")).sendKeys(DataServiceProperties._FIRST_NAME);
	    driver.findElement(By.name("user[last_name]")).clear();
	    driver.findElement(By.name("user[last_name]")).sendKeys(DataServiceProperties._LAST_NAME);
	    driver.findElement(By.name("user[address]")).clear();
	    driver.findElement(By.name("user[address]")).sendKeys(DataServiceProperties._ADDRESS);
	    driver.findElement(By.name("user[city]")).clear();
	    driver.findElement(By.name("user[city]")).sendKeys(DataServiceProperties._CITY);
	    driver.findElement(By.name("user[email]")).clear();
	    //driver.findElement(By.name("user[email]")).sendKeys(DataServiceProperties._EMAIL);
	    driver.findElement(By.name("user[email]")).sendKeys(TestDataGenerator.emailId);
	    driver.findElement(By.name("user[mobile_number]")).clear();
	    //driver.findElement(By.name("user[mobile_number]")).sendKeys(DataServiceProperties._MOBILE_NUMBER);
	    driver.findElement(By.name("user[mobile_number]")).sendKeys(String.valueOf(TestDataGenerator.mobileNumber));
	    driver.findElement(By.name("user[password]")).clear();
	    driver.findElement(By.name("user[password]")).sendKeys(DataServiceProperties._REG_PASSWORD);
	    //TestDataGenerator.modifyDataProperties();
	    Thread.sleep(sleepTime);
	}
	
	/**
	* Method: validateEmail
	* Description: This method is used to validate Email Id field
	* in registration page using Comcast Application.
	* @param driver: Native browser driver
	**/
	public void validateEmail(WebDriver driver) throws FileNotFoundException, IOException, InterruptedException
	{	
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
	    driver.findElement(By.name("user[mobile_number]")).clear();
	    //driver.findElement(By.name("user[mobile_number]")).sendKeys(DataServiceProperties._MOBILE_NUMBER);
	    driver.findElement(By.name("user[mobile_number]")).sendKeys(String.valueOf(TestDataGenerator.mobileNumber));
	    driver.findElement(By.name("user[password]")).clear();
	    driver.findElement(By.name("user[password]")).sendKeys(DataServiceProperties._REG_PASSWORD);
	    //TestDataGenerator.modifyDataProperties();
	    Thread.sleep(sleepTime);
	}
	
	/**
	* Method: validateMobileNumber
	* Description: This method is used to validate Mobile Number field
	* in registration page using Comcast Application.
	* @param driver: Native browser driver
	**/
	public void validateMobileNumber(WebDriver driver) throws FileNotFoundException, IOException, InterruptedException
	{	
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
	    driver.findElement(By.name("user[email]")).sendKeys(TestDataGenerator.emailId);
	    driver.findElement(By.name("user[password]")).clear();
	    driver.findElement(By.name("user[password]")).sendKeys(DataServiceProperties._REG_PASSWORD);
	    //TestDataGenerator.modifyDataProperties();
	    Thread.sleep(sleepTime);
	}
	
	/**
	* Method: validatePassword
	* Description: This method is used to validate Email Id field
	* in registration page using Comcast Application.
	* @param driver: Native browser driver
	**/
	public void validatePassword(WebDriver driver) throws FileNotFoundException, IOException, InterruptedException
	{
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
	    driver.findElement(By.name("user[email]")).sendKeys(TestDataGenerator.emailId);
	    driver.findElement(By.name("user[mobile_number]")).clear();
	    //driver.findElement(By.name("user[mobile_number]")).sendKeys(DataServiceProperties._MOBILE_NUMBER);
	    driver.findElement(By.name("user[mobile_number]")).sendKeys(String.valueOf(TestDataGenerator.mobileNumber));
	    
	    //TestDataGenerator.modifyDataProperties();
	    Thread.sleep(sleepTime);
	}
	
	/**
	* Method: validatePassword
	* Description: This method is used to validate Email Id field
	* in registration page using Comcast Application.
	* @param driver: Native browser driver
	**/
	public void validateLengthOfPassword(WebDriver driver) throws FileNotFoundException, IOException, InterruptedException
	{	
		//TestDataGenerator proUtil=new TestDataGenerator();
		
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
	    driver.findElement(By.name("user[email]")).sendKeys(TestDataGenerator.emailId);
	    driver.findElement(By.name("user[mobile_number]")).clear();
	    //driver.findElement(By.name("user[mobile_number]")).sendKeys(DataServiceProperties._MOBILE_NUMBER);
	    driver.findElement(By.name("user[mobile_number]")).sendKeys(String.valueOf(TestDataGenerator.mobileNumber));
	    driver.findElement(By.name("user[password]")).clear();
	    driver.findElement(By.name("user[password]")).sendKeys(DataServiceProperties._INVALID_PASSWORD_LENGTH);
	    //TestDataGenerator.modifyDataProperties();
	    Thread.sleep(sleepTime);
	}
	
	/**
	* Method: validateInvalidMobileNumber
	* Description: This method is used to validate Invalid mobile number
	* in registration page using Comcast Application.
	* @param driver: Native browser driver
	**/
	public void validateInvalidMobileNumber(WebDriver driver) throws InterruptedException, FileNotFoundException, IOException
	{	
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
	    driver.findElement(By.name("user[email]")).sendKeys(TestDataGenerator.emailId);
	    driver.findElement(By.name("user[mobile_number]")).clear();
	    driver.findElement(By.name("user[mobile_number]")).sendKeys(DataServiceProperties._INVALID_MOBILE_NUMBER);
	    driver.findElement(By.name("user[password]")).clear();
	    driver.findElement(By.name("user[password]")).sendKeys(DataServiceProperties._REG_PASSWORD);
	    //TestDataGenerator.modifyDataProperties();
	    Thread.sleep(sleepTime);
	}
	
	/**
	* Method: validateNonCapitalLetterPassword
	* Description: This method is used to validate Non capital letter password
	* in registration page using Comcast Application.
	* @param driver: Native browser driver
	**/
	public void validateNonCapitalLetterPassword(WebDriver driver) throws FileNotFoundException, IOException, InterruptedException
	{	
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
	    driver.findElement(By.name("user[email]")).sendKeys(TestDataGenerator.emailId);
	    driver.findElement(By.name("user[mobile_number]")).clear();
	    //driver.findElement(By.name("user[mobile_number]")).sendKeys(DataServiceProperties._MOBILE_NUMBER);
	    driver.findElement(By.name("user[mobile_number]")).sendKeys(String.valueOf(TestDataGenerator.mobileNumber));
	    driver.findElement(By.name("user[password]")).clear();
	    driver.findElement(By.name("user[password]")).sendKeys(DataServiceProperties._NONCAPITAL_LETTER_PASSWORD);
	    //TestDataGenerator.modifyDataProperties();
	    Thread.sleep(sleepTime);
	}
	
	/**
	* Method: validateNonDigitPassword
	* Description: This method is used to validate Non Digit Password
	* in registration page using Comcast Application.
	* @param driver: Native browser driver
	**/
	public void validateNonDigitPassword(WebDriver driver) throws FileNotFoundException, IOException, InterruptedException
	{	
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
	    driver.findElement(By.name("user[email]")).sendKeys(TestDataGenerator.emailId);
	    driver.findElement(By.name("user[mobile_number]")).clear();
	    //driver.findElement(By.name("user[mobile_number]")).sendKeys(DataServiceProperties._MOBILE_NUMBER);
	    driver.findElement(By.name("user[mobile_number]")).sendKeys(String.valueOf(TestDataGenerator.mobileNumber));
	    driver.findElement(By.name("user[password]")).clear();
	    driver.findElement(By.name("user[password]")).sendKeys(DataServiceProperties._NONDIGIT_PASSWORD);
	    //TestDataGenerator.modifyDataProperties();
	    Thread.sleep(sleepTime);
	}
	
	/**
	* Method: validateInvalidZipLength
	* Description: This method is used to validate Invalid Zip length
	* in registration page using Comcast Application.
	* @param driver: Native browser driver
	**/
	public void validateInvalidZipLength(WebDriver driver) throws FileNotFoundException, IOException, InterruptedException
	{	
		driver.findElement(By.name("user[first_name]")).clear();
	    driver.findElement(By.name("user[first_name]")).sendKeys(DataServiceProperties._FIRST_NAME);
	    driver.findElement(By.name("user[last_name]")).clear();
	    driver.findElement(By.name("user[last_name]")).sendKeys(DataServiceProperties._LAST_NAME);
	    driver.findElement(By.name("user[address]")).clear();
	    driver.findElement(By.name("user[address]")).sendKeys(DataServiceProperties._ADDRESS);
	    driver.findElement(By.name("user[city]")).clear();
	    driver.findElement(By.name("user[city]")).sendKeys(DataServiceProperties._CITY);
	    driver.findElement(By.name("user[zip]")).clear();
	    driver.findElement(By.name("user[zip]")).sendKeys(DataServiceProperties._INVALID_ZIP_LENGTH);
	    driver.findElement(By.name("user[email]")).clear();
	    //driver.findElement(By.name("user[email]")).sendKeys(DataServiceProperties._EMAIL);
	    driver.findElement(By.name("user[email]")).sendKeys(TestDataGenerator.emailId);
	    driver.findElement(By.name("user[mobile_number]")).clear();
	    //driver.findElement(By.name("user[mobile_number]")).sendKeys(DataServiceProperties._MOBILE_NUMBER);
	    driver.findElement(By.name("user[mobile_number]")).sendKeys(String.valueOf(TestDataGenerator.mobileNumber));
	    driver.findElement(By.name("user[password]")).clear();
	    driver.findElement(By.name("user[password]")).sendKeys(DataServiceProperties._REG_PASSWORD);
	    //TestDataGenerator.modifyDataProperties();
	    Thread.sleep(sleepTime);
	}
	
	/**
	* Method: validateInvalidZip
	* Description: This method is used to validate Invalid Zip
	* in registration page using Comcast Application.
	* @param driver: Native browser driver
	**/
	public void validateInvalidZip(WebDriver driver) throws FileNotFoundException, IOException, InterruptedException
	{	
		driver.findElement(By.name("user[first_name]")).clear();
	    driver.findElement(By.name("user[first_name]")).sendKeys(DataServiceProperties._FIRST_NAME);
	    driver.findElement(By.name("user[last_name]")).clear();
	    driver.findElement(By.name("user[last_name]")).sendKeys(DataServiceProperties._LAST_NAME);
	    driver.findElement(By.name("user[address]")).clear();
	    driver.findElement(By.name("user[address]")).sendKeys(DataServiceProperties._ADDRESS);
	    driver.findElement(By.name("user[city]")).clear();
	    driver.findElement(By.name("user[city]")).sendKeys(DataServiceProperties._CITY);
	    driver.findElement(By.name("user[zip]")).clear();
	    driver.findElement(By.name("user[zip]")).sendKeys(DataServiceProperties._INVALID_ZIP);
	    driver.findElement(By.name("user[email]")).clear();
	    //driver.findElement(By.name("user[email]")).sendKeys(DataServiceProperties._EMAIL);
	    driver.findElement(By.name("user[email]")).sendKeys(TestDataGenerator.emailId);
	    driver.findElement(By.name("user[mobile_number]")).clear();
	    //driver.findElement(By.name("user[mobile_number]")).sendKeys(DataServiceProperties._MOBILE_NUMBER);
	    driver.findElement(By.name("user[mobile_number]")).sendKeys(String.valueOf(TestDataGenerator.mobileNumber));
	    driver.findElement(By.name("user[password]")).clear();
	    driver.findElement(By.name("user[password]")).sendKeys(DataServiceProperties._REG_PASSWORD);
	    //TestDataGenerator.modifyDataProperties();
	    Thread.sleep(sleepTime);
	}
	
	/**
	* Method: validateInvalidZipEmail
	* Description: This method is used to validate Invalid Email
	* in registration page using Comcast Application.
	* @param driver: Native browser driver
	**/
	public void validateInvalidEmail(WebDriver driver) throws FileNotFoundException, IOException, InterruptedException
	{		
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
	    driver.findElement(By.name("user[email]")).sendKeys(DataServiceProperties._INVALID_EMAIL);
	    driver.findElement(By.name("user[mobile_number]")).clear();
	    //driver.findElement(By.name("user[mobile_number]")).sendKeys(DataServiceProperties._MOBILE_NUMBER);
	    driver.findElement(By.name("user[mobile_number]")).sendKeys(String.valueOf(TestDataGenerator.mobileNumber));
	    driver.findElement(By.name("user[password]")).clear();
	    driver.findElement(By.name("user[password]")).sendKeys(DataServiceProperties._REG_PASSWORD);
	    //TestDataGenerator.modifyDataProperties();
	    Thread.sleep(sleepTime);
	}
	
	/**
	* Method: UpdateCCDetials
	* Description: This method is used to update credit card details
	* in registration credit card details page using Comcast Application.
	* @param driver: Native browser driver
	**/
	public void UpdateCCDetials(WebDriver driver) throws FileNotFoundException, IOException, InterruptedException
	{	
		driver.findElement(By.name("user[cc_number]")).clear();
	    driver.findElement(By.name("user[cc_number]")).sendKeys(DataServiceProperties._UPD_CC_NUMBER);
	    driver.findElement(By.name("user[cc_expiration_month]")).clear();
	    driver.findElement(By.name("user[cc_expiration_month]")).sendKeys(DataServiceProperties._UPD_CC_EXPIRY_MONTH);
	    driver.findElement(By.name("user[cc_expiration_year]")).clear();
	    driver.findElement(By.name("user[cc_expiration_year]")).sendKeys(DataServiceProperties._UPD_CC_YEAR);
	    driver.findElement(By.name("user[cc_security_code]")).clear();
	    driver.findElement(By.name("user[cc_security_code]")).sendKeys(DataServiceProperties._UPD_CC_PIN_CODE);
	}
	
	/**
	* Method: UpdateCCExpiryMonth
	* Description: This method is used to update credit card Expiry Month.
	* in registration credit card details page using Comcast Application.
	* @param driver: Native browser driver
	**/
	public void UpdateCCExpiryMonth(WebDriver driver) throws FileNotFoundException, IOException, InterruptedException
	{	
		driver.findElement(By.name("user[cc_number]")).clear();
	    driver.findElement(By.name("user[cc_number]")).sendKeys(DataServiceProperties._CC_NUMBER);
	    driver.findElement(By.name("user[cc_expiration_month]")).sendKeys(DataServiceProperties._UPD_CC_EXPIRY_MONTH);
	    driver.findElement(By.name("user[cc_expiration_year]")).clear();
	    driver.findElement(By.name("user[cc_expiration_year]")).sendKeys(DataServiceProperties._CC_YEAR);
	    driver.findElement(By.name("user[cc_security_code]")).clear();
	    driver.findElement(By.name("user[cc_security_code]")).sendKeys(DataServiceProperties._CC_PIN_CODE);
	}
	
	/**
	* Method: ValidateCreditCardNumberMandatoryField
	* Description: This method is used to valildate Credit Card number mandatory field
	* in registration credit card details page using Comcast Application.
	* @param driver: Native browser driver
	**/
	public void ValidateCreditCardNumberMandatoryField(WebDriver driver) throws FileNotFoundException, IOException, InterruptedException
	{		
			new Select(driver.findElement(By.name("user[cc_expiration_month]"))).selectByVisibleText(DataServiceProperties._CC_EXPIRY_MONTH);
		    driver.findElement(By.cssSelector("option[value=\"2\"]")).click();
		    new Select(driver.findElement(By.name("user[cc_expiration_year]"))).selectByVisibleText(DataServiceProperties._CC_YEAR);
		    driver.findElement(By.cssSelector("option[value=\"2019\"]")).click();
		    driver.findElement(By.name("user[cc_security_code]")).clear();
		    driver.findElement(By.name("user[cc_security_code]")).sendKeys(DataServiceProperties._CC_SECURITY_CODE);
		    driver.findElement(By.name("user[cc_pin_code]")).clear();
		    driver.findElement(By.name("user[cc_pin_code]")).sendKeys(DataServiceProperties._CC_PIN_CODE);
	}
	
	/**
	* Method: ValidateSecurityCodeMandatoryField
	* Description: This method is used to valildate Security code mandatory field
	* in registration credit card details page using Comcast Application.
	* @param driver: Native browser driver
	**/
	public void ValidateSecurityCodeMandatoryField(WebDriver driver) throws FileNotFoundException, IOException, InterruptedException
	{	
		driver.findElement(By.name("user[cc_number]")).clear();
	    driver.findElement(By.name("user[cc_number]")).sendKeys(DataServiceProperties._CC_NUMBER);
/*	    new Select(driver.findElement(By.name("user[cc_expiration_month]"))).selectByVisibleText(DataServiceProperties._CC_EXPIRY_MONTH);
	    driver.findElement(By.cssSelector("option[value=\"2\"]")).click();
	    new Select(driver.findElement(By.name("user[cc_expiration_year]"))).selectByVisibleText(DataServiceProperties._CC_YEAR);
	    driver.findElement(By.cssSelector("option[value=\"2019\"]")).click();*/
	    driver.findElement(By.name("user[cc_pin_code]")).clear();
	    driver.findElement(By.name("user[cc_pin_code]")).sendKeys(DataServiceProperties._CC_PIN_CODE);
	}
	
	/**
	* Method: ValidateInvalidCreditCardNumber
	* Description: This method is used to valildate Invalid Credit Card number
	* in registration credit card details page using Comcast Application.
	* @param driver: Native browser driver
	**/
	public void ValidateInvalidCreditCardNumber(WebDriver driver) throws FileNotFoundException, IOException, InterruptedException
	{	
		driver.findElement(By.name("user[cc_number]")).clear();
	    driver.findElement(By.name("user[cc_number]")).sendKeys(DataServiceProperties._INVALID_CC_NUMBER);
	    new Select(driver.findElement(By.name("user[cc_expiration_month]"))).selectByVisibleText(DataServiceProperties._CC_EXPIRY_MONTH);
	    driver.findElement(By.cssSelector("option[value=\"2\"]")).click();
	    new Select(driver.findElement(By.name("user[cc_expiration_year]"))).selectByVisibleText(DataServiceProperties._CC_YEAR);
	    driver.findElement(By.cssSelector("option[value=\"2019\"]")).click();
	    driver.findElement(By.name("user[cc_security_code]")).clear();
	    driver.findElement(By.name("user[cc_security_code]")).sendKeys(DataServiceProperties._CC_SECURITY_CODE);
	    driver.findElement(By.name("user[cc_pin_code]")).clear();
	    driver.findElement(By.name("user[cc_pin_code]")).sendKeys(DataServiceProperties._CC_PIN_CODE);
	
	}
	
	/**
	* Method: ValidateInvalidSecurityCodeNumber
	* Description: This method is used to valildate Invalid Security code
	* in registration credit card details page using Comcast Application.
	* @param driver: Native browser driver
	**/
	public void ValidateInvalidSecurityCodeNumber(WebDriver driver) throws FileNotFoundException, IOException, InterruptedException
	{	
		driver.findElement(By.name("user[cc_number]")).clear();
	    driver.findElement(By.name("user[cc_number]")).sendKeys(DataServiceProperties._CC_NUMBER);
/*	    new Select(driver.findElement(By.name("user[cc_expiration_month]"))).selectByVisibleText(DataServiceProperties._CC_EXPIRY_MONTH);
	    driver.findElement(By.cssSelector("option[value=\"2\"]")).click();
	    new Select(driver.findElement(By.name("user[cc_expiration_year]"))).selectByVisibleText(DataServiceProperties._CC_YEAR);
	    driver.findElement(By.cssSelector("option[value=\"2019\"]")).click();*/
	    driver.findElement(By.name("user[cc_security_code]")).clear();
	    driver.findElement(By.name("user[cc_security_code]")).sendKeys(DataServiceProperties._INVALID_CC_SECURITY_CODE_CHAR);
	    driver.findElement(By.name("user[cc_pin_code]")).clear();
	    driver.findElement(By.name("user[cc_pin_code]")).sendKeys(DataServiceProperties._CC_PIN_CODE);
	}
	
	/**
	* Method: ValidateSecurityCodeLength
	* Description: This method is used to valildate Security code length
	* in registration credit card details page using Comcast Application.
	* @param driver: Native browser driver
	**/
	public void ValidateSecurityCodeLength(WebDriver driver) throws FileNotFoundException, IOException, InterruptedException
	{	
		driver.findElement(By.name("user[cc_number]")).clear();
	    driver.findElement(By.name("user[cc_number]")).sendKeys(DataServiceProperties._CC_NUMBER);
	    new Select(driver.findElement(By.name("user[cc_expiration_month]"))).selectByVisibleText(DataServiceProperties._CC_EXPIRY_MONTH);
	    driver.findElement(By.cssSelector("option[value=\"2\"]")).click();
	    new Select(driver.findElement(By.name("user[cc_expiration_year]"))).selectByVisibleText(DataServiceProperties._CC_YEAR);
	    driver.findElement(By.cssSelector("option[value=\"2019\"]")).click();
	    driver.findElement(By.name("user[cc_security_code]")).clear();
	    driver.findElement(By.name("user[cc_security_code]")).sendKeys(DataServiceProperties._INVALID_CC_SECURITY_CODE);
	    driver.findElement(By.name("user[cc_pin_code]")).clear();
	    driver.findElement(By.name("user[cc_pin_code]")).sendKeys(DataServiceProperties._CC_PIN_CODE);
	}

	/**
	* Method: ValidatePinCodeMandatoryField
	* Description: This method is used to valildate pin code mandatory field
	* in registration credit card details page using Comcast Application.
	* @param driver: Native browser driver
	**/
	public void ValidatePinCodeMandatoryField(WebDriver driver) throws FileNotFoundException, IOException, InterruptedException
	{	
		driver.findElement(By.name("user[cc_number]")).clear();
	    driver.findElement(By.name("user[cc_number]")).sendKeys(DataServiceProperties._CC_NUMBER);
/*	    new Select(driver.findElement(By.name("user[cc_expiration_month]"))).selectByVisibleText(DataServiceProperties._CC_EXPIRY_MONTH);
	    driver.findElement(By.cssSelector("option[value=\"2\"]")).click();
	    new Select(driver.findElement(By.name("user[cc_expiration_year]"))).selectByVisibleText(DataServiceProperties._CC_YEAR);
	    driver.findElement(By.cssSelector("option[value=\"2019\"]")).click();*/
	    driver.findElement(By.name("user[cc_security_code]")).clear();
	    driver.findElement(By.name("user[cc_security_code]")).sendKeys(DataServiceProperties._CC_SECURITY_CODE);
	}
	
	/**
	* Method: ValidateInvalidPinCodeCharLength
	* Description: This method is used to valildate Invalid pin code length
	* in registration credit card details page using Comcast Application.
	* @param driver: Native browser driver
	**/
	public void ValidateInvalidPinCodeCharLength(WebDriver driver) throws FileNotFoundException, IOException, InterruptedException
	{	
		driver.findElement(By.name("user[cc_number]")).clear();
	    driver.findElement(By.name("user[cc_number]")).sendKeys(DataServiceProperties._CC_NUMBER);
/*	    new Select(driver.findElement(By.name("user[cc_expiration_month]"))).selectByVisibleText(DataServiceProperties._CC_EXPIRY_MONTH);
	    driver.findElement(By.cssSelector("option[value=\"2\"]")).click();
	    new Select(driver.findElement(By.name("user[cc_expiration_year]"))).selectByVisibleText(DataServiceProperties._CC_YEAR);
	    driver.findElement(By.cssSelector("option[value=\"2019\"]")).click();*/
	    driver.findElement(By.name("user[cc_security_code]")).clear();
	    driver.findElement(By.name("user[cc_security_code]")).sendKeys(DataServiceProperties._CC_SECURITY_CODE);
	    driver.findElement(By.name("user[cc_pin_code]")).clear();
	    driver.findElement(By.name("user[cc_pin_code]")).sendKeys(DataServiceProperties._INVALID_CC_PIN_CODE_LENGTH);
	
	}
}
