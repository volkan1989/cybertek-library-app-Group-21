package com.cybertek.library.step_definitions;

import com.cybertek.library.utilities.BrowserUtils;
import com.cybertek.library.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class Hooks {

    @Before
    public void setUpScenario(){
        Driver.getDriver().get("http://library2.cybertekschool.com/login.html");
        System.out.println("******************************");
        System.out.println("Setting up browser with details");
        BrowserUtils.wait(1);
    }


    @After
    public void tearDownScenario(Scenario scenario){
        if (scenario.isFailed()){
            byte[] screenShot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot, "image/png", scenario.getName());
        }

        BrowserUtils.wait(2);
        Driver.closeDriver();

    }


}
