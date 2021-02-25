package com.cybertek.library.step_definitions;

import com.cybertek.library.pages.Dashboard;
import com.cybertek.library.pages.LoginPage;
import com.cybertek.library.pages.US3_Librarian_Page;
import com.cybertek.library.utilities.BrowserUtils;
import com.cybertek.library.utilities.ConfigurationReader;
import com.cybertek.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class US3_Part2_StepDefinition {

    LoginPage homePage = new LoginPage();
    US3_Librarian_Page modules = new US3_Librarian_Page();

    @Given("the librarian on the homepage")
    public void the_librarian_on_the_homepage() {
       Driver.getDriver().get(ConfigurationReader.getProperty("url"));

       //user should login
        String username = ConfigurationReader.getProperty("librarian43");
        String password = ConfigurationReader.getProperty("pass43");

        homePage.usernameInput.sendKeys(username);
        homePage.passwordInput.sendKeys(password);
        homePage.signInButton.click();

        //librarian should see homePage
        Driver.getDriver().get(ConfigurationReader.getProperty("homepage"));
    }

    @Then("the user should see following modules")
    public void the_user_should_see_following_modules(List<String> expectedModules) {

        System.out.println("user should see the modules = " + expectedModules);

        for (WebElement eachModules : modules.Librarianmodules) {
            System.out.println("eachModules = " + eachModules.isDisplayed());
        }

        BrowserUtils.wait(5);

    }






}
