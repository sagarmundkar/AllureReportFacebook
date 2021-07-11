package com.facebook.test;

import Pages.Login;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import io.qameta.allure.Story;
import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utility.Extentreportlistener;

@Listeners(Extentreportlistener.class)
public class ExtentReportLogin extends BaseProgram{
    /***
     * ExtentHtmlReporter are used to create the htmlreporter
     *  extent object are used to attach the report and add system info
     *  ExtentTest are user for creating the TestName
     *  test object return the logs
     *  flush() method used to write logs in html file
     */


    @Test
    @Description("Login to the Facebook Page")
    @Story("Valid Credentials Login")
    public void LoginTest() throws InterruptedException {
        Login login = new Login(driver);
        login.LoginApplication();

    }

}
