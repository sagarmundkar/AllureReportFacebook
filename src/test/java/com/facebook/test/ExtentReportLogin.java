package com.facebook.test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ExtentReportLogin extends BaseProgram{
    /***
     * ExtentHtmlReporter are used to create the htmlreporter
     *  extent object are used to attach the report and add system info
     *  ExtentTest are user for creating the TestName
     *  test object return the logs
     *  flush() method used to write logs in html file
     */
    @Test
    public void LoginTest() throws InterruptedException {
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"/TestReportOutput/extent.html");
        //create html report
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        htmlReporter.config().setTheme(Theme.DARK);
        extent.setSystemInfo("Hostname", "LocalHost");
        extent.setSystemInfo("OS","Window");

        //create toggle for given test
        ExtentTest test = extent.createTest("LoginTest");

        test.log(Status.INFO,"Entering Username");
        driver.findElement(By.name("email")).sendKeys("*****@gmail.com");
        test.log(Status.INFO,"Entering Password");
        driver.findElement(By.name("pass")).sendKeys("*****@1234");
        test.log(Status.PASS,"Navigate to home page");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(1000);
        //Flush used to write the log in file
        extent.flush();

    }

}
