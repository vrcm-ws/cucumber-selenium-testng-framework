package com.webdriveruniversity.steps;

import com.webdriveruniversity.context.TestContext;
import com.webdriveruniversity.driver.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hooks {

    private TestContext testContext;

    public Hooks(TestContext testContex) {
        this.testContext = testContex;
    }


    @Before
    public void setup() {

        testContext.setDriver(DriverFactory.createDriver("firefox"));
    }


    @After
    public void tearDown() {

        if (testContext.getDriver() != null) {
            testContext.getDriver().quit();
        }
    }
}
