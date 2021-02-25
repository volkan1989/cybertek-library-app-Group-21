package com.cybertek.library.pages;

import com.cybertek.library.utilities.ConfigurationReader;
import com.cybertek.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {


    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "inputEmail")
    public WebElement usernameInputBox;

    @FindBy(id = "inputPassword")
    public WebElement passwordInputBox;

    @FindBy(xpath = "//button[@class='btn btn-lg btn-primary btn-block']")
    public WebElement signInButton;

    @FindBy (xpath = "//*[@id='menu_item']/li[1]")
    public WebElement ExpectedDashboard;

    public void loginToLibrary(String eachUser) {
        String username = "";
        String password = "";

        switch (eachUser) {
            case "student54":
                username = ConfigurationReader.getProperty("student54");
                password = ConfigurationReader.getProperty("pass54");
                System.out.println("LOGGED IN AS A " + eachUser);
                break;
            case "student55":
                username = ConfigurationReader.getProperty("student55");
                password = ConfigurationReader.getProperty("pass55");
                System.out.println("LOGGED IN AS A " + eachUser);
                break;
            case "student56":
                username = ConfigurationReader.getProperty("student56");
                password = ConfigurationReader.getProperty("pass56");
                System.out.println("LOGGED IN AS A " + eachUser);
                break;
            case "librarian43":
                username = ConfigurationReader.getProperty("librarian43");
                password = ConfigurationReader.getProperty("pass43");
                System.out.println("LOGGED IN AS A " + eachUser);
                break;
            default:
                System.err.println("INVALID USER");
        }

        usernameInputBox.sendKeys(username);
        passwordInputBox.sendKeys(password);
        signInButton.click();

    }

}
