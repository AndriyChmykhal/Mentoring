package com.learning;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WikiLinksCounterIE {
    @Test
    public void testOnIE() {
        String service = "C:\\IEDriverServer_x64_3.4.0\\IEDriverServer.exe";
        System.setProperty("webdriver.ie.driver", service);
        InternetExplorerDriver driver = new InternetExplorerDriver();

        driver.get("https://en.wikipedia.org/wiki/Main_Page");
        java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());
        for (int i = 0; i<links.size(); i++)
        {
            System.out.println(i+ " " + links.get(i).getText()) ;
        }
        driver.quit();
    }
}