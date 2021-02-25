package com.cybertek.library.pages;

import com.cybertek.library.utilities.ConfigurationReader;
import com.cybertek.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.security.auth.login.Configuration;

public class US10_StatusFeature_Page {

    public US10_StatusFeature_Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id = "inputEmail")
    public WebElement inputUsername;

    @FindBy(id = "inputPassword" )
    public WebElement inputPassword;

    @FindBy(xpath ="//button")
    public WebElement singIn;

    @FindBy(id = "user_status")
    public WebElement status;
    @FindBy(xpath = "//span[.='Users']")
    public WebElement module;

    public void loginToLibrary() {
        inputUsername.sendKeys("librarian43@library");
        inputPassword.sendKeys("np6AxVIh");
        singIn.click();

//        public void loginToLibrary (String username, String password)WebElement loginButton;
//        {
//            inputUsername.sendKeys(username);
//            inputPassword.sendKeys(password);
//            loginButton.click();
//
//        }
//        public void loginToLibrary_Configuration() {
//            inputUsername.sendKeys(ConfigurationReader.getProperty("librarian43"));
//        inputPassword.sendKeys(ConfigurationReader.getProperty("pass43"));
//        loginButton.click();
//        }
//    }}
    }}
