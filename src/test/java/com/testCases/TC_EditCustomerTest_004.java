package com.testCases;
import com.pageObjects.EditCustomer;
import com.pageObjects.LoginPage;
import com.testData.Customer_Details;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;


public class TC_EditCustomerTest_004 extends BaseClass {
    @Test
    public void EditCustomer() throws InterruptedException, IOException {

            LoginPage loginPage = new LoginPage(driver);
            loginPage.setUserName(username);
            logger.info("user name provided");
            loginPage.setPassword(password);
            logger.info("password provided");
            loginPage.clickSubmit();
            String customerId = Customer_Details.getCustomerId();
            EditCustomer editCustomer=new EditCustomer(driver);
            editCustomer.editcust();
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

