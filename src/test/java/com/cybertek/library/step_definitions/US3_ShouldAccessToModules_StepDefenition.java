package com.cybertek.library.step_definitions;

import com.cybertek.library.pages.Users;
import com.cybertek.library.utilities.BrowserUtils;
import com.cybertek.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;

import java.util.List;

public class US3_ShouldAccessToModules_StepDefenition {

    Users homePage = new Users();


    @Given("the student on the home page")
    public void the_student_on_the_home_page() {
      //login page
        Driver.getDriver().get("http://library2.cybertekschool.com/login.html");
        //here we call loginPage method userName and password
        homePage.loginPaged();
    }

    @Then("the student should see following modules")
    public void the_student_should_see_following_modules(List<String> expectedResult) {
        //Loop through List of WebElements,pass in to place holder list
        System.out.println("user should see 2 following modules "+ expectedResult);
        for (WebElement eachModules :homePage.modules){
            System.out.println("eachModules = "+eachModules.isDisplayed());
        }
        BrowserUtils.wait(3);

    }


}
