package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.LinkedHashSet;
import java.util.List;

public class DashboardPage extends BasePage {

    @FindBy (css = ".board-header")
    public List<WebElement> accountTypeList;
    @FindBy (xpath = "(//thead/tr)[3]")
    public List<WebElement> tableHead;


}
