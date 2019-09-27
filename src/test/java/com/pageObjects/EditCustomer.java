package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditCustomer {
    WebDriver driver;

    public EditCustomer(WebDriver ldriver)
    {
        this.driver=ldriver;
        PageFactory.initElements(ldriver,this);

    }
    @FindBy(xpath="//a[contains(text(),'Edit Customer')]")
    WebElement clickoneditcustomer;
    @FindBy(name="cusid")
    WebElement customerid;
    @FindBy(name="AccSubmit")
    WebElement submit;
    @FindBy(name="pinno")
    WebElement pin;
    @FindBy(name = "sub")
    WebElement finalsubmit;

    public void editcust()
    {
      clickoneditcustomer.click();
    }
    public void entercustid(String custid)
    {

        customerid.sendKeys(String.valueOf(custid));
    }
    public void submitcust()
    {
        submit.click();
    }
    public String custpin(String cpin)
    {
        pin.clear();
        pin.sendKeys(String.valueOf(cpin));
        return cpin;
    }
    public void custsubmitform()
    {
        finalsubmit.click();
    }

}
