package com.zerobank.pages;

import com.zerobank.step_definitions.LoginStepDefs;
import com.zerobank.utilities.BrowserUtils;
import org.junit.Assert;
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

    @FindBy(xpath = "//*[@class='alert alert-error']")
    public WebElement loginWrongMsg;

    @FindBy (xpath = "//*[.='Troubles entering the site?']")
    public WebElement loginTroublesMsgQuestion;

    public void loginAsUser() {
        String username = ConfigurationReader.get("username");
        String password = ConfigurationReader.get("password");

        usernameInputBox.sendKeys(username);
        passwordInputBox.sendKeys(password);
        signInButton.click();
    }

    public void getTextWrongMsg() {
        if (!usernameInputBox.equals(ConfigurationReader.get("username"))
                || !passwordInputBox.equals(ConfigurationReader.get("password"))) {

            String expectedErrorMsg = "Login and/or password are wrong.";
            Assert.assertEquals(expectedErrorMsg, loginWrongMsg.getText());
        }
        if (usernameInputBox.equals("") || passwordInputBox.equals("")) {
            String expectedErrorMsg = "Login and/or password are wrong.";
            Assert.assertEquals(expectedErrorMsg, loginWrongMsg.getText());
        }
    }
    public void getTextTroublesMsg() {
        if (!usernameInputBox.equals(ConfigurationReader.get("username"))
                || !passwordInputBox.equals(ConfigurationReader.get("password"))) {

            BrowserUtils.waitFor(2);
            String expectedErrorMsg = "Login and/or password are wrong.";
            Assert.assertEquals(expectedErrorMsg, loginTroublesMsgQuestion.getText());
        }
        if (usernameInputBox.equals("") || passwordInputBox.equals("")) {
            String expectedErrorMsg = "Login and/or password are wrong.";
            Assert.assertEquals(expectedErrorMsg, loginTroublesMsgQuestion.getText());
        }
    }
}
