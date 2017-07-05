package com.learning;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;

public class WikiLinksCounter {
    private static WebDriver driver;

    @BeforeClass
    public static void createDriver(){
        String exePath = "C:\\chromedriver_win32\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Test
    public void testChrome() {
        driver.get("https://en.wikipedia.org/wiki/Main_Page");
        java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());
        for (int i = 0; i<links.size(); i++)
        {
            System.out.println(i+ " " + links.get(i).getText()) ;
        }
    }

    @AfterClass
    public static void quitDriver(){
        driver.quit();
    }
}