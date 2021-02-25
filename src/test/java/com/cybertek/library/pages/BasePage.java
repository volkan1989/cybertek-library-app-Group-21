package com.cybertek.library.pages;

import com.cybertek.library.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    protected WebDriver driver = Driver.getDriver();

    public BasePage(){
        PageFactory.initElements(driver, this);
    }



}
