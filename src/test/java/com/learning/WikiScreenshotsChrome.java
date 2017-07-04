package com.learning;

import org.apache.commons.io.FileUtils;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class WikiScreenshotsChrome {
    static WebDriver driver;

    @BeforeClass
    public static void createDriver(){
        String exePath = "C:\\chromedriver_win32\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterClass
    public static void quitDriver() {
        driver.quit();
    }

    @Test
    public void screenShotMaker() throws IOException {
        driver.manage().window().maximize();
        driver.get("https://en.wikipedia.org/wiki/Main_Page");
        driver.findElement(By.xpath(".//*[@id='mp-dyk']/div[1]/div/a/img")).click();
        File scrFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile1, new File("D:\\screenshots\\" + "First screenshot.png"));
        driver.navigate().back();
        driver.findElement(By.xpath(".//*[@id='mp-itn']/div[1]/div/a/img")).click();
        File scrFile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile2, new File("D:\\screenshots\\" + "Second screenshot.png"));
    }
}

