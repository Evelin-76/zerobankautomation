package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AccountActivityPage extends BasePage{

    @FindBy ( id = "aa_accountId")
    public WebElement accountDrowDownBox;

    @FindBy (css = "option[value]")
    public List<WebElement> accountDropDownOptions;

    @FindBy (xpath = "//thead")
    public WebElement tableHeadrow;
}
