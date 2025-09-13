package com.automation.tests;

import com.automation.screens.HomeScreen;
import com.automation.screens.LoginScreen;
import com.automation.screens.SignUpScreen;
import com.automation.utils.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUpTest extends BaseTest {

    @Test
    public void createAccount() {
        HomeScreen homeScreen = new HomeScreen(driver);

        LoginScreen loginScreen = homeScreen.tapOnLoginButton();

        loginScreen.isLoginScreen();

        SignUpScreen signUpScreen = loginScreen.tapOnSignUpButton();
        signUpScreen.isSignUpScreen();

        signUpScreen.enterSignUpEmail("Diego2@gmail.com");
        signUpScreen.enterSignUpPassword("Diego1223");
        signUpScreen.enterSignUpConfirmPassword("Diego1223");
        signUpScreen.tapOnSignUpButton();
        Assert.assertTrue(signUpScreen.isSignedUpMessageDisplayed(), "Sign Up Message Not Displayed");
    }
}
