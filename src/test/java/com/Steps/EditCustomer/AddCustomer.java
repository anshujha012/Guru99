package com.Steps.EditCustomer;

import com.pageObjects.AddCustomerPage;
import com.pageObjects.CustomerDetailsPage;
import com.pageObjects.LoginPage;
import com.testCases.BaseClass;
import com.testData.Customer_Details;
import org.testng.Assert;

import java.io.IOException;

public class AddCustomer extends BaseClass {
    public void addNewCustomer() throws InterruptedException, IOException {
        LoginPage loginPage = new LoginPage(driver);
        CustomerDetailsPage customerDetailsPage = new CustomerDetailsPage(driver);
        Customer_Details testData =new Customer_Details();
        loginPage.setUserName(username);
        logger.info("user name provided");
        loginPage.setPassword(password);
        logger.info("password provided");
        loginPage.clickSubmit();
        Thread.sleep(3000);

        AddCustomerPage addcust = new AddCustomerPage(driver);
        addcust.clickaddnewcust();

        logger.info("providing customers details.....");
        Thread.sleep(3000);

        addcust.custname("Anshu");
        addcust.custgender("f");
        addcust.custdob("29", "08", "1990");
        Thread.sleep(5000);
        addcust.custaddress("apt no116 minnepolise");
        addcust.custcity("MN");
        addcust.custstate("Minnesota");
        addcust.custpin("554048");
        addcust.custmobilenumber("22438889");
        String email = randomstring() + "@gmail.com";
        addcust.custemailid(email);
        // Thread.sleep(3000);
        addcust.custpwd("anshu123");
        Thread.sleep(3000);
        addcust.custsubmitform();
        Thread.sleep(3000);


        boolean result = driver.getPageSource().contains("Customer Registered Successfully!!!");
        if (result == true) {
            Assert.assertTrue(true);
        } else {
            captureScreen(driver, "addNewCustomer");
            Assert.assertTrue(false);
        }
        logger.info("TC's passed");

        String customerId = customerDetailsPage.getCustomerId();
        System.out.println(customerId);
        testData.setCustomerId(customerId);



    }


}
