package com.learning;

import org.apache.commons.io.FileUtils;
import org.apache.xpath.SourceTree;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class WikiScreenshotsChrome {
    @Test
    public void screenShotMaker() throws IOException {
        String exePath = "C:\\chromedriver_win32\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://en.wikipedia.org/wiki/Main_Page");

        driver.findElement(By.xpath(".//*[@id='mp-dyk']/div[1]/div/a/img")).click();
        File scrFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile1, new File("D:\\screenshots\\" + "First screenshot.png"));

        driver.navigate().back();
        driver.findElement(By.xpath(".//*[@id='mp-itn']/div[1]/div/a/img")).click();
        File scrFile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile2, new File("D:\\screenshots\\" + "Second screenshot.png"));

        driver.quit();
    }
}

