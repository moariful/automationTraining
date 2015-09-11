package com.weather.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by patrick.day on 2/5/15.
 */
public class Driver {
    private static WebDriver driver;

    private Driver(){}

    public static WebDriver getDriver(){
    	if(driver != null)
        	return Driver.driver;
        else 
        	return driver = new FirefoxDriver();
    }

    public static void sleep(long seconds){
        driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
    }

    public static void setDriver(WebDriver driver){
        Driver.driver = driver;
    }
}
