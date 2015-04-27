package com.weather.automation.drupal;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import static org.testng.Assert.assertTrue;

public class DrupalTests {
    WebDriver driver;

    @BeforeClass
    public void setUp(){
        driver = Driver.getDriver();
        driver.get("http://adev.weather.com/user");
        LoginPage.user("mohammed.islam").withPassword("DEV").login();
        assertTrue(HomePage.isOpen());
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void addContent(){
        assertTrue(HomePage.isOpen());
        HomePage.nagivateTo();

    }
}
