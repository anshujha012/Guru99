package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteCustomer {
    WebDriver driver;

    public DeleteCustomer(WebDriver ldriver)
    {
        this.driver=ldriver;
        PageFactory.initElements(driver,this);
    }


    @FindBy(xpath="/html/body/div[3]/div/ul/li[4]/a")
    WebElement cliconDeletcustomer;

    @FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[2]/td[2]/input")
    WebElement entercustomerid;


    @FindBy(xpath=" /html/body/table/tbody/tr/td/table/tbody/tr[7]/td/input[1]")
    WebElement submit;

    public void ClickonDeleteCust()
    {
        cliconDeletcustomer.click();
    }

    public void enterCustID(String custid)
    {
        entercustomerid.sendKeys(String.valueOf(custid));
    }
    public void ClickonSubmit()
    {
        submit.click();
    }



}
