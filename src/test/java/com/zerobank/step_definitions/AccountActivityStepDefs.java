package com.zerobank.step_definitions;

import com.zerobank.pages.DashboardPage;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AccountActivityStepDefs {
    @And("user is in Dashboard page")
    public void userIsInDashboardPage() {
      new DashboardPage().verifyDashboardPage();
    }

    @When("user navigate to {string}")
    public void userNavigateTo(String tab) {
        new DashboardPage().navigateToTab(tab);

    }

    @Then("drop down default option is {string}")
    public void dropDownDefaultOptionIs(String expectedPageTitle) {
        String actualPageTitle = Driver.get().getTitle();
        Assert.assertEquals(expectedPageTitle,actualPageTitle);
    }

    @When("user clicks on drop dawn options box")
    public void userClicksOnDropDawnOptionsBox() {
    }

    @Then("drop down options are:")
    public void dropDownOptionsAre() {
    }

    @Then("Transtaction table column names are:")
    public void transtactionTableColumnNamesAre() {
    }
}
