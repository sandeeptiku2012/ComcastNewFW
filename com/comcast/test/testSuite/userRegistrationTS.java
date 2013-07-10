package comcast.test.testSuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import comcast.test.app.testCases.userManagement.userRegistration.RegisterToXidioApplicationUsingValidCredentials;
import comcast.test.app.testCases.userManagement.userRegistration.UserRegistrationTestCasesForActivationCode.UserRegByClickingOnActivationCode.RegisterToXidioApplicationByClickingActivation;
import comcast.test.app.testCases.userManagement.userRegistration.UserRegistrationTestCasesForActivationCode.UserRegBySkipingActivationCode.RegisterToXidioApplicationBySkipingPaymentStepAndActivationStep;
import comcast.test.app.testCases.userManagement.userRegistration.UserRegistrationTestCasesForActivationCode.UserRegWithoutActivationCode.RegisterUserWithoutActivationCode;
import comcast.test.app.testCases.userManagement.userRegistration.UserRegistrationTestCasesForAddress.UserRegWithNoAddress.RegisterToXidioApplicationWithoutEnteringAddress;
import comcast.test.app.testCases.userManagement.userRegistration.UserRegistrationTestCasesForCity.UserRegWithNoCity.RegisterToXidioApplicationWithoutEnteringCity;
import comcast.test.app.testCases.userManagement.userRegistration.UserRegistrationTestCasesForCreditCardDetails.UserRegToCheckDiplayPasswordCheckboxWorks.RegisterToXidioApplicationWithCheckingDiplayPasswordCheckbox;
import comcast.test.app.testCases.userManagement.userRegistration.UserRegistrationTestCasesForCreditCardDetails.UserRegToCheckDiplayPinCheckboxWorks.RegisterToXidioApplicationWithCheckingDiplayPinCheckbox;
import comcast.test.app.testCases.userManagement.userRegistration.UserRegistrationTestCasesForCreditCardDetails.UserRegWithInvalidCCNumber.RegisterToXidioApplicationWithInvalidCreditCardNumber;
import comcast.test.app.testCases.userManagement.userRegistration.UserRegistrationTestCasesForCreditCardDetails.UserRegWithInvalidPin.UserRegWithInvalidPinCodeCharLength.RegisterToXidioApplicationWithInvalidPinCodeCharLength;
import comcast.test.app.testCases.userManagement.userRegistration.UserRegistrationTestCasesForCreditCardDetails.UserRegWithNoCCNumber.RegisterToXidioApplicationWithNoCreditCardNumber;
import comcast.test.app.testCases.userManagement.userRegistration.UserRegistrationTestCasesForCreditCardDetails.UserRegWithNoPINCode.RegisterToXidioApplicationWithNoPinCode;
import comcast.test.app.testCases.userManagement.userRegistration.UserRegistrationTestCasesForCreditCardDetails.UserRegWithNoSecurityCode.RegisterToXidioApplicationWithNoSecurityCode;
import comcast.test.app.testCases.userManagement.userRegistration.UserRegistrationTestCasesForEmail.UserRegWithInvalidEmailID.UserRegWithInvalidEmailIDMissingInputs.RegisterToXidioApplicationByEnteringInValidEmail;
import comcast.test.app.testCases.userManagement.userRegistration.UserRegistrationTestCasesForEmail.UserRegWithNoEmailID.RegisterToXidioApplicationWithoutEnteringEmail;
import comcast.test.app.testCases.userManagement.userRegistration.UserRegistrationTestCasesForFirstName.UserRegWithNoFirstName.RegisterToXidioApplicationWithoutEnteringFirstName;
import comcast.test.app.testCases.userManagement.userRegistration.UserRegistrationTestCasesForLastName.UserRegWithNoLastName.RegisterToXidioApplicationWithoutEnteringLastName;
import comcast.test.app.testCases.userManagement.userRegistration.UserRegistrationTestCasesForMobileNumber.UserRegWithInvalidMobileNumber.RegisterToXidioApplicationByEnteringInValidMobileNumber;
import comcast.test.app.testCases.userManagement.userRegistration.UserRegistrationTestCasesForMobileNumber.UserRegWithNoMobileNumber.RegisterToXidioApplicationWithoutEnteringMobileNumber;
import comcast.test.app.testCases.userManagement.userRegistration.UserRegistrationTestCasesForPassword.UserRegWithInvalidPasswordLength.RegisterToXidioApplicationByEnteringInValidLengthOfPassword;
import comcast.test.app.testCases.userManagement.userRegistration.UserRegistrationTestCasesForPassword.UserRegWithNoFirstCapitalLetter.RegisterToXidioApplicationByEnteringNonCapitalLetterPassword;
import comcast.test.app.testCases.userManagement.userRegistration.UserRegistrationTestCasesForPassword.UserRegWithNoPassword.RegisterToXidioApplicationWithoutEnteringPassword;
import comcast.test.app.testCases.userManagement.userRegistration.UserRegistrationTestCasesForPassword.UserRegWithNonDigitPassword.RegisterToXidioApplicationByEnteringNonDigitPassword;
import comcast.test.app.testCases.userManagement.userRegistration.UserRegistrationTestCasesForPaymentDetails.RegisterToXidioApplicationDirectlyWithPaymentDetailsWithoutPersonalInfo;
import comcast.test.app.testCases.userManagement.userRegistration.UserRegistrationTestCasesForTermsAndCondition.UserRegByDeclineTermAndCondition.RegisterToXidioApplicationWithValidCredentialByDeclineTermAndCondition;
import comcast.test.app.testCases.userManagement.userRegistration.UserRegistrationTestCasesForZipCode.UserRegWithInvalidZipCode.RegisterToXidioApplicationByEnteringInValidZip;
import comcast.test.app.testCases.userManagement.userRegistration.UserRegistrationTestCasesForZipCode.UserRegWithInvalidZipCodeLength.RegisterToXidioApplicationByEnteringInValidZipLength;
import comcast.test.app.testCases.userManagement.userRegistration.UserRegistrationTestCasesForZipCode.UserRegWithNoZipCode.RegisterToXidioApplicationWithoutEnteringZip;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	
	RegisterToXidioApplicationByClickingActivation.class,
	RegisterToXidioApplicationBySkipingPaymentStepAndActivationStep.class,
	RegisterUserWithoutActivationCode.class,
	RegisterToXidioApplicationWithoutEnteringAddress.class,
	RegisterToXidioApplicationWithoutEnteringCity.class,
	RegisterToXidioApplicationWithCheckingDiplayPasswordCheckbox.class,
	RegisterToXidioApplicationWithCheckingDiplayPinCheckbox.class,
	RegisterToXidioApplicationWithInvalidCreditCardNumber.class,
	RegisterToXidioApplicationWithInvalidPinCodeCharLength.class,
	RegisterToXidioApplicationWithNoCreditCardNumber.class,
	RegisterToXidioApplicationWithNoPinCode.class,
	RegisterToXidioApplicationWithNoSecurityCode.class,
	RegisterToXidioApplicationByEnteringInValidEmail.class,
	RegisterToXidioApplicationWithoutEnteringEmail.class,
	RegisterToXidioApplicationWithoutEnteringFirstName.class,
	RegisterToXidioApplicationWithoutEnteringLastName.class,
	RegisterToXidioApplicationByEnteringInValidMobileNumber.class,
	RegisterToXidioApplicationWithoutEnteringMobileNumber.class,
	RegisterToXidioApplicationByEnteringInValidLengthOfPassword.class,
	RegisterToXidioApplicationByEnteringNonCapitalLetterPassword.class,
	RegisterToXidioApplicationByEnteringNonDigitPassword.class,
	RegisterToXidioApplicationWithoutEnteringPassword.class,
	RegisterToXidioApplicationDirectlyWithPaymentDetailsWithoutPersonalInfo.class,
	RegisterToXidioApplicationWithValidCredentialByDeclineTermAndCondition.class,
	RegisterToXidioApplicationByEnteringInValidZip.class,
	RegisterToXidioApplicationByEnteringInValidZipLength.class,
	RegisterToXidioApplicationWithoutEnteringZip.class,
	RegisterToXidioApplicationUsingValidCredentials.class
	
})
public class userRegistrationTS {

}
