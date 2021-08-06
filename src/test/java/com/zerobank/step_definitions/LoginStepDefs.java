package com.zerobank.step_definitions;

import com.zerobank.pages.LoginSecurityAlertPage;
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

}
