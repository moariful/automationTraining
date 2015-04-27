package com.weather.automation.drupal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class HomePage {
    private static WebElement menu = Utility.verifyObject("admin-menu");
    //private WebElement content = menu.findElement(By.partialLinkText("/admin/content"));

    public static boolean isOpen(){
        return true;
    }

    public static void nagivateTo(){
        Utility.verifyObjectByXpath("//*[@id=\"admin-menu-menu\"]/li[1]/a").click();
    }
}
