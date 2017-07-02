package com.learning;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class FbTestChrome {
    @Test
    public void testChrome(){
        String exePath = "C:\\chromedriver_win32\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);
        WebDriver driver = new ChromeDriver();

        //Firefox
        //System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.17.0-win64\\geckodriver.exe");
        //WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.navigate().to("https://facebook.com");
        driver.findElement(By.id("email")).sendKeys("a.chmykhal@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("Qwerty123!");
        driver.findElement(By.id("loginbutton")).submit();
        driver.findElement(By.id("blueBarDOMInspector")).isDisplayed();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.switchTo().alert().dismiss();
        driver.findElement(By.id("userNavigationLabel")).click();
        driver.findElement(By.xpath("//ul[@class='_54nf']/li[last()]")).click();
        driver.quit();
    }

}
