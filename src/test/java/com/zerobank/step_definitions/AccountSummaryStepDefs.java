package com.zerobank.step_definitions;

import com.zerobank.pages.BasePage;
import com.zerobank.pages.DashboardPage;
import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

public class AccountSummaryStepDefs {
    @When("user is in account summary page")
    public void userIsInAccountSummaryPage() {
        String loginPage = ConfigurationReader.get("url");
        String currentPage = Driver.get().getCurrentUrl();
        new DashboardPage().waitUntilLoaderScreenDisappear();
        Assert.assertNotEquals(loginPage,currentPage);
    }

    @Then("title of page is {string}")
    public void titleOfPageIs(String expectedTitle) {
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }

    @And("Account Summary account types are:")
    public void accountSummaryAccountTypesAre(List<String> expectedAccountTypes) {
        List<String> actualAccountTypes = BrowserUtils.getElementsText(new DashboardPage().accountTypeList);
        Assert.assertEquals(expectedAccountTypes,actualAccountTypes);
    }

    @And("Credit Accounts table column names are:")
    public void creditAccountsTableColumnNamesAre(List<String> expectedColumnsName) {
        List<String > actualColumnsName = BrowserUtils.getElementsText(new DashboardPage().tableHead);
        String expect= "";
        for(String each : expectedColumnsName) {
            expect += each + " ";
        }

        String actual="";
        for(String aceach : actualColumnsName) {
           actual = aceach + " ";
        }

        Assert.assertEquals(expect,actual);
    }
}
