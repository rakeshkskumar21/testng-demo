package com.simple.tests;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;
import com.simple.pages.LoginPage;
import io.qameta.allure.Attachment;
public class SearchTest {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new"); // Vital for Jenkins
        driver = new ChromeDriver(options);
    }

    @Test
    public void testswivllogin() {
        driver.navigate().to("https://uat.swivl.tech/");
        //------open the website---------
    driver.navigate().to("https://uat.swivl.tech/"); // UAT/stage/dev build
    driver.manage().window().maximize();
    //Thread.sleep(2000);
     WebElement username = driver.findElement(By.xpath("//*[@id=\"username-label\"]"));
     username.sendKeys("uatfeb2026-1@yopmail.com");
     WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
     password.sendKeys("Password123!");
     //Thread.sleep(1000);
     driver.findElement(By.xpath("/html/body/div/main/section/div/div[2]/div/form/div[2]/button")).click();
        System.out.println("Page title: " + driver.getTitle());
    }

    @Attachment(value = "Page screenshot", type = "image/png")
    public byte[] saveScreenshot(WebDriver driver) {
    return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }

    @AfterMethod
    public void teardown() 
    { 
        driver.quit(); 
    }
}
