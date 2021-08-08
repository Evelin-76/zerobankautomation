package com.zerobank.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SecurityAlertWindow {

    //WE CAN IMPLEMENT THIS CODE IN OUR DRIVER UTILITY CLASS FOR MANAGE WINDOWS SECURITY ALERT
    //THAT DON'T LET US ENTER TO THE PAGE FOR AUTOMATION
    //NOTE: I TRIED BUT IT DID NOT WORK. I USE LoginSecurityAlerPage with a method call
    // -->  new LoginSecurityAlertPage().accept(); implemented in loginStepDefs

//    String browser = ConfigurationReader.get("browser");
//
//    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
//            desiredCapabilities.setAcceptInsecureCerts(true);
//
//    ChromeOptions chromeOptions = new ChromeOptions();
//            chromeOptions.merge(desiredCapabilities);
//
//            switch (browser){
//
//        case "chrome":
//            WebDriverManager.chromedriver().setup();
//            driver = new ChromeDriver(chromeOptions);
//            break;
//        case "firefox":
//            WebDriverManager.firefoxdriver().setup();
//            FirefoxOptions options = new FirefoxOptions();
//            options.addPreference("security.tls.version.enable-deprecated", true);
//            options.addPreference("security.tls.version.min", 1);
//            driver = new FirefoxDriver(options);
//            break;
//    }

}
