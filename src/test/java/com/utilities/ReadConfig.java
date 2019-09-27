package com.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
    Properties pro;
    public ReadConfig() {
        File src = new File(".\\src\\main\\java\\resources\\config.properties");
        try {
            FileInputStream fis = new FileInputStream(src);
            pro = new Properties();
            pro.load(fis);
        } catch (IOException e) {
            // e.printStackTrace();
            System.out.println("Exception is" + e.getMessage());
        }
    }
    public String getApplicationURL()
    {
        String url=pro.getProperty("baseURL");
        return url;
    }
    public String getUsername()
    {
        String un=pro.getProperty("username");
        return un;
    }
    public String getPassword()
    {
        String pwd=pro.getProperty("password");
        return pwd;
    }
    public String getCromePath()
    {
        String cp=pro.getProperty("chromepath");
        return cp;
    }
    public String getFirefoxPath()
    {
        String fp=pro.getProperty("firefoxpath");
        return fp;
    }
}
