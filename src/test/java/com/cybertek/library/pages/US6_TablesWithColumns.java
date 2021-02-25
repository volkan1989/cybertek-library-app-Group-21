package com.cybertek.library.pages;

import com.cybertek.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US6_TablesWithColumns {

    public US6_TablesWithColumns(){
        PageFactory.initElements(Driver.getDriver(),this);



    }
@FindBy(xpath = "//th[@data-name]")
    public WebElement ColumnsList;
}
