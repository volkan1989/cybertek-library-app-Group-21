package com.cybertek.library.step_definitions;

import com.cybertek.library.pages.LoginPage;
import com.cybertek.library.pages.US4_LocatorsBase;
import com.cybertek.library.utilities.Driver;
import io.cucumber.java.an.E;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class US4_StepDefinitions  extends US4_LocatorsBase {

    @Then("User write {string} to full name")
    public void user_write_to_full_name(String string) throws Exception{

        Thread.sleep(1000);
        EditFullName.clear();
        Thread.sleep(1000);
        EditFullName.sendKeys(string);
    }




    @Then("User write {string} to password")
    public void user_write_to_password(String string) throws Exception{
        Thread.sleep(1000);
        EditPassword.clear();
        Thread.sleep(1000);
        EditPassword.sendKeys(string);

    }
    @Then("User write {string} to email")
    public void user_write_to_email(String string) throws Exception {
        Thread.sleep(1000);
        EditEmail.clear();
        Thread.sleep(1000);
        EditEmail.sendKeys(string);

    }
    @Then("User select {string} in user group")
    public void user_select_in_user_group(String string) throws Exception{
       userGroupDropDown.click();
       Thread.sleep(1000);

       String userGroupOptions = librarianOption.getText();

       if(librarianOption.getText().equals("Students")){
           librarianOption.submit();
       }




    }
    @Then("User select {string} in status")
    public void user_select_in_status(String string) {



    }
    @Then("User select {string} in start date")
    public void user_select_in_start_date(String string) {


    }
    @Then("User write {string} to address")
    public void user_write_to_address(String string) {


    }





    //===========================================================

    @Given("Add users with all valid info")
    public void add_users_with_all_valid_info() throws Exception{
        Thread.sleep(1000);
        LoginPage loginPage = new LoginPage();
        loginPage.loginToLibrary("librarian43");
        Thread.sleep(1000);
        usersBtn.click();
    }


    @When("Librarians able to close the add user window with close button")
    public void librarians_able_to_close_the_add_user_window_with_close_button()throws Exception{
        Thread.sleep(1000);
        addUserBtn.click();
//        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        Thread.sleep(1000);
        xBtn.click();
    }

    @Then("Librarians able to edit user info")
    public void librarians_able_to_edit_user_info()throws Exception {
        Thread.sleep(1000);
        editBtn.click();
        Thread.sleep(1000);



        if(editUserInformation.isDisplayed()){
            System.out.println("TestPassed!!!");
        }else {
            System.err.println("Edit user information did not displayed ");
        }





    }

}
