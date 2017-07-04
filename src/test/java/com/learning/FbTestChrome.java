package com.learning;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class FbTestChrome {
    private static WebDriver driver;

    @BeforeClass
    public static void createDriver(){
        String exePath = "C:\\chromedriver_win32\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterClass
    public static void quitDriver(){
        driver.quit();
    }
    @Test
    public void testChrome(){
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("https://facebook.com");
        driver.findElement(By.id("email")).sendKeys("a.chmykhal@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("Qwerty123!");
        driver.findElement(By.id("loginbutton")).submit();
        driver.findElement(By.id("blueBarDOMInspector")).isDisplayed();
        driver.findElement(By.xpath("//div[@class='_3ixn']")).click();
        driver.findElement(By.id("userNavigationLabel")).click();
        driver.findElement(By.xpath("//ul[@class='_54nf']/li[last()]")).click();
        driver.quit();
    }
}
