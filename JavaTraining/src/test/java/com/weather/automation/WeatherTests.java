
package com.weather.automation;

import com.weather.automation.Driver;
import org.junit.*;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.*;

/**
 *
 * @author patrick.day
 */
public class WeatherTests {
    WebDriver driver;
    
    @Before
    public void setUp(){
        driver = Driver.getDriver();
    }
    
    @After
    public void tearDown(){
        Driver.getDriver().close();
    }
    
    @Test
    public void testSearch() throws InterruptedException{
        HomePage.search("Boston, Ma");
        assertEquals("Boston, MA Weather Forecast and Conditions - weather.com", LandingPage.getTitle());
    }
    
    @Test
    public void testMatchVideo() throws InterruptedException{
        HomePage.goTo("http://www.weather.com/weather/today/l/USMA0046:1:US");
        assertTrue("Failed to match specified video", LandingPage.matchVideo());
    }
}
