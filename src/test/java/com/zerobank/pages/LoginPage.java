package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.zerobank.utilities.ConfigurationReader;

public class LoginPage extends BasePage {

    @FindBy (xpath = "//*[@id= 'user_login']" )
    public WebElement usernameInputBox;

    @FindBy (css = "#user_password")
    public WebElement passwordInputBox;

    @FindBy (css = "#user_remember_me")
    public WebElement rememberMeCheckBox;

    @FindBy (xpath = "//*[@name='submit']")
    public WebElement signInButton;

    @FindBy (xpath = "//*[@tabindex='5' or text()='Forgot your password ?']")
    public WebElement forgotYourPasswordQuestion;

    @FindBy(css = ".brand")
    public WebElement logoText;

    @FindBy (xpath = "//*[text()='Log in to ZeroBank']")
    public WebElement pageTitle;



    public void loginAsUser() {
        String username = ConfigurationReader.get("username");
        String password = ConfigurationReader.get("password");

        usernameInputBox.sendKeys(username);
        passwordInputBox.sendKeys(password);
        signInButton.click();
    }
}
