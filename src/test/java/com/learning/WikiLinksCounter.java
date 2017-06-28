package com.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class WikiLinksCounter {
    public static void main(String[] args) {
        String exePath = "C:\\chromedriver_win32\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);
        WebDriver driver = new ChromeDriver();

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