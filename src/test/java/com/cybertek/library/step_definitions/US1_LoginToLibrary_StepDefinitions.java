package com.cybertek.library.step_definitions;

import com.cybertek.library.pages.US1_LoginToLibrary_Page;
import com.cybertek.library.utilities.BrowserUtils;
import com.cybertek.library.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class US1_LoginToLibrary_StepDefinitions {

    US1_LoginToLibrary_Page loginToLibraryPage = new US1_LoginToLibrary_Page();

    @Given("The user on login page")
    public void the_user_on_login_page() {
        System.out.println("YOU ARE ON LOGIN PAGE");
    }

    @When("the user login with {string} and {string} sees {string}")
    public void theUserLoginWithAndSees(String username, String password, String page) {

        loginToLibraryPage.usernameInputBox.sendKeys(username);
        loginToLibraryPage.passwordInputBox.sendKeys(password);
        loginToLibraryPage.signInButton.click();

        BrowserUtils.wait(1);
        String actualPage = loginToLibraryPage.ExpectedDashboard.getText();
        Assert.assertTrue(actualPage.equals(page));


    }


//    @Given("The user on login page")
//    public void the_user_on_login_page() {
//        System.out.println("YOU ARE ON LOGIN PAGE");
//    }
//
//    @When("the user enters {string} to username box")
//    public void the_user_enters_to_username_box(String username) {
//
//        loginToLibraryPage.usernameInputBox.sendKeys(username);
//
//    }
//
//    @Then("the user enters {string} to password box")
//    public void the_user_enters_to_password_box(String password) {
//
//        loginToLibraryPage.passwordInputBox.sendKeys(password);
//
//    }
//
//    @And("the user clicks to signIn button")
//    public void the_User_Clicks_To_SignIn_Button() {
//        loginToLibraryPage.signInButton.click();
//    }
//
//    @Then("the user on {string}")
//    public void the_user_on(String  page) {
//
//        String actualPage = loginToLibraryPage.ExpectedDashboard.getText();
//        Assert.assertTrue(actualPage.equals(page));
//
//    }


}
