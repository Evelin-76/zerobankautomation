package com.zerobank.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.zerobank.utilities.Driver;

public class Hooks {

    @Before
    public void setUp() throws InterruptedException {

    }
    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            final byte[] screenshot = ( (TakesScreenshot)Driver.get() ).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png", "screenshot");
        }

        Driver.closeDriver();
    }
}
