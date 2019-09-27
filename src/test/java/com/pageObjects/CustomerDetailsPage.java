package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CustomerDetailsPage {
    WebDriver driver;
    public CustomerDetailsPage(WebDriver ldriver)
    {
        this.driver=ldriver;
        PageFactory.initElements(ldriver,this);
    }
    @FindBy(xpath = "/html[1]/body[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[4]/td[2]")
    WebElement customerId;

    //Action methods

    public String getCustomerId()
    {
        return customerId.getText();
    }





}
