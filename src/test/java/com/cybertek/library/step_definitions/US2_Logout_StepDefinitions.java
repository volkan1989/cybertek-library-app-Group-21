package com.cybertek.library.step_definitions;

import com.cybertek.library.pages.Dashboard;
import io.cucumber.java.en.Then;

public class US2_Logout_StepDefinitions {

    Dashboard dashboard = new Dashboard();

    @Then("the user logout")
    public void the_user_logout() {
        dashboard.logOut();
    }

}
