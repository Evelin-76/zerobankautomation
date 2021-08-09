package com.zerobank.step_definitions;

import com.zerobank.pages.LoginSecurityAlertPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.Driver;


public class LoginStepDefs extends LoginPage{

    @Given("user is in login page")
    public void user_is_in_login_page() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
    }

    @When("user enters valid {string} and {string}")
    public void user_enters_valid_and(String string, String string2) {
       // BrowserUtils.waitFor(3);
        LoginPage loginPage = new LoginPage();
        loginPage.loginAsUser();
   //     BrowserUtils.waitFor(1);
        new LoginSecurityAlertPage().accept();
    }

    @Then("user enters to Account summary page")
    public void user_enters_to_Account_summary_page() {
        String expectedUrl = "http://zero.webappsecurity.com/bank/account-summary.html";
        String actualUrl = Driver.get().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }

    @When("user enter invalid username {string} or password {string}")
    public void userEnterInvalidUsernameOrPassword(String arg0, String arg1) {
        new LoginPage().usernameInputBox.sendKeys(arg0);
        new LoginPage().passwordInputBox.sendKeys(arg1);
        new LoginPage().signInButton.click();

        if(!ConfigurationReader.get("username").equals(arg0)){
            String username = ConfigurationReader.get("username");
            String invalidUsername = arg0;
            System.out.println("Valid username is: " +  username);
            System.out.println("Invalid username used is: " + invalidUsername);
        }else if(!ConfigurationReader.get("password").equals(arg1)){
            String password = ConfigurationReader.get("password");
            String invalidPassword = arg1;
            System.out.println("Valid password is: " +  password);
            System.out.println("Invalid password used is: " + invalidPassword);
        }

        new LoginPage().getTextWrongMsg();
    }

    @When("any login input box is empty {string} {string}")
    public void anyLoginInputBoxIsEmpty(String arg0, String arg1) {
        new LoginPage().usernameInputBox.sendKeys(arg0);
        new LoginPage().passwordInputBox.sendKeys(arg1);
        new LoginPage().signInButton.click();

        if(!ConfigurationReader.get("username").equals(arg0)){
            String username = ConfigurationReader.get("username");
            String EmptyUsername = arg0;
            System.out.println("Username input box is empty");
        }else if(!ConfigurationReader.get("password").equals(arg1)){
            String password = ConfigurationReader.get("password");
            String EmptyPassword = arg1;
            System.out.println("Password input box is empty");
        }
    }
    @Then("user sees a login error message")
    public void userSeesALoginErrorMessage() {
        new LoginPage().getTextTroublesMsg();
    }
}
