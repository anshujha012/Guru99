package com.Steps.EditCustomer;

import com.pageObjects.LoginPage;
import com.testCases.BaseClass;
import org.testng.Assert;

import java.io.IOException;

import static com.testCases.BaseClass.driver;

public class Login extends BaseClass {
    public void loginTest() throws IOException, InterruptedException {

        logger.info("URL is opened");

        LoginPage lp=new LoginPage(driver);
        lp.setUserName(username);
        logger.info("Entered username");

        lp.setPassword(password);
        logger.info("Entered password");

        lp.clickSubmit();
        Thread.sleep(3000);

        if(driver.getTitle().equals("Guru99 Bank Manager HomePage123"))
        {
            Assert.assertTrue(true);
            logger.info("Login test passed");
        }
        else
        {
            captureScreen(driver,"loginTest");
            Assert.assertTrue(false);
            logger.info("Login test failed");
        }

    }
}
