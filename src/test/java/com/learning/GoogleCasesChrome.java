package com.learning;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class GoogleCasesChrome {
    @Test
    public void googleTest() throws IOException {
        String exePath = "C:\\chromedriver_win32\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.google.com");
        driver.findElement(By.cssSelector("#gs_htif0")).sendKeys("selenium automation testing");

    }
}
