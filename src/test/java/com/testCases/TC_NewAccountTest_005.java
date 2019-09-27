package com.testCases;

import com.pageObjects.AccountDetailsPage;
import com.pageObjects.NewAccount;
import com.testData.Customer_Account_Details;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_NewAccountTest_005 extends BaseClass{
    @Test
    public void addNewAccount()
    {
        NewAccount newAccount=new NewAccount(driver);
        AccountDetailsPage accountDetailsPage=new AccountDetailsPage(driver);
        Customer_Account_Details customerAccountDetails =new Customer_Account_Details();
        newAccount.customerId("");
        newAccount.accountType("Current");
        newAccount.initialDeposit("5000");
        newAccount.submitDetails();
        boolean pagetitle= driver.getPageSource().contains("Account Generated Successfully!!!");
        if(pagetitle==true)
        {
            Assert.assertTrue(true);
        }
        else
        {
            Assert.assertTrue(false);
        }

        String acctid= accountDetailsPage.getcaptureAccountID();
        logger.info(acctid);
        customerAccountDetails.setAccountid(acctid);


    }
}
