package com.webdriveruniversity.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DriverFactory {

    private static ThreadLocal<WebDriver> webDriver = new ThreadLocal<>();


    private static WebDriver createDriver() {

        WebDriver driver;

        switch(getBrowser()) {

            case "firefox" -> driver = new FirefoxDriver();
            case "chrome" -> driver = new ChromeDriver();
            default -> driver = new EdgeDriver();
        }

        webDriver.set(driver);

        return getDriver();
    }


    private static String getBrowser() {

        String browser = null;

        try
        {
            Properties properties = new Properties();
            FileInputStream file = new FileInputStream("src/test/java/com/webdriveruniversity/properties/config.properties");
            properties.load(file);

            browser = properties.getProperty("browser").toLowerCase().trim();
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }

        return browser;
    }

    public static WebDriver getDriver() {
        if (webDriver.get() == null) {
            webDriver.set(createDriver());
        }

        return webDriver.get();
    }


    public static void cleanupDriver() {

        if (getDriver() != null) {
            getDriver().quit();
            webDriver.remove();
        }
    }
}
