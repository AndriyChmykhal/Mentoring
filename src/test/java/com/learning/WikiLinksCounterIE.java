package com.learning;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class WikiLinksCounterIE{
    private static WebDriver driver;

    @BeforeClass
    public static void createDriver() {
        String service = "C:\\IEDriverServer_x64_3.4.0\\IEDriverServer.exe";
        System.setProperty("webdriver.ie.driver", service);
        driver = new InternetExplorerDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void testOnIE() {
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