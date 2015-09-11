package com.weather.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.Key;
import java.util.concurrent.TimeUnit;

/**
 * Created by patrick.day on 2/23/15.
 */
public class HomePage {
    static WebDriver driver = Driver.getDriver();

    public static LandingPage search(String location){
        WebElement searchBox = driver.findElement(By.name("search"));
        searchBox.sendKeys(location);
        Driver.sleep(10);
        searchBox.sendKeys(Keys.ENTER);

        return new LandingPage(driver);
    }
}
