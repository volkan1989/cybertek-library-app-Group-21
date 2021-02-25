package com.cybertek.library.step_definitions;

import com.cybertek.library.pages.US8_borrowing_books;
import com.cybertek.library.utilities.BrowserUtils;
import com.cybertek.library.utilities.ConfigurationReader;
import com.cybertek.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.xpath.operations.String;
import org.junit.Assert;

import java.util.List;


public class US8_borrowing_books_StepDefinitions {


        US8_borrowing_books page= new US8_borrowing_books();


    @Given("the student the homepage")
    public void the_student_the_homepage() {

       // String url= ConfigurationReader.getProperty("url");
        Driver.getDriver().get("http://library2.cybertekschool.com/login.html");
    }

    @When("the the student logs in")
    public void the_the_student_logs_in() {
     page.usernameInput.sendKeys(ConfigurationReader.getProperty("student54"));
     page.passwordInput.sendKeys(ConfigurationReader.getProperty("pass54"));
     page.singInButton.click();
    }
    @Then("the student click Borrowing Books module")
    public void the_student_click_borrowing_books_module() {

        page.borrowbutton.click();
    }

    @Then("the student should see the following collum name:")
    public void the_student_should_see_the_following_collum_name(List<String>expextedColums) {

        BrowserUtils.wait(2);
        List<java.lang.String> colums = BrowserUtils.getElementsText(page.colums);
        Assert.assertEquals(expextedColums,colums);


        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.


    }







    // String url= ConfigurationReader.getProperty("url");
       // Driver.getDriver().get(url);
    }


// @Given("the user the homepage")
// public void theUserTheHomepage() {

    //@When("the user click Borrowing Books module")
    //public void theUserClickBorrowingBooksModule() {
        


   // @Then("the user should see the following collum name:")
   // public void theUserShouldSeeTheFollowingCollumName(List<String> expectedColumn){

       // System.out.println("expectedCplumn="+expectedColumn);
       // System.out.println("expectedColumn.size()="+expectedColumn.size());
        //List<String>actualColumn =


