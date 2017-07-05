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
    private final String BASE_URL = "https://www.google.com";
    private final String QUERY_1 = "selenium automation testing";
    private final String ASSERT_1 = "seleniumhq.org";
    private final String QUERY_2 = "selenium";
    private final String ASSERT_2 = "4programmers";
    private final String QUERY_3 = "selenium";
    private final String ASSERT_3 = "John Snow";

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
        driver.get(BASE_URL);
        driver.findElement(By.id("lst-ib")).sendKeys(QUERY_1);
        driver.findElement(By.name("btnG")).click();
        List<WebElement> list = driver.findElements(By.xpath("//*[contains(text(),'" + ASSERT_1 + "')]"));
        Assert.assertTrue("Text not found!", list.size() > 0);
    }

    @Test
    public void eleventhPageTest() throws IOException {
        driver.get(BASE_URL);
        driver.findElement(By.id("lst-ib")).sendKeys(QUERY_2);
        driver.findElement(By.name("btnG")).click();
        driver.findElement(By.xpath(".//*[@id='nav']/tbody/tr/td[11]/a")).click();
        driver.findElement(By.xpath(".//*[@id='nav']/tbody/tr/td[8]/a[@aria-label='Page 11']")).click();
        List<WebElement> list = driver.findElements(By.xpath("//*[contains(text(),'" + ASSERT_2 + "')]"));
        Assert.assertTrue("Text not found!", list.size() > 0);
    }

    @Test
    public void thirdGoogleTest() throws IOException {
        driver.manage().window().maximize();
        driver.get(BASE_URL);
        driver.findElement(By.id("lst-ib")).sendKeys(QUERY_3);
        driver.findElement(By.name("btnG")).click();
        List<WebElement> list = driver.findElements(By.xpath("//*[contains(text(),'" + ASSERT_3 + "')]"));
        Assert.assertFalse("Text found!", list.size() > 0);
    }

    @AfterClass
    public static void quitDriver() {
        driver.quit();
    }
}
