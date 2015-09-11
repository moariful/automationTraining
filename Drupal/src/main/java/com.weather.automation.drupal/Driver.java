package com.weather.automation.drupal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

    private static WebDriver driver; //static member varialble

    private Driver(){} // constructor - intializer -- intializing the instance of the class.  it sets the member variables to a default value.

    public static WebDriver getDriver(){  //this is a singleton.  After inital use this will be set to firefox.
        if(driver == null)
            driver = new FirefoxDriver();

        return driver;  //output of this driver, which gaurntees that it will return the type driver.  Driver is the browser.
    }

    public static void setDriver(WebDriver newDrvier){
        driver = newDrvier;
    } //the setter is instantiating the driver.

    public static void close(){
        driver.close();
    }

}
