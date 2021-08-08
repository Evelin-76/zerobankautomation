package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Map;

public class PayBillsPage {

    @FindBy (id = "sp_amount")
    public WebElement amountInputBox;

    @FindBy (id = "sp_description")
    public WebElement descriptionInputBox;

    @FindBy (css = "[type='submit']")
    public WebElement Paybutton;

    @FindBy(css = ".controls")
    public List<WebElement> rowNames;

    @FindBy (xpath = "//select[@id='sp_payee']/option")
    public List<WebElement> payeeOptionsDropDown;

    @FindBy (xpath = "//select[@name='account']/option")
    public  List<WebElement> accountOptionsDropDown;


    //Locator for select dynamically one full date(month/year/day ->writing int numbers)
    public WebElement getDinamicDateLocator(int monthNumber,int yearNumber,int dayNumber){
        WebElement dinamicDateCalendar = Driver.get().findElement(By.xpath("(//td[@data-handler='selectDay'][@data-month='" + monthNumber + "']" +
                "[@data-year='" + yearNumber + "']/a)[" + dayNumber + "]"));
        return dinamicDateCalendar;
    }


}
