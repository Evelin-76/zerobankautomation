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
    }

    @When("user leaves empty {string} input box")
    public void userLeavesEmptyInputBox(String inputBox) {

        //condition for manage boxes from steps in feature file
        if (inputBox.equals("amount")) {
            new PayBillsPage().amountInputBox.sendKeys("500");
            System.out.println("Amount input box is empty");
        } else if (inputBox.equals("date")) {
            new PayBillsPage().calendarInputBox.click();

            new PayBillsPage().getDinamicDateLocator("7", "2021", "24").click();
            System.out.println("Date input box is empty");
        } else if (inputBox.equals("")) {
            System.out.println("Amount and Date input boxes are empty");
            //both are empty
        }
        new PayBillsPage().Paybutton.click();


//        //required as a attribute means we can get a window alert about to fill in some blank
//        boolean amountInputEmpty = Boolean.parseBoolean(new PayBillsPage().amountInputBox.getAttribute("required"));
//        boolean dateInputEmpty = Boolean.parseBoolean(new PayBillsPage().calendarInputBox.getAttribute("required"));
//        //checking if boxes are empty or not
//        System.out.println("Amount is required: " + new PayBillsPage().amountInputBox.getAttribute("required"));
//        System.out.println("Date is required: " + new PayBillsPage().calendarInputBox.getAttribute("required"));

        //  if(amountInputEmpty == true || dateInputEmpty == true){
        //  String expectedMsg = "completa este campo"
        //   Assert.assertEquals(expectedMsg, "completa este campo");}
         }
         @Then("msg {string} is displayed")
         public void msgIsDisplayed(String expectedAlertMsg) {
        String actualAlertMsg = new PayBillsPage().amountInputBox.getAttribute("validationMessage");
             Assert.assertEquals(expectedAlertMsg,actualAlertMsg);
         }
        @When("user enters to Amount input box")
        public void userEntersToAmountInputBox () {
        }

        @And("enter numerical values like {int}")
        public void enterNumericalValuesLike ( int arg0){
        }

        @But("does NOT enter alphabetical or special characters like {string}")
        public void doesNOTEnterAlphabeticalOrSpecialCharactersLike (String arg0){
        }

        @Then("values entered is accepted")
        public void valuesEnteredIsAccepted () {
        }



}
