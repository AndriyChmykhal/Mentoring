package com.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookSignIn {
    public static void main(String[] args){
        String exePath = "C:\\chromedriver_win32\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);
        WebDriver driver = new ChromeDriver();

        //Firefox
        //System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.17.0-win64\\geckodriver.exe");
        //WebDriver driver = new FirefoxDriver();
        driver.navigate().to("https://facebook.com");
        driver.findElement(By.id("email")).sendKeys("chmykhal@ukr.net");
        driver.findElement(By.id("pass")).sendKeys("o525O525");


        driver.close();
    }

}
