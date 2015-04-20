package com.weather.automation.drupal;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class DrupalTests {
    WebDriver driver;

    @BeforeTest
    public void setUp(){
        driver = Driver.getDriver();
    }

    @AfterTest
    public void tearDown(){
        driver.close();
    }

    @Test
    public void performFlightSearch(){
        driver.get("http://adev.weather.com/user");
        LoginPage.user("mohammed.islam").withPassword("DEV").login();
        assertTrue(HomePage.isOpen());
    }
}
