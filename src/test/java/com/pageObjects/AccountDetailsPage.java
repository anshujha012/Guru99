package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountDetailsPage {
    WebDriver driver;
    public AccountDetailsPage(WebDriver ldriver)
    {
        this.driver=ldriver;
        PageFactory.initElements(ldriver,this);
    }
    @FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]\n")
    WebElement captureaccountid;

    public String getcaptureAccountID()
    {
      return captureaccountid.getText();
    }

}
