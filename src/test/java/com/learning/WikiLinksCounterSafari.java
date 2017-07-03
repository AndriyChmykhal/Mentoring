package com.learning;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WikiLinksCounterSafari {
    private WebDriver driver = null;

    @Before
    public void createDriver(){
        driver = new SafariDriver();
    }

    @After
    public void quitDriver(){
        driver.quit();
    }

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
}