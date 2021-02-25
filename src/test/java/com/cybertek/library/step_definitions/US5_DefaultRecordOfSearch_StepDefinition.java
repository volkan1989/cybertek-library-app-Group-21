package com.cybertek.library.step_definitions;


import com.cybertek.library.pages.US5_DefaultRecordOfSearch_Page;
import com.cybertek.library.utilities.ConfigurationReader;
import com.cybertek.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class US5_DefaultRecordOfSearch_StepDefinition {
    US5_DefaultRecordOfSearch_Page page= new US5_DefaultRecordOfSearch_Page();



    @Given("user is on login page")
    public void user_is_on_login_page() {
        Driver.getDriver().get("http://library2.cybertekschool.com/login.html");
    }

    @Given("user login as librarian43")
    public void user_login_as_librarian43() {
        page.userInputName.sendKeys(ConfigurationReader.getProperty("librarian43"));
        page.passwordInput.sendKeys(ConfigurationReader.getProperty("pass43"));
        page.signUpBtn.click();
    }

    @When("user clicks on users link")
    public void user_clicks_on_users_link() {
        page.usersBtn();
    }
    @Then("show records should be value of {int}")
    public void show_records_should_be_value_of(Integer int1) {
        String expected = int1.toString();
        Select select= new Select(page.nums);
        String actual= select.getFirstSelectedOption().getText();
        Assert.assertEquals(expected,actual);
    }
    @Then("show record should have following numbers")
    public void show_record_should_have_following_numbers(List<String> expectedNums) {
        Select select = new Select(page.nums);
        List<WebElement> listofNums = select.getOptions();
        List<String> actualList = new ArrayList<>();
        for (WebElement each: listofNums) {
            actualList.add(each.getText());

        }

        Assert.assertEquals(expectedNums,actualList);


        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.

    }

}
