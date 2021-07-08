package com.facebook.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseProgram {
   public static WebDriver driver;

    @BeforeMethod
    @Description("Launch Browser")
    public void Setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
    }

    @AfterMethod
    @Description("Closing An Application")
    public void tearDown(){
        driver.close();

    }

}
