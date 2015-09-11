package com.weather.automation.drupal;

import org.openqa.selenium.WebElement;

public class LoginPage {

    private static WebElement loginButton = Utility.verifyObject("edit-submit");

    public static LoginHandler user(String user){
        return new LoginHandler(user);
    }

    static class LoginHandler{
        String username;
        String password;

        public LoginHandler(String user){
            username = user;
        }

        public LoginHandler withPassword(String pass){
            password = pass;
            return this;
        }

        public void login(){
            Utility.enterTextById("edit-name", username);
            Utility.enterTextById("edit-pass", password);
            loginButton.click();
        }
    }

}
