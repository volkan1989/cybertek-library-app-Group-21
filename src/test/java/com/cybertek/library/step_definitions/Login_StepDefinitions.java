package com.cybertek.library.step_definitions;

import com.cybertek.library.pages.Dashboard;
import com.cybertek.library.pages.LoginPage;
import com.cybertek.library.utilities.ConfigurationReader;
import com.cybertek.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_StepDefinitions {

    Dashboard dashboard = new Dashboard();
    LoginPage loginPage = new LoginPage();


    @Given("the user on login page")
    public void the_user_on_login_page() {
        System.out.println("User on login page");
    }

    @When("the user login as a student")
    public void the_user_login_as_a_student() {
       loginPage.loginToLibrary("student54");
    }

    @Then("the user on  books")
    public void the_user_on_books() {
        Assert.assertTrue(dashboard.booksTitle.isDisplayed());
    }

    @When("the user login as a librarian")
    public void the_user_login_as_a_librarian() {
        loginPage.loginToLibrary("librarian43");
    }

    @Then("the user on  Dashboard")
    public void the_user_on_dashboard() {
        Assert.assertTrue(dashboard.dashboardTitle.isDisplayed());
    }

}
