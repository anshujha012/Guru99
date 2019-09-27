package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditAccount {
    WebDriver driver;
    public EditAccount(WebDriver ldriver)
    {
        this.driver=ldriver;
        PageFactory.initElements(ldriver,this);
    }
    @FindBy(xpath = "/html/body/div[3]/div/ul/li[6]/a")
    WebElement clickoneditaccount;

    @FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[6]/td[2]/input")
    WebElement accountnumber;

    @FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[11]/td[2]/input[1]")
    WebElement submit;

    public void clickonEditCust()
    {

    }

}
