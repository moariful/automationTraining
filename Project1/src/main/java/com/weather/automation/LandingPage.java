package com.weather.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.xml.ws.WebEndpoint;

/**
 * Created by patrick.day on 2/23/15.
 */
public class LandingPage {
    static WebDriver driver;

    public LandingPage(WebDriver drive){
        driver = drive;
    }

    public static String getTitle(){
        return driver.getTitle();
    }

    public static boolean matchVideo(){
        boolean flag = false;
        WebElement video = driver.findElement(By.linkText("Cindy's Monday afternoon forecast"));
        if(video != null)
            flag = true;

        return flag;
    }
}
