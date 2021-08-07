package com.zerobank.step_definitions;

import com.zerobank.pages.BasePage;
import com.zerobank.pages.DashboardPage;
import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AccountSummaryStepDefs {
    @When("user is in account summary page")
    public void userIsInAccountSummaryPage() {
        String loginPage = ConfigurationReader.get("url");
        String currentPage = Driver.get().getCurrentUrl();
        new DashboardPage().waitUntilLoaderScreenDisappear();
        System.out.println(loginPage);
        System.out.println(currentPage);
        Assert.assertNotEquals(loginPage,currentPage);
    }

    @Then("title of page is {string}")
    public void titleOfPageIs(String arg0) {
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals("Zero –Account summary",actualTitle);
    }

    @And("Account drop down options are:")
    public void accountDropDownOptionsAre() {
    }

    @And("Transactions table column names are:")
    public void transactionsTableColumnNamesAre() {
    }
}
