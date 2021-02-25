package com.cybertek.library.pages;

import com.cybertek.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US8_borrowing_books {
    public US8_borrowing_books(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id="inputEmail")
    public WebElement usernameInput;

    @FindBy(id="inputPassword")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[.='Sign in']")
    public WebElement singInButton;

    @FindBy(xpath = "//span[.='Borrowing Books']")
    public WebElement borrowbutton;

   @FindBy(xpath = "//tr")
    public List<WebElement> colums;

}
