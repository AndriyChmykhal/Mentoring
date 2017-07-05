package com.learning;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;



public class GoogleCasesChrome {
    private static WebDriver driver;
    private static String baseURL = "https://www.google.com";
    private static String query1 = "selenium automation testing";
    private static String assert1 = "seleniumhq.org";
    private static String query2 = "selenium";
    private static String assert2 = "ibm.com";
    private static String query3 = "selenium";
    private static String assert3 = "Games of Thrones";

    @BeforeClass
    public static void createDriver() {
        String exePath = "C:\\chromedriver_win32\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void firstGoogleTest() throws IOException {
        driver.manage().window().maximize();
        driver.get(baseURL);
        driver.findElement(By.id("lst-ib")).sendKeys(query1);
        driver.findElement(By.name("btnG")).click();
        List<WebElement> list = driver.findElements(By.xpath("//*[contains(text(),'" + assert1 + "')]"));
        Assert.assertTrue("Text not found!", list.size() > 0);
    }

    @Test
    public void eleventhPageTest() throws IOException {
        driver.get(baseURL);
        driver.findElement(By.id("lst-ib")).sendKeys(query2);
        driver.findElement(By.name("btnG")).click();
        driver.findElement(By.xpath(".//*[@id='nav']/tbody/tr/td[11]/a")).click();
        driver.findElement(By.xpath(".//*[@id='nav']/tbody/tr/td[8]/a[@aria-label='Page 11']")).click();
        List<WebElement> list = driver.findElements(By.xpath("//*[contains(text(),'" + assert2 + "')]"));
        Assert.assertTrue("Text not found!", list.size() > 0);
    }
    @Test
    public void thirdGoogleTest() throws IOException {
        driver.manage().window().maximize();
        driver.get(baseURL);
        driver.findElement(By.id("lst-ib")).sendKeys(query3);
        driver.findElement(By.name("btnG")).click();
        List<WebElement> list = driver.findElements(By.xpath("//*[contains(text(),'" + assert3 + "')]"));
        Assert.assertFalse("Text found!", list.size() > 0);

    }

    @AfterClass
    public static void quitDriver() {
        driver.quit();
    }
}
