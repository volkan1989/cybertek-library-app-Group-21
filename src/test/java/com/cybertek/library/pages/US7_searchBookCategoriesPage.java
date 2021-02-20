package com.cybertek.library.pages;

import com.cybertek.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US7_searchBookCategoriesPage {

    public US7_searchBookCategoriesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(id = "inputEmail")
    public WebElement inputEmail;

    @FindBy(id = "inputPassword")
    public WebElement inputPassword;

    @FindBy(xpath = "//button[@type='submit']" )
    public WebElement signInButton;

    @FindBy(xpath = "//h3" )
    public WebElement title;

    @FindBy(id = "book_categories")
    public WebElement bookCategories;

}
