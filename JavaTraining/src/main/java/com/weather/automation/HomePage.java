package com.weather.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.security.Key;

/**
 * Created by patrick.day on 2/23/15.
 */
public class HomePage {
    static WebDriver driver = Driver.getDriver();

    public static void goTo(String url){
        driver.navigate().to(url);
    }

    public static void search(String location){
        goTo("http://www.weather.com");
        WebElement searchBox = driver.findElement(By.name("search"));
        searchBox.sendKeys(location);
        searchBox.sendKeys(Keys.ENTER);
    }
}
