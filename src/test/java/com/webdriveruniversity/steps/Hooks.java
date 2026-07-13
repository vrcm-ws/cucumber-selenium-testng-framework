package com.webdriveruniversity.steps;

import com.webdriveruniversity.context.TestContext;
import com.webdriveruniversity.driver.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks {

    @Before
    public void setup() {

        DriverFactory.getDriver();
    }

    @After
    public void tearDown() {

        DriverFactory.cleanupDriver();
    }


}
