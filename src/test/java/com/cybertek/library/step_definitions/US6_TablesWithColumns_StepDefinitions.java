package com.cybertek.library.step_definitions;

import com.cybertek.library.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class US6_TablesWithColumns_StepDefinitions {

   LoginPage loginPage = new LoginPage();

    @When("The user logs in")
    public void the_user_logs_in() {

        loginPage.loginToLibrary("student55");

    }




    @Then("The user should see the following columns names")
    public void the_user_should_see_the_following_columns_names(List<String>ColumnsList) {
        System.out.println("ColumnsList.size() = " + ColumnsList.size());
        System.out.println("ColumnsList = " + ColumnsList);

        for (String eachColumns : ColumnsList){
            System.out.println("eachColumns=" + eachColumns);
        }

    }
}
