package com.testCases;

import com.pageObjects.DeleteCustomer;
import com.pageObjects.LoginPage;
import com.testData.Customer_Details;
import org.testng.annotations.Test;

public class TC_Deletecustomer_006 extends BaseClass{
    @Test
    public void Deletecustomer() throws InterruptedException {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.setUserName(username);
        logger.info("user name provided");
        loginPage.setPassword(password);
        logger.info("password provided");
        loginPage.clickSubmit();
        Thread.sleep(3000);

//implementation for delete customer
    DeleteCustomer deleteCustomer=new DeleteCustomer(driver);
    Customer_Details customer_details=new Customer_Details();
    deleteCustomer.ClickonDeleteCust();
    String custid= customer_details.getCustomerId();
    deleteCustomer.enterCustID(custid);
    deleteCustomer.ClickonSubmit();
    logger.info("customer deleted");



    }
}
