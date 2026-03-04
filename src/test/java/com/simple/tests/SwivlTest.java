package com.simple.tests;


import com.simple.base.BaseTest;
import com.simple.pages.LoginPage;
import com.simple.utils.ConfigReader;
import com.simple.pages.DashboardPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SwivlTest extends BaseTest {

   @Test
    public void testLoginWithConfig() {
        LoginPage loginPage = new LoginPage(driver);

        // Fetch credentials from ConfigReader
        loginPage.login(
            ConfigReader.getProperty("uat_username"), 
            ConfigReader.getProperty("uat_password")
        );
        DashboardPage dashboard = new DashboardPage(driver);

        // Logic is now fast and dynamic
        loginPage.login("uatfeb2026-1@yopmail.com", "Password123!");
        
        dashboard.goToSettings();
        
        // Assertions act as the final check
        Assert.assertTrue(driver.getCurrentUrl().contains("settings"), "Navigation to settings failed!");
    }
}