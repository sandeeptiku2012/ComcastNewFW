package comcast.test.app.common.userManagement.profileManagement.common;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import comcast.test.config.configServices.DataServiceProperties;

/**
 * Class Name: ProfileManagementScenarioBasedFunctions
 * Description: This class is contains all scenario based functions
 * for profile management module.
 */
public class ProfileManagementScenarioBasedFunctions {
	/**
	 * Method: VerifyNewPassAndConfirmPassMatch
	 * Description: This method verifies new password and confirm pass are same.
	 * @param driver: Native browser driver
	 */
	public void VerifyNewPassAndConfirmPassMatch(WebDriver driver)
	{
	    driver.findElement(By.name("old_password")).clear();
	    driver.findElement(By.name("old_password")).sendKeys(DataServiceProperties._PASSWORD);
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys(DataServiceProperties._PASSWORD);
	    driver.findElement(By.name("confirm_password")).clear();
	    driver.findElement(By.name("confirm_password")).sendKeys(DataServiceProperties._INVALID_PASSWORD_LENGTH);
	    driver.findElement(By.name("commit")).click();
	}
	
	/**
	 * Method: ValidateInvalidCreditCardNumber
	 * Description: This method validates invalid credit card number.
	 * @param driver: Native browser driver
	 */
	public void ValidateInvalidCreditCardNumber(WebDriver driver)
	{
	    driver.findElement(By.name("user[cc_number]")).clear();
	    driver.findElement(By.name("user[cc_number]")).sendKeys(DataServiceProperties._INVALID_CC_NUMBER);
	    driver.findElement(By.name("user[cc_expiration_month]")).clear();
	    driver.findElement(By.name("user[cc_expiration_month]")).sendKeys(DataServiceProperties._CC_EXPIRY_MONTH);
	    driver.findElement(By.name("user[cc_expiration_year]")).clear();
	    driver.findElement(By.name("user[cc_expiration_year]")).sendKeys(DataServiceProperties._CC_YEAR);
	    driver.findElement(By.name("user[cc_security_code]")).clear();
	    driver.findElement(By.name("user[cc_security_code]")).sendKeys(DataServiceProperties._CC_SECURITY_CODE);
	}
	
	/**
	 * Method: ValidateInvalidMonth
	 * Description: This method is to verify invalid month.
	 * @param driver: Native browser driver
	 */
	public void ValidateInvalidMonth(WebDriver driver) throws FileNotFoundException, IOException
	{
	    driver.findElement(By.name("user[cc_number]")).clear();
	    driver.findElement(By.name("user[cc_number]")).sendKeys(DataServiceProperties._CC_NUMBER);
	    driver.findElement(By.name("user[cc_expiration_month]")).clear();
	    driver.findElement(By.name("user[cc_expiration_month]")).sendKeys(DataServiceProperties._INVALID_CC_EXPIRY_MONTH);
	    driver.findElement(By.name("user[cc_expiration_year]")).clear();
	    driver.findElement(By.name("user[cc_expiration_year]")).sendKeys(DataServiceProperties._CC_YEAR);
	    driver.findElement(By.name("user[cc_security_code]")).clear();
	    driver.findElement(By.name("user[cc_security_code]")).sendKeys(DataServiceProperties._CC_SECURITY_CODE);
	}
	
	/**
	 * Method: ValidatePaymentInfoMonthMandatoryField
	 * Description: This method validates month mandatory field.
	 * @param driver: Native browser driver
	 */
	public void ValidatePaymentInfoMonthMandatoryField(WebDriver driver) throws FileNotFoundException, IOException
	{
	    driver.findElement(By.name("user[cc_number]")).clear();
	    driver.findElement(By.name("user[cc_number]")).sendKeys(DataServiceProperties._CC_NUMBER);
	    driver.findElement(By.name("user[cc_expiration_year]")).clear();
	    driver.findElement(By.name("user[cc_expiration_year]")).sendKeys(DataServiceProperties._CC_YEAR);
	    driver.findElement(By.name("user[cc_security_code]")).clear();
	    driver.findElement(By.name("user[cc_security_code]")).sendKeys(DataServiceProperties._CC_SECURITY_CODE);
	}
	
	/**
	 * Method: ValidateYearFieldByEnteringPastYear
	 * Description: This method is to validates Year field by entering past year.
	 * @param driver: Native browser driver
	 */
	public void ValidateYearFieldByEnteringPastYear(WebDriver driver)
	{
	    driver.findElement(By.name("user[cc_number]")).clear();
	    driver.findElement(By.name("user[cc_number]")).sendKeys(DataServiceProperties._CC_NUMBER);
	    driver.findElement(By.name("user[cc_expiration_month]")).clear();
	    driver.findElement(By.name("user[cc_expiration_month]")).sendKeys(DataServiceProperties._CC_EXPIRY_MONTH);
	    driver.findElement(By.name("user[cc_expiration_year]")).clear();
	    driver.findElement(By.name("user[cc_expiration_year]")).sendKeys(DataServiceProperties._PAST_YEAR);
	    //Thread.sleep(sleepTime);
	    driver.findElement(By.name("user[cc_security_code]")).clear();
	    driver.findElement(By.name("user[cc_security_code]")).sendKeys(DataServiceProperties._CC_SECURITY_CODE);
	}
	
	/**
	 * Method: ValidateYearMandatoryField
	 * Description: This method is to validates Year mandatory field.
	 * @param driver: Native browser driver
	 */
	public void ValidateYearMandatoryField(WebDriver driver) throws FileNotFoundException, IOException, InterruptedException
	{
	    driver.findElement(By.name("user[cc_number]")).clear();
	    driver.findElement(By.name("user[cc_number]")).sendKeys(DataServiceProperties._CC_NUMBER);
	    driver.findElement(By.name("user[cc_expiration_month]")).clear();
	    driver.findElement(By.name("user[cc_expiration_month]")).sendKeys(DataServiceProperties._CC_EXPIRY_MONTH);
	    driver.findElement(By.name("user[cc_security_code]")).clear();
	    driver.findElement(By.name("user[cc_security_code]")).sendKeys(DataServiceProperties._CC_SECURITY_CODE);
	}
	
	/**
	 * Method: ValidateSecurityCodeFieldByEnteringInvalidLength
	 * Description: This method is to validates Security Code field by entering in valid length.
	 * @param driver: Native browser driver
	 */
	public void ValidateSecurityCodeFieldByEnteringInvalidLength(WebDriver driver)
	{
	    driver.findElement(By.name("user[cc_number]")).clear();
	    driver.findElement(By.name("user[cc_number]")).sendKeys(DataServiceProperties._CC_NUMBER);
	    driver.findElement(By.name("user[cc_expiration_month]")).clear();
	    driver.findElement(By.name("user[cc_expiration_month]")).sendKeys(DataServiceProperties._CC_EXPIRY_MONTH);
	    driver.findElement(By.name("user[cc_expiration_year]")).clear();
	    driver.findElement(By.name("user[cc_expiration_year]")).sendKeys(DataServiceProperties._PAST_YEAR);
	    driver.findElement(By.name("user[cc_security_code]")).clear();
	    driver.findElement(By.name("user[cc_security_code]")).sendKeys(DataServiceProperties._INVALID_CC_SECURITY_CODE_LENGTH);
	}
	
	/**
	 * Method: ValidateSecurityCodeFieldByEnteringCharValue
	 * Description: This method is to validates Security Code field by entering in valid length.
	 * @param driver: Native browser driver
	 */
	public void ValidateSecurityCodeFieldByEnteringCharValue(WebDriver driver)
	{
	    driver.findElement(By.name("user[cc_number]")).clear();
	    driver.findElement(By.name("user[cc_number]")).sendKeys(DataServiceProperties._CC_NUMBER);
	    driver.findElement(By.name("user[cc_expiration_month]")).clear();
	    driver.findElement(By.name("user[cc_expiration_month]")).sendKeys(DataServiceProperties._CC_EXPIRY_MONTH);
	    driver.findElement(By.name("user[cc_expiration_year]")).clear();
	    driver.findElement(By.name("user[cc_expiration_year]")).sendKeys(DataServiceProperties._PAST_YEAR);
	    driver.findElement(By.name("user[cc_security_code]")).clear();
	    driver.findElement(By.name("user[cc_security_code]")).sendKeys(DataServiceProperties._INVALID_CC_SECURITY_CODE_CHAR);
	}
	
	/**
	 * Method: ValidatePinCodeFieldByEnteringInvalidPinLength
	 * Description: This method is to validates Pin code field by entering in valid Pin length.
	 * @param driver: Native browser driver
	 */
	public void ValidatePinCodeFieldByEnteringInvalidPinLength(WebDriver driver)
	{
		driver.findElement(By.name("cc_pin_code")).clear();
	    driver.findElement(By.name("cc_pin_code")).sendKeys(DataServiceProperties._INVALID_CC_PIN_CODE_LENGTH);
	    driver.findElement(By.name("password")).clear();
	    driver.findElement(By.name("password")).sendKeys(DataServiceProperties._PASSWORD);
	}
	
	/**
	 * Method: ValidatePasswordFieldByEnteringInvalidPass
	 * Description: This method is to validates Password field with in valid pass.
	 * @param driver: Native browser driver
	 */
	public void ValidatePasswordFieldByEnteringInvalidPass(WebDriver driver)
	{
		driver.findElement(By.name("cc_pin_code")).clear();
	    driver.findElement(By.name("cc_pin_code")).sendKeys(DataServiceProperties._CC_PIN_CODE);
	    driver.findElement(By.name("password")).clear();
	    driver.findElement(By.name("password")).sendKeys(DataServiceProperties._INVALID_PASSWORD_LENGTH);
	}
	
	/**
	 * Method: UpdateActivationCode
	 * Description: This method is to update activation code.
	 * @param driver: Native browser driver
	 */
	public void UpdateActivationCode(WebDriver driver)
	{
		driver.findElement(By.name("user[activation_code]")).clear();
	    driver.findElement(By.name("user[activation_code]")).sendKeys(DataServiceProperties._UPD_ACTION_CODE);
	}
}
