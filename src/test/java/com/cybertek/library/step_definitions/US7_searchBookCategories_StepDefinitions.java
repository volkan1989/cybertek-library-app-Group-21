package com.cybertek.library.step_definitions;

import com.cybertek.library.pages.US7_searchBookCategoriesPage;
import com.cybertek.library.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class US7_searchBookCategories_StepDefinitions {
    US7_searchBookCategoriesPage us7_searchBookCategoriesPage = new US7_searchBookCategoriesPage();

    @When("User logs in")
    public void user_logs_in() {

        us7_searchBookCategoriesPage.inputEmail.sendKeys("student63@library");
        us7_searchBookCategoriesPage.inputPassword.sendKeys("Jg2orVoF");
        us7_searchBookCategoriesPage.signInButton.click();
    }

    @Given("User is on the Book Management page")
    public void user_is_on_the_book_management_page() {

        String expected = "Book Management";
        String actual = us7_searchBookCategoriesPage.title.getText();

        BrowserUtils.wait(3);

        Assert.assertTrue("Actual Text is not as Expected",expected.equals(actual));

    }

    @Then("User should be able to see given categories under Book Categories")
    public void user_should_be_able_to_see_given_categories_under_book_categories(List<String> expectedCategories) {

        System.out.println("expectedCategories = " + expectedCategories);

        Select categories = new Select(us7_searchBookCategoriesPage.bookCategories);

        List<WebElement> categoriesAsWebElement = categories.getOptions();

        List<String> actualCategories = BrowserUtils.getElementsText(categoriesAsWebElement);

        System.out.println("actualCategories = " + actualCategories);

        Assert.assertEquals(expectedCategories,actualCategories);
    }

    @Then("User can select each category under Book Categories")
    public void user_can_select_each_category_under_book_categories(List<String> bookCategories) {

        Select selectCategories = new Select(us7_searchBookCategoriesPage.bookCategories);



        //Select all the options from select dropdown
        List<WebElement> allOptions = selectCategories.getOptions();

        //Loop through the List and click to each option
        for (WebElement eachCategory : allOptions) {

            BrowserUtils.wait(2);
            eachCategory.click();

            // Print out all selected values.
            System.out.println("Selected: " + eachCategory.getText());

            //Verifying each option is selected:
            Assert.assertTrue(eachCategory.isSelected());
        }



    }
}
