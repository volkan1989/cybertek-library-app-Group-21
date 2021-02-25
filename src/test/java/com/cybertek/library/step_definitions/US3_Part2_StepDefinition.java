package com.cybertek.library.step_definitions;

import com.cybertek.library.pages.LoginPage;
import com.cybertek.library.pages.US3_Librarian_Page;
import com.cybertek.library.utilities.BrowserUtils;
import com.cybertek.library.utilities.ConfigurationReader;
import com.cybertek.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;

import java.util.List;

public class US3_Part2_StepDefinition {

    LoginPage loginPage = new LoginPage();
    US3_Librarian_Page modules = new US3_Librarian_Page();

    @Given("the librarian on the homepage")
    public void the_librarian_on_the_homepage() {
       loginPage.loginToLibrary("librarian43");
    }


    @Then("the librarian should see following modules")
    public void the_librarian_should_see_following_modules(List<String> expectedModules) {
        System.out.println("user should see the modules = " + expectedModules);

        //User should ables to see modules
        for (WebElement eachModules : modules.Librarianmodules) {
            System.out.println("eachModules = " + eachModules.isDisplayed());
        }

        BrowserUtils.wait(3);

        Driver.closeDriver();

        }


}
