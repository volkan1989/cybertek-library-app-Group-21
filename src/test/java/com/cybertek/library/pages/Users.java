package com.cybertek.library.pages;

import com.cybertek.library.utilities.ConfigurationReader;
import com.cybertek.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Users {

    public Users(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(id = "inputEmail")
    public WebElement userInputName;


    @FindBy(id ="inputPassword")
    public WebElement passwordInput;


    @FindBy(xpath = "//button")
    public WebElement signUpBtn;

    @FindBy (xpath = "//div[@class='collapse navbar-collapse']")
    public List<WebElement> modules;

    public void loginPaged(){
        userInputName.sendKeys(ConfigurationReader.getProperty("student54"));
        passwordInput.sendKeys(ConfigurationReader.getProperty("pass54"));
        signUpBtn.click();
    }


}
