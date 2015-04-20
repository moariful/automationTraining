package com.weather.automation.drupal;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public abstract class Utility {
    private static WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    public static void enterTextById(String element, String txt){
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id(element)));
        WebElement obj = Driver.getDriver().findElement(By.id(element));
        obj.clear();
        obj.sendKeys(txt);
        obj.sendKeys(Keys.TAB);
        timeDelay(2);
    }

    public static WebElement verifyObject(String webId){
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id(webId)));
        WebElement obj = Driver.getDriver().findElement(By.id(webId));

        return obj;
    }

    public static WebElement verifyObjectByXpath(String xpath){
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
        WebElement obj = Driver.getDriver().findElement(By.xpath(xpath));

        return obj;
    }

    public static void clickElementById(String webId){
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id(webId)));
        Driver.getDriver().findElement(By.id(webId)).click();
    }

    public static void switchWindowHandle(){
        for(String winHandle : Driver.getDriver().getWindowHandles()){
            Driver.getDriver().switchTo().window(winHandle);
        }
    }

     public static Map<String, String> getDestinationDataFromFile(String filePath){
        Map<String, String> data = new Hashtable<>();
        try {
            Path file = Paths.get(filePath);
            List<String> lines = Files.readAllLines(file);
            for(String line : lines){
                String[] tokens = line.split(",");
                data.put(tokens[0], tokens[1]);
            }
        } catch (IOException e) {
            System.out.println("Could not file " + filePath + ": " + e.getMessage());
        }

        return data;
    }

    public static void timeDelay(int i){
        Driver.getDriver().manage().timeouts().implicitlyWait(i, TimeUnit.SECONDS);
    }
}
