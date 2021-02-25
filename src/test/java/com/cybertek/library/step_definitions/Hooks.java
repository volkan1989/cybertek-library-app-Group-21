package com.cybertek.library.step_definitions;

import com.cybertek.library.utilities.Driver;
import io.cucumber.java.*;


public class Hooks {

    @Before
    public void seTupScenario(){
        Driver.getDriver().get("http://library2.cybertekschool.com/login.html");
        System.out.println("******************************");
        System.out.println("Setting up browser with details");
    }
    @After
    public void tearDownScenario(Scenario scenario) {
        if (scenario.isFailed()) {
            System.out.println("Test FAILED");
        } else {
            System.out.println("---Take a screenshot");
            System.out.println("---Closing browser and ");
        }
        System.out.println("******************************");
        Driver.closeDriver();
    }

}
