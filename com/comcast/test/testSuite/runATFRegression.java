package comcast.test.testSuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import comcast.test.app.common.helpHeaderFooterLinks.userRegTestCasesForHelpLink.VerifyHelpLink;
import comcast.test.app.common.helpHeaderFooterLinks.userRegTestCasesForHelpLink.VerifyHomePageAllLinks;
import comcast.test.app.testCases.userManagement.profileManagement.RegisteredUserTestCasesForChangeActivationCode.ChangeActivationCodeWithInValidAC.ValidateUserActivationCodeByEnteringInvalidCode;
import comcast.test.app.testCases.userManagement.profileManagement.RegisteredUserTestCasesForChangeActivationCode.ChangeActivationCodeWithValidAC.ValidateUserActivationCodeUpdatesSuccessfully;
import comcast.test.app.testCases.userManagement.profileManagement.RegisteredUserTestCasesForChangePassword.ResetUserPassword.ResetTheXidioPassword;
import comcast.test.app.testCases.userManagement.profileManagement.RegisteredUserTestCasesForChangePassword.ResetUserPasswordWithInvalidEmail.ResetTheXidioPasswordWithWrongEmail;
import comcast.test.app.testCases.userManagement.profileManagement.RegisteredUserTestCasesForChangePassword.ResetUserPasswordWithNoEmail.ResetXidioPasswordWithoutProvidingEmailID;
import comcast.test.app.testCases.userManagement.profileManagement.RegisteredUserTestCasesForChangePassword.ValidateCurrentUserPassWhileChangingPass.ValidateCurrentPasswordWhenChangingPassword;
import comcast.test.app.testCases.userManagement.profileManagement.RegisteredUserTestCasesForChangePassword.ValidateNewAndConfirmPassword.ValidateNewPasswordAndConfirmPasswordMatch;
import comcast.test.app.testCases.userManagement.profileManagement.RegisteredUserTestCasesForChangePassword.VerifyPasswordChangesSuccessfully.VerifyPasswordChangeWorks;
import comcast.test.app.testCases.userManagement.profileManagement.RegisteredUserTestCasesForChangePaymentInfo.ValidateChangePaymentInfoDetailsUpdatedSuccessfully;
import comcast.test.app.testCases.userManagement.profileManagement.RegisteredUserTestCasesForChangePaymentInfo.ValidateChangePaymentInfoMandatoryFields;
import comcast.test.app.testCases.userManagement.profileManagement.RegisteredUserTestCasesForChangePaymentInfo.ValidateCreditCardField.ValidatePaymentInfoCreditCardNumberWithInvalidInput;
import comcast.test.app.testCases.userManagement.profileManagement.RegisteredUserTestCasesForChangePaymentInfo.ValidateExpiryMonthField.ValidatePaymentInfoMonthByEnteringInvalidMonth;
import comcast.test.app.testCases.userManagement.profileManagement.RegisteredUserTestCasesForChangePaymentInfo.ValidateExpiryMonthField.ValidatePaymentInfoMonthMandatoryField;
import comcast.test.app.testCases.userManagement.profileManagement.RegisteredUserTestCasesForChangePaymentInfo.ValidateSecurityField.ValidatePaymentInfoSecurityCodeByEnteringCharacters;
import comcast.test.app.testCases.userManagement.profileManagement.RegisteredUserTestCasesForChangePaymentInfo.ValidateSecurityField.ValidatePaymentInfoSecurityCodeWithInvalidInputLength;
import comcast.test.app.testCases.userManagement.profileManagement.RegisteredUserTestCasesForChangePaymentInfo.ValidateYearField.ValidatePaymentInfoYearFieldByEnteringPastYear;
import comcast.test.app.testCases.userManagement.profileManagement.RegisteredUserTestCasesForChangePaymentInfo.ValidateYearField.ValidatePaymentInfoYearMandatoryField;
import comcast.test.app.testCases.userManagement.profileManagement.RegisteredUserTestCasesForChangePinCode.ValidateChangePinCodeAllMandatoryFields;
import comcast.test.app.testCases.userManagement.profileManagement.RegisteredUserTestCasesForChangePinCode.VerifyChangePinCodeDetailsUpdatedSuccessfully;
import comcast.test.app.testCases.userManagement.profileManagement.RegisteredUserTestCasesForChangePinCode.ValidatePasswordField.ValidateChangePasswordByEnteringInvalidPass;
import comcast.test.app.testCases.userManagement.profileManagement.RegisteredUserTestCasesForChangePinCode.ValidatePasswordField.VerifyEnteredPasswordIsVisibleWhenUserClicksOnDisplayPass;
import comcast.test.app.testCases.userManagement.profileManagement.RegisteredUserTestCasesForChangePinCode.ValidatePinCodeField.ValidateChangePinCodeByEnteringInvalidPinLength;
import comcast.test.app.testCases.userManagement.profileManagement.RegisteredUserTestCasesForChangePinCode.ValidatePinCodeField.VerifyEnteredPinIsVisibleWhenUserClicksOnDisplayPin;
import comcast.test.app.testCases.userManagement.profileManagement.RegisteredUserTestCasesForEditProfileDetails.ValidateAddressField.EditXidioAddressInProfileManagement;
import comcast.test.app.testCases.userManagement.profileManagement.RegisteredUserTestCasesForEditProfileDetails.ValidateAddressField.ValidateAddressFieldByDeletingValue;
import comcast.test.app.testCases.userManagement.profileManagement.RegisteredUserTestCasesForEditProfileDetails.ValidateCityField.EditXidioCityInProfileManagement;
import comcast.test.app.testCases.userManagement.profileManagement.RegisteredUserTestCasesForEditProfileDetails.ValidateCityField.ValidateCityFieldByDeletingValue;
import comcast.test.app.testCases.userManagement.profileManagement.RegisteredUserTestCasesForEditProfileDetails.ValidateEmailField.EditXidioUserEmail;
import comcast.test.app.testCases.userManagement.profileManagement.RegisteredUserTestCasesForEditProfileDetails.ValidateEmailField.ValidateEmailFieldByDeletingValue;
import comcast.test.app.testCases.userManagement.profileManagement.RegisteredUserTestCasesForEditProfileDetails.ValidateEmailField.ValidateEmailFieldByEnteringInvalidEmailID;
import comcast.test.app.testCases.userManagement.profileManagement.RegisteredUserTestCasesForEditProfileDetails.ValidateFirstNameField.ValidateFirstNameFieldByDeletingValue;
import comcast.test.app.testCases.userManagement.profileManagement.RegisteredUserTestCasesForEditProfileDetails.ValidateLastNameField.EditXidioLastNameInProfileManagement;
import comcast.test.app.testCases.userManagement.profileManagement.RegisteredUserTestCasesForEditProfileDetails.ValidateLastNameField.ValidateLastNameFieldByDeletingValue;
import comcast.test.app.testCases.userManagement.profileManagement.RegisteredUserTestCasesForEditProfileDetails.ValidateMobileNumberField.ExitXidioUserMobileNumber;
import comcast.test.app.testCases.userManagement.profileManagement.RegisteredUserTestCasesForEditProfileDetails.ValidateMobileNumberField.ValidateMobileNumberFieldByDeletingValue;
import comcast.test.app.testCases.userManagement.profileManagement.RegisteredUserTestCasesForEditProfileDetails.ValidateMobileNumberField.ValidateMobileNumberFieldByEnteringExistingNo;
import comcast.test.app.testCases.userManagement.profileManagement.RegisteredUserTestCasesForEditProfileDetails.ValidateMobileNumberField.ValidateMobileNumberFieldByEnteringInvalidNo;
import comcast.test.app.testCases.userManagement.profileManagement.RegisteredUserTestCasesForEditProfileDetails.ValidateStateField.EditXidioStateInProfileManagement;
import comcast.test.app.testCases.userManagement.profileManagement.RegisteredUserTestCasesForEditProfileDetails.ValidateZipField.EditXidioZipInProfileManagement;
import comcast.test.app.testCases.userManagement.profileManagement.RegisteredUserTestCasesForEditProfileDetails.ValidateZipField.ValidateZipFieldByDeletingValue;
import comcast.test.app.testCases.userManagement.profileManagement.RegisteredUserTestCasesForEditProfileDetails.ValidateZipField.ValidateZipFieldByEnteringCharactersValue;
import comcast.test.app.testCases.userManagement.profileManagement.RegisteredUserTestCasesForEditProfileDetails.ValidateZipField.ValidateZipFieldByEnteringInvalidZipLength;
import comcast.test.app.testCases.userManagement.userLogin.ValidateSignOutWorks.CheckSignOutFeatureWorksFine;
import comcast.test.app.testCases.userManagement.userLogin.ValidateUserLoginUsingInValidCredentials.LoginToXidioApplicationUsingInValidPassword;
import comcast.test.app.testCases.userManagement.userLogin.ValidateUserLoginUsingInValidCredentials.LoginToXidioApplicationUsingInValidUserName;
import comcast.test.app.testCases.userManagement.userLogin.ValidateUserLoginUsingValidCredentials.LoginToXidioApplicationWithValidCredentials;
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
import comcast.test.app.testCases.userManagement.userRegistration.UserRegistrationTestCasesForCreditCardDetails.UserRegWithInvalidSecurityCode.UserRegWithInvalidSecurityCodeLength.ValidateInvalidSecurityCodeLength;
import comcast.test.app.testCases.userManagement.userRegistration.UserRegistrationTestCasesForCreditCardDetails.UserRegWithInvalidSecurityCode.UserRegWithInvalidSecurityCodeSplCharacters.ValidateInvalidSecurityCodeWithSplChar;
import comcast.test.app.testCases.userManagement.userRegistration.UserRegistrationTestCasesForCreditCardDetails.UserRegWithNoCCNumber.RegisterToXidioApplicationWithNoCreditCardNumber;
import comcast.test.app.testCases.userManagement.userRegistration.UserRegistrationTestCasesForCreditCardDetails.UserRegWithNoPINCode.RegisterToXidioApplicationWithNoPinCode;
import comcast.test.app.testCases.userManagement.userRegistration.UserRegistrationTestCasesForCreditCardDetails.UserRegWithNoSecurityCode.RegisterToXidioApplicationWithNoSecurityCode;
import comcast.test.app.testCases.userManagement.userRegistration.UserRegistrationTestCasesForEmail.UserRegWithInvalidEmailID.UserRegWithInvalidEmailIDMissingInputs.RegisterToXidioApplicationByEnteringInValidEmail;
import comcast.test.app.testCases.userManagement.userRegistration.UserRegistrationTestCasesForEmail.UserRegWithNoEmailID.RegisterToXidioApplicationWithoutEnteringEmail;
import comcast.test.app.testCases.userManagement.userRegistration.UserRegistrationTestCasesForFirstName.UserRegWithNoFirstName.RegisterToXidioApplicationWithoutEnteringFirstName;
import comcast.test.app.testCases.userManagement.userRegistration.UserRegistrationTestCasesForLastName.UserRegWithNoLastName.RegisterToXidioApplicationWithoutEnteringLastName;
import comcast.test.app.testCases.userManagement.userRegistration.UserRegistrationTestCasesForLastName.UserRegWithValidLastName.RegisterToXidioApplicationByEnteringValidLastName;
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
import comcast.test.app.testCases.videoManagement.videoFeedBackManagement.VerifyFeedbackSubmitedSuccessfully;
import comcast.test.app.testCases.videoManagement.videoFeedBackManagement.validateMandatoryFields.ValidateAllMandatoryFieldsOfGiveFeedbackToThePublisher;
import comcast.test.app.testCases.videoManagement.videoFeedBackManagement.validateMandatoryFields.ValidateFeedbackMessageMandatoryField;
import comcast.test.app.testCases.videoManagement.videoFeedBackManagement.validateMandatoryFields.ValidateFeedbackSubjectMandatoryField;
import comcast.test.app.testCases.videoManagement.videoSearch.searchVideoByCategory.EnsureSearchChannelStoreIsWorkingFine;
import comcast.test.app.testCases.videoManagement.videoSearch.searchVideoByCategory.VerifyHomeCategoryVideosAreDisplayed;
import comcast.test.app.testCases.videoManagement.videoSearch.searchVideoByCategory.VerifyStoreCategoryVideosAreDisplayed;
import comcast.test.app.testCases.videoManagement.videoSearch.searchVideoByCategory.VerifySubscriptionsCategoryVideosAreDisplayed;
import comcast.test.app.testCases.videoManagement.videoSubscriptionManagement.paidSubscriptionForVideo.VerifySubcriptionOfPaidVideo;

@RunWith(Suite.class)
@Suite.SuiteClasses({ 
	
	//Start Registration Module....
    RegisterToXidioApplicationByClickingActivation.class,
    RegisterToXidioApplicationUsingValidCredentials.class,
    RegisterToXidioApplicationBySkipingPaymentStepAndActivationStep.class,
    RegisterToXidioApplicationWithValidCredentialByDeclineTermAndCondition.class,
    RegisterToXidioApplicationDirectlyWithPaymentDetailsWithoutPersonalInfo.class,
    RegisterToXidioApplicationWithoutEnteringFirstName.class,
    RegisterToXidioApplicationWithoutEnteringLastName.class,
    RegisterToXidioApplicationByEnteringValidLastName.class,
    RegisterToXidioApplicationWithoutEnteringAddress.class,
    RegisterToXidioApplicationWithoutEnteringCity.class,
    RegisterToXidioApplicationWithoutEnteringZip.class,
    RegisterToXidioApplicationWithoutEnteringEmail.class,
    RegisterToXidioApplicationByEnteringInValidEmail.class,
    RegisterToXidioApplicationByEnteringInValidZip.class,
    RegisterToXidioApplicationByEnteringInValidZipLength.class,
    RegisterToXidioApplicationWithoutEnteringMobileNumber.class,
    RegisterToXidioApplicationByEnteringInValidMobileNumber.class,
    RegisterToXidioApplicationWithoutEnteringPassword.class,
    RegisterToXidioApplicationByEnteringNonCapitalLetterPassword.class,
    RegisterToXidioApplicationByEnteringNonDigitPassword.class,
    RegisterToXidioApplicationByEnteringInValidLengthOfPassword.class,
    RegisterToXidioApplicationWithNoCreditCardNumber.class,
    RegisterToXidioApplicationWithInvalidCreditCardNumber.class,
    ValidateInvalidSecurityCodeWithSplChar.class,
    ValidateInvalidSecurityCodeLength.class,
    RegisterToXidioApplicationWithNoSecurityCode.class,
    RegisterToXidioApplicationWithNoPinCode.class,
    RegisterToXidioApplicationWithInvalidPinCodeCharLength.class,
    RegisterToXidioApplicationWithCheckingDiplayPinCheckbox.class,
    RegisterToXidioApplicationWithCheckingDiplayPasswordCheckbox.class,
    RegisterUserWithoutActivationCode.class,
    CheckSignOutFeatureWorksFine.class,
    LoginToXidioApplicationWithValidCredentials.class,
    LoginToXidioApplicationUsingInValidPassword.class,
    LoginToXidioApplicationUsingInValidUserName.class,
    ResetTheXidioPassword.class,
    ResetXidioPasswordWithoutProvidingEmailID.class,
    ResetTheXidioPasswordWithWrongEmail.class,
    //End Start Registration Module....
   
    //Start Profile Module....
    EditXidioAddressInProfileManagement.class,
    EditXidioLastNameInProfileManagement.class,
    EditXidioAddressInProfileManagement.class,
    EditXidioCityInProfileManagement.class,
    EditXidioStateInProfileManagement.class,
    EditXidioZipInProfileManagement.class,
    EditXidioUserEmail.class,
    ExitXidioUserMobileNumber.class,
    ValidateFirstNameFieldByDeletingValue.class,
    ValidateLastNameFieldByDeletingValue.class,
    ValidateAddressFieldByDeletingValue.class,
    ValidateCityFieldByDeletingValue.class,
    ValidateZipFieldByDeletingValue.class,
    ValidateZipFieldByEnteringCharactersValue.class,
    ValidateZipFieldByEnteringInvalidZipLength.class,
    ValidateEmailFieldByDeletingValue.class,
    ValidateEmailFieldByEnteringInvalidEmailID.class,
    ValidateMobileNumberFieldByDeletingValue.class,
    ValidateMobileNumberFieldByEnteringInvalidNo.class,
    ValidateMobileNumberFieldByEnteringExistingNo.class,
    ValidateCurrentPasswordWhenChangingPassword.class,
    ValidateNewPasswordAndConfirmPasswordMatch.class,
    VerifyPasswordChangeWorks.class,
    ValidateChangePaymentInfoMandatoryFields.class,
    ValidateChangePaymentInfoDetailsUpdatedSuccessfully.class,
    ValidatePaymentInfoCreditCardNumberWithInvalidInput.class,
    ValidatePaymentInfoMonthByEnteringInvalidMonth.class,
    ValidatePaymentInfoMonthMandatoryField.class,
    ValidatePaymentInfoYearFieldByEnteringPastYear.class,
    ValidatePaymentInfoYearMandatoryField.class,
    ValidatePaymentInfoSecurityCodeWithInvalidInputLength.class,
    ValidatePaymentInfoSecurityCodeByEnteringCharacters.class,
    VerifyChangePinCodeDetailsUpdatedSuccessfully.class,
    ValidateChangePinCodeAllMandatoryFields.class,
    ValidateChangePinCodeByEnteringInvalidPinLength.class,
    ValidateChangePasswordByEnteringInvalidPass.class,
    VerifyEnteredPinIsVisibleWhenUserClicksOnDisplayPin.class,
    VerifyEnteredPasswordIsVisibleWhenUserClicksOnDisplayPass.class,
    ValidateUserActivationCodeUpdatesSuccessfully.class,
    ValidateUserActivationCodeByEnteringInvalidCode.class,
    VerifyHelpLink.class,
    VerifyHomePageAllLinks.class,
    //End Profile Module....
                                                   
    //Start Video Management Module....
    VerifyFeedbackSubmitedSuccessfully.class,
    ValidateAllMandatoryFieldsOfGiveFeedbackToThePublisher.class,
    ValidateFeedbackMessageMandatoryField.class,
    ValidateFeedbackSubjectMandatoryField.class,
    EnsureSearchChannelStoreIsWorkingFine.class,
    VerifyStoreCategoryVideosAreDisplayed.class,
    VerifyHomeCategoryVideosAreDisplayed.class,
    VerifySubscriptionsCategoryVideosAreDisplayed.class,
    VerifySubcriptionOfPaidVideo.class
    //Start Video Management Module....

})
public class runATFRegression {

}
