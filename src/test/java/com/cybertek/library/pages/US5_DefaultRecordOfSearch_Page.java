package com.cybertek.library.pages;

import com.cybertek.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US5_DefaultRecordOfSearch_Page {
    public US5_DefaultRecordOfSearch_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "inputEmail")
    public WebElement userInputName;


    @FindBy(id ="inputPassword")
    public WebElement passwordInput;


    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signUpBtn;

    @FindBy(xpath = "//span[.='Users']")
    public WebElement usersBtn;

    @FindBy(xpath = "//select[@name='tbl_users_length']")
    public WebElement nums;


    public void usersBtn(){
        usersBtn.click();
    }
}
