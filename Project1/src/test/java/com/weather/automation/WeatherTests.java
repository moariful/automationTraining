
package com.weather.automation;

import com.weather.automation.Driver;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.*;

/**
 *
 * @author patrick.day
 */
public class WeatherTests {
    static WebDriver driver;
    
    @BeforeClass
    public static void setUp(){
        driver = Driver.getDriver();
        driver.navigate().to("http://www.weather.com");
    }
    
    @AfterClass
    public static void tearDown(){
        Driver.getDriver().close();
    }
    
    @Test
    public void testSearch() throws InterruptedException{
        HomePage.search("Boston, Ma");
        (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.className("location-title")));
        assertEquals("Boston, MA Weather Forecast and Conditions - weather.com", LandingPage.getTitle());
    }
    
//    @Test
//    public void testMatchVideo() throws InterruptedException{
//        HomePage.goTo("http://www.weather.com/weather/today/l/USMA0046:1:US");
//        assertTrue("Failed to match specified video", LandingPage.matchVideo());
//    }
}
