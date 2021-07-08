package com.facebook.test;

import Pages.Login;
import Pages.Logout;
import Pages.PostPage;
import Pages.Registration;
import io.qameta.allure.*;
import jdk.jfr.Description;
import org.testng.annotations.Test;

import java.awt.*;

public class TestPages extends BaseProgram {

    @Test(priority = 3)
    @Description("Registration to the Facebook Page")
    @Epic("EP001")
    @Story("Registration Page")
    @Feature("Feature1: Registration")
    @Severity(SeverityLevel.NORMAL)
    public void registration() throws InterruptedException, AWTException {
        Registration registration = new Registration(driver);
        registration.registration();
    }

    @Test(priority = 1)
    @Description("Login to the Facebook Page")
    @Epic("EP001")
    @Story("Valid Credentials Login")
    @Feature("Feature2: Login")
    @Severity(SeverityLevel.MINOR)
    public void logininfo() throws InterruptedException {
        Login login = new Login(driver);
        login.LoginApplication();
    }

    @Test(priority = 2)
    @Description("Logout to the Facebook Page")
    @Epic("EP001")
    @Story("Logout Page")
    @Feature("Feature3: Logout")
    @Severity(SeverityLevel.MINOR)
    public void logoutInfo() throws InterruptedException {
        Login login = new Login(driver);
        login.LoginApplication();

        Logout logout =new Logout(driver);
        logout.logout();
    }

    @Test(priority = 4)
    @Description("Logout to the Facebook Page")
    @Epic("EP001")
    @Story("Logout Page")
    @Feature("Feature3: Logout")
    @Severity(SeverityLevel.MINOR)
    public void postpage() throws InterruptedException, AWTException {

        Login login = new Login(driver);
        login.LoginApplication();

        PostPage postPage = new PostPage(driver);
        postPage.Post_to_page();
    }
}
