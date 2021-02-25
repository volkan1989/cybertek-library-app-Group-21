package com.cybertek.library.pages;

import com.cybertek.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US4_LocatorsBase {

    public US4_LocatorsBase(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id=\"menu_item\"]/li[2]/a/span[1]")
    public WebElement usersBtn;

    @FindBy(xpath = "//*[@id=\"users\"]/div[1]/div[1]/span/a")
    public WebElement addUserBtn;

    @FindBy(xpath = "//*[@id=\"add_user_modal\"]/div/button/span")
    public WebElement xBtn;


    @FindBy(xpath = "//*[@id=\"tbl_users\"]/tbody/tr[1]/td[1]/a")
    public WebElement editBtn;

    @FindBy(xpath = "//*[@id=\"edit_user_modal\"]/div/h5")
    public WebElement editUserInformation;


    @FindBy(xpath = "//*[@id=\"edit_user_form\"]/div[1]/div/div[1]/div/div/input")
    public WebElement EditFullName;

    @FindBy(xpath = "//*[@id=\"edit_user_form\"]/div[1]/div/div[2]/div[1]/div/input")
    public WebElement EditPassword;

    @FindBy(xpath = "//*[@id=\"edit_user_form\"]/div[1]/div/div[2]/div[2]/div/input")
    public WebElement EditEmail;

    @FindBy(id = "user_group_id")
    public WebElement userGroupDropDown;

    @FindBy(xpath = "/html/body/main/section[2]/div[2]/div/div/div/div/form/div[1]/div/div[3]/div[1]/div/select/option[1]")
    public WebElement userGroupOption;

    @FindBy(xpath = "//*[@id=\"user_group_id\"]/option[2]")
    public WebElement librarianOption;

    @FindBy(id = "status")
    public WebElement status;

    @FindBy(xpath = "//*[@id=\"start_date\"]/input")
    public WebElement startDate;

    @FindBy(id = "address")
    public WebElement address;

    @FindBy(xpath = "/html/body/main/section[2]/div[2]/div/div/div/div/form/div[2]/button[2]")
    public WebElement saveChanges;




}
