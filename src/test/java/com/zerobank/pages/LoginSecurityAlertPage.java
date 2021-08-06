package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginSecurityAlertPage extends BasePage{

    @FindBy(xpath = "//*[@aria-expanded='false']")
    public WebElement alertSecurityPage;

    @FindBy (css = "#proceed-link")
    public WebElement access;

    public void accept(){
      //  if(Driver.get().getCurrentUrl().equals("https://zero.webappsecurity.com/auth/accept-certs.html?user_token=2cd05597-37af-4ea7-8f2d-264e5489e5d7")){
            alertSecurityPage.click();
            access.click();
     //   }

    }
}
