package com.automation.tests;

import com.automation.screens.*;
import com.automation.utils.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NavigationTest extends BaseTest {

    @Test
    public void test() {
        HomeScreen homeScreen = new HomeScreen(driver);

        Assert.assertTrue(homeScreen.isHomeScreen(), "Home screen is not opened");

        WebviewScreen webviewScreen = homeScreen.tapOnWebviewButton();
        Assert.assertTrue(webviewScreen.isWebviewScreen(), "Webview screen is not opened");

        LoginScreen loginScreen = homeScreen.tapOnLoginButton();
        Assert.assertTrue(loginScreen.isLoginScreen(), "Login screen is not opened");

        FormsScreen formsScreen = homeScreen.tapOnFormsButton();
        Assert.assertTrue(formsScreen.isFormScreen(), "Forms screen is not opened");

        SwipeScreen swipeScreen = homeScreen.tapOnSwipeButton();
        Assert.assertTrue(swipeScreen.isSwipeScreen(), "Swipe screen is not opened");

        DragScreen dragScreen = homeScreen.tapOnDragButton();
        Assert.assertTrue(dragScreen.isDragScreen(), "Drag screen is not opened");
    }
}
