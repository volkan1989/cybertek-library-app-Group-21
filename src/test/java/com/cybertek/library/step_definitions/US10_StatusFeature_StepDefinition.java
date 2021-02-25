package com.cybertek.library.step_definitions;

import com.cybertek.library.pages.US10_StatusFeature_Page;
import com.cybertek.library.utilities.ConfigurationReader;
import com.cybertek.library.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import javax.swing.*;
import java.util.List;
import java.util.Map;


public class US10_StatusFeature_StepDefinition {

        US10_StatusFeature_Page US10 = new US10_StatusFeature_Page();

        @Given("the user Librarian on the homepage")
        public void the_user_librarian_on_the_homepage() {
                Driver.getDriver().get("http://library2.cybertekschool.com/login.html");
        }

        @When("user librarian is logged in")
        public void user_librarian_is_logged_in() {
 //US10.inputUsername.sendKeys(ConfigurationReader.getProperty("librarian43"));
 //US10.inputPassword.sendKeys(ConfigurationReader.getProperty("pass43"));
 US10.loginToLibrary();

        }
        @Then("the user click users module")
        public void the_user_click_users_module() {
 US10.module.click();
        }
        @And("the user click Status dropdown")
        public void the_user_click_status_dropdown() {
         US10.status.click();
        }
        @Then("the user should see the following options")
        public void the_user_should_see_the_following_options( List <String>  followingOptions) {
                // Write code here that turns the phrase above into concrete actions
                // For automatic transformation, change DataTable to one of
                // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
                // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
                // Double, Byte, Short, Long, BigInteger or BigDecimal.
                //Assert.assertEquals(followingOptions);


           // List


        }


}
//
//
//
//        @Given("the user Librarian on the homepage")
//        public void user_librarian_is_on_the_homepage() {
//        Driver.getDriver().get("http://library2.cybertekschool.com/login.html");
//
//        String userName = ConfigurationReader.getProperty("librarian43");
//        String passWord = ConfigurationReader.getProperty("pass43");
//
//
//        }
//       @When("the user click users module")
//public void user_click_users_module(Map<String>)
//
//        @And("the user click Status dropdown")
//
//        @Then("the user should see the following options")
//    }
//}
