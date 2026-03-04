package com.simple.tests;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;
import io.qameta.allure.Attachment;

public class testSwivlLogin {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new"); // Vital for Jenkins
        driver = new ChromeDriver(options);
    }

    @Test
    public void testswivllogin() throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
    //------open the website---------
    driver.navigate().to("https://uat.swivl.tech/"); // UAT/stage/dev build
    driver.manage().window().maximize();
    Thread.sleep(2000);
     driver.findElement(By.xpath("/html/body/div/main/section/div/div[2]/div/form/div[1]/div/div[1]/div[1]/input")).sendKeys("uatfeb2026-1@yopmail.com");
     driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Password123!");
     Thread.sleep(2000);
     driver.findElement(By.xpath("/html/body/div/main/section/div/div[2]/div/form/div[2]/button")).click();
    System.out.println("Page title: " );
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
