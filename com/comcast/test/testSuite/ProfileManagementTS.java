package comcast.test.testSuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import comcast.test.app.testCases.userManagement.profileManagement.RegisteredUserTestCasesForChangeActivationCode.ChangeActivationCodeWithInValidAC.ValidateUserActivationCodeByEnteringInvalidCode;
import comcast.test.app.testCases.userManagement.profileManagement.RegisteredUserTestCasesForChangeActivationCode.ChangeActivationCodeWithValidAC.ValidateUserActivationCodeUpdatesSuccessfully;

/**
 * @author anjum.jamadar
 *
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
	
	//RegisteredUserTestCasesForChangeActivationCode
	ValidateUserActivationCodeByEnteringInvalidCode.class
	//ValidateUserActivationCodeUpdatesSuccessfully.class,
	//ValidateUserActivationCodeMandatoryField.class,
	//ChangeUserActivationCode.class,
	
	//RegisteredUserTestCasesForChangePassword
	//ChangeUserLoginPassword.class,
	//ResetTheXidioPassword.class,
//	ResetTheXidioPasswordWithWrongEmail.class,
//	ResetXidioPasswordWithoutProvidingEmailID.class,
//	ValidateCurrentPasswordWhenChangingPassword.class,
//	ValidateNewPasswordAndConfirmPasswordMatch.class,
//	VerifyPasswordChangeWorks.class,
	
//	//RegisteredUserTestCasesForChangePaymentInfo
//	ValidatePaymentInfoCreditCardNumberWithInvalidInput.class,
//	ValidatePaymentInfoMonthByEnteringInvalidMonth.class,
//	ValidatePaymentInfoMonthMandatoryField.class,
//	VerifyPaymentInfoExpiryMonthUpdatedSuccessfully.class,
//	ValidatePaymentInfoSecurityCodeByEnteringCharacters.class,
//	ValidatePaymentInfoSecurityCodeWithInvalidInputLength.class,
//	ValidatePaymentInfoYearFieldByEnteringPastYear.class,
//	ValidatePaymentInfoYearMandatoryField.class,
//	ValidateChangePaymentInfoDetailsUpdatedSuccessfully.class,
//	ValidateChangePaymentInfoMandatoryFields.class,
//	
//	//RegisteredUserTestCasesForChangePinCode
//	ValidateChangePasswordByEnteringInvalidPass.class,
//	VerifyEnteredPasswordIsVisibleWhenUserClicksOnDisplayPass.class,
//	ValidateChangePinCodeByEnteringInvalidPinLength.class,
//	VerifyEnteredPinIsVisibleWhenUserClicksOnDisplayPin.class,
//	ChangePinCode.class,
//	ValidateChangePinCodeAllMandatoryFields.class,
//	VerifyChangePinCodeDetailsUpdatedSuccessfully.class,
//	
//	//RegisteredUserTestCasesForEditProfileDetails
//	EditXidioAddressInProfileManagement.class,
//	ValidateAddressFieldByDeletingValue.class,
//	EditXidioCityInProfileManagement.class,
//	ValidateCityFieldByDeletingValue.class,
//	EditXidioUserEmail.class,
//	ValidateEmailFieldByDeletingValue.class,
//	ValidateEmailFieldByEnteringInvalidEmailID.class,
//	EditXidioFirstNameInProfileManagement.class,
//	ValidateFirstNameFieldByDeletingValue.class,
//	EditXidioLastNameInProfileManagement.class,
//	ValidateLastNameFieldByDeletingValue.class,
//	EditXidioLastNameInProfileManagement.class,
//	ValidateLastNameFieldByDeletingValue.class,
//	ExitXidioUserMobileNumber.class,
//	ValidateMobileNumberFieldByDeletingValue.class,
//	ValidateMobileNumberFieldByEnteringExistingNo.class,
//	ValidateMobileNumberFieldByEnteringInvalidNo.class,
//	EditXidioStateInProfileManagement.class,
//	EditXidioZipInProfileManagement.class,
//	ValidateZipFieldByDeletingValue.class,
//	ValidateZipFieldByEnteringCharactersValue.class,
//	ValidateZipFieldByEnteringInvalidZipLength.class
})

public class ProfileManagementTS {
}