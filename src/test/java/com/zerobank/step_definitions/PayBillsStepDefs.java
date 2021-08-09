package com.zerobank.step_definitions;

import com.zerobank.pages.PayBillsPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PayBillsStepDefs {

    @When("user enters {string} in Amount input box")
    public void userEntersInAmountInputBox(String amount) throws InterruptedException {
        new PayBillsPage().amountInputBox.sendKeys(amount);
    }

    @And("user enters month {string} and year {string} and day {string}")
    public void userEntersMonthAndYearAndDay(String month, String year, String day) {
        new PayBillsPage().calendarInputBox.click();
        new PayBillsPage().getDinamicDateLocator(month,year,day).click();
    }

    @And("user enters {string} as description")
    public void userEntersAsDescription(String description) {
        new PayBillsPage().descriptionInputBox.sendKeys(description);
    }

    @And("user clicks on the Pay button")
    public void userClicksOnTheButton() {
        new PayBillsPage().Paybutton.click();
    }

    @Then("{string} is displayed")
    public void isDisplayed(String expectedSuccessMsg) {
        String actualSuccessMsg = new PayBillsPage().successPageesMsg.getText();
        Assert.assertEquals(expectedSuccessMsg,actualSuccessMsg);

        Assert.assertEquals(expectedSuccessMsg,actualSuccessMsg);
    }

    @When("user leaves empty {string} input box")
    public void userLeavesEmptyInputBox(String arg0) {
    }

    @When("user enters to Amount input box")
    public void userEntersToAmountInputBox() {
    }

    @And("enter numerical values like {int}")
    public void enterNumericalValuesLike(int arg0) {
    }

    @But("does NOT enter alphabetical or special characters like {string}")
    public void doesNOTEnterAlphabeticalOrSpecialCharactersLike(String arg0) {
    }

    @Then("values entered is accepted")
    public void valuesEnteredIsAccepted() {
    }



}
