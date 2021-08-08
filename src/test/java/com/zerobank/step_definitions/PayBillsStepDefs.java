package com.zerobank.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PayBillsStepDefs {
    @When("user completes a successful Pay operation")
    public void userCompletesASuccessfulPayOperation() {
    }

    @Then("{string} is displayed")
    public void isDisplayed(String arg0) {
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
