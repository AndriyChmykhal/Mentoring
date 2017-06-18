package com.learning;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;

import static org.apache.commons.io.FileUtils.copyFile;

public class WikiScreenshots {
    public void setUp() throws IOException {
        String exePath = "C:\\chromedriver_win32\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://en.wikipedia.org/wiki/Main_Page");
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        copyFile(scrFile, new File("C:\\screenshots"+System.currentTimeMillis()+".png"));

        driver.findElement(By.xpath("#mp-dyk > @div.dyk-img > div >a >img")).getScreenshotAs(OutputType.FILE);



        driver.findElement(By.xpath("//*[@id='mp-dyk']/div[1]/div/a/img")).click();
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        copyFile(scrFile, new File("C:\\screenshots"+System.currentTimeMillis()+".png"));

        driver.findElement(By.id("loginbutton")).submit();
        driver.findElement(By.id("blueBarDOMInspector")).isDisplayed();
        driver.quit();
    }

