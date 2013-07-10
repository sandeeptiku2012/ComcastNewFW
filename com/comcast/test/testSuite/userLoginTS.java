package comcast.test.testSuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import comcast.test.app.testCases.userManagement.userLogin.ValidateSignOutWorks.CheckSignOutFeatureWorksFine;
import comcast.test.app.testCases.userManagement.userLogin.ValidateUserLoginUsingInValidCredentials.LoginToXidioApplicationUsingInValidPassword;
import comcast.test.app.testCases.userManagement.userLogin.ValidateUserLoginUsingInValidCredentials.LoginToXidioApplicationUsingInValidUserName;
import comcast.test.app.testCases.userManagement.userLogin.ValidateUserLoginUsingValidCredentials.LoginToXidioApplicationWithValidCredentials;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	
	CheckSignOutFeatureWorksFine.class,
	LoginToXidioApplicationUsingInValidPassword.class,
	LoginToXidioApplicationUsingInValidUserName.class,
	LoginToXidioApplicationWithValidCredentials.class,
	
})
public class userLoginTS {

}
