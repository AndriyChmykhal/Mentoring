package com.learning;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class WikiLinksCounterSafari {
    private static WebDriver driver;

    @BeforeClass
    public static void createDriver(){
        driver = new SafariDriver();
    }

    //Test is failed on PC due to inconsistency of required browser's version and driver's version
    //MacOS is needed for running test on Safari browser
    @Test
    public void testOnSafari() {
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