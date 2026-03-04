package com.simple.pages;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.internal.thread.ThreadUtil;

public class rough {
public static void main(String[] args) {
    ChromeDriver driver = new ChromeDriver();
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
    
}
}
