package com.testCases;

import com.pageObjects.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class TC_LoginTest_001 extends BaseClass {

    @Test
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