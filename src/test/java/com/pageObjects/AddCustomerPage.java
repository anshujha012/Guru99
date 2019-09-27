package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {
    WebDriver driver;
    public AddCustomerPage(WebDriver ldriver)
    {
        this.driver=ldriver;
        PageFactory.initElements(ldriver,this);
    }
    @FindBy(xpath = "/html/body/div[3]/div/ul/li[2]/a")
    WebElement addnewcustomer;
    @FindBy(how = How.NAME, using = "name")
    WebElement customername;
    @FindBy(name="rad1")
    WebElement gender;
    @FindBy(name="dob")
    WebElement dob;
    @FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[7]/td[2]/textarea")
    WebElement address;
    @FindBy(name="city")
    WebElement city;
    @FindBy(name="state")
    WebElement state;
    @FindBy(name="pinno")
    WebElement pin;
    @FindBy(name = "telephoneno")
    WebElement mobnumber;
    @FindBy(name = "emailid")
    WebElement email;
    @FindBy(name = "password")
    WebElement pwd;
    @FindBy(name = "sub")
    WebElement submit;

    //Action methods

    public void clickaddnewcust()
    {
        addnewcustomer.click();
    }
    public void custname(String cname)
    {
        customername.sendKeys(cname);
    }
    public void custgender(String cgender)
    {
       gender.sendKeys(cgender);
    }
    public void custdob(String dd, String mm, String yyyy)
    {
        dob.sendKeys(dd);
        dob.sendKeys(mm);
        dob.sendKeys(yyyy);

    }
    public void custaddress(String caddress)
    {
      address.sendKeys(caddress);
    }
    public void custcity(String ccity)
    {
        city.sendKeys(ccity);

    }
    public void custstate(String cstate)
    {
        state.sendKeys(cstate);
    }
    public String custpin(String cpin)
    {
       pin.sendKeys(String.valueOf(cpin));
        return cpin;
    }
    public void custmobilenumber(String cmobnumber)
    {
        mobnumber.sendKeys(String.valueOf(cmobnumber));
    }
    public void custemailid(String cemailid)
    {
         email.sendKeys(cemailid);
    }
    public void custpwd(String cpwd)
    {
        pwd.sendKeys(cpwd);
    }
    public void custsubmitform()
    {
       submit.click();
    }




}
