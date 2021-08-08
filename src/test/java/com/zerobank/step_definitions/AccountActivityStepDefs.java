package com.zerobank.step_definitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.pages.DashboardPage;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

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
    public void dropDownDefaultOptionIs(String expectedDefaultOptionName) {
     //   System.out.println(Driver.get().findElement(By.xpath("//option[@value ='1']")));
        String actualDefaultOptionName = new AccountActivityPage().getSingleOptionDropDownText(1);
        Assert.assertEquals(expectedDefaultOptionName,actualDefaultOptionName);
        System.out.println(expectedDefaultOptionName);
        System.out.println(actualDefaultOptionName);
    }

    @When("user clicks on drop dawn options box")
    public void userClicksOnDropDawnOptionsBox() {
        new AccountActivityPage().accountDrowDownBox.click();
    }

    @Then("drop down options are:")
    public void dropDownOptionsAre() {
    }

    @Then("Transtaction table column names are:")
    public void transtactionTableColumnNamesAre() {
    }
}
