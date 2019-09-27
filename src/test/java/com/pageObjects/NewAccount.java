package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewAccount {
    WebDriver driver;
     public NewAccount(WebDriver ldriver)
    {
        this.driver=ldriver;
        PageFactory.initElements(ldriver,this);

    }

    @FindBy(name="custid")
    WebElement customerid;

    @FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[3]/td[2]/select")
    WebElement accounttype;

    @FindBy(name="inideposit")
    WebElement initialdeposit;

    @FindBy(name="button2")
    WebElement submit;



    //action method
    public void customerId(String cid)
    {
        customerid.sendKeys(cid);
    }
    public void accountType(String accttype)
    {
        accounttype.sendKeys(accttype);
    }
    public void initialDeposit(String inideposit)
    {
        initialdeposit.sendKeys(String.valueOf(inideposit));
    }
    public void submitDetails()
    {
        submit.click();
    }



}
