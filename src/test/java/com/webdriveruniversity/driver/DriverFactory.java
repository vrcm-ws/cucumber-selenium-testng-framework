package com.webdriveruniversity.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

    public static  WebDriver createDriver() {

        return createDriver("chrome");
    }

    public static WebDriver createDriver(String browser) {

        WebDriver driver;

        switch(browser.toLowerCase()) {

            case "firefox" -> driver = new FirefoxDriver();
            case "edge" -> driver = new EdgeDriver();
            default -> driver = new ChromeDriver();
        }

        return driver;
    }
}
