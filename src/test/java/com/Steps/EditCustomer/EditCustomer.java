package com.Steps.EditCustomer;

import com.pageObjects.LoginPage;
import com.testCases.BaseClass;
import com.testData.Customer_Details;
import org.testng.Assert;

import java.io.IOException;

public class EditCustomer extends BaseClass{
    public void EditCustomer() throws InterruptedException, IOException {
        //steps
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setUserName(username);
        logger.info("user name provided");
        loginPage.setPassword(password);
        logger.info("password provided");
        loginPage.clickSubmit();
        //AddCustomerPage addCustomerPage=new AddCustomerPage(driver);
        //Thread.sleep(3000);
        //    Customer_Details testData=new Customer_Details();

        String customerId = Customer_Details.getCustomerId();
        com.pageObjects.EditCustomer editCustomer=new com.pageObjects.EditCustomer(driver);
        editCustomer.editcust();
        //deetinh the customerid by calling getter and setter method


        editCustomer.entercustid(customerId);
        editCustomer.submitcust();
        Thread.sleep(3000);
        logger.info("edit customer page will open");
        boolean pagename=driver.getPageSource().contains("Edit Customer");
        if (pagename==true)
        {
            Assert.assertTrue(true);
        }
        else
        {
            captureScreen(driver,"editcustomer");
            Assert.assertTrue(false);

        }

        logger.info("TC's passed");
        // Edit some customer information
        Thread.sleep(5000);
        //AddCustomerPage addCustomerPage=new AddCustomerPage(driver);
        String updatedpin=editCustomer.custpin("555000");
        editCustomer.custsubmitform();
        logger.info("information updated");
        logger.info(updatedpin);


    }

}
