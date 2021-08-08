package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
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

    public String getSingleOptionDropDownText(int index){
       String ElementByIndex = Driver.get().findElement(By.xpath("//option[@value ='"
       + index +"']")).getText();
       return ElementByIndex;
    }

}
