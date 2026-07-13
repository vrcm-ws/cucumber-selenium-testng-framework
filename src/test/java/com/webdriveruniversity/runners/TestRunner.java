package com.webdriveruniversity.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions( features = { "classpath:features" },
                  glue = { "com.webdriveruniversity.steps" },
                  plugin = { "pretty",
                             "html:target/cucumber-reports/test_runner_cucumber.html",
                             "json:target/cucumber-reports/test_runner_cucumber.json" },
                  tags = "",
                  monochrome = false,
                  dryRun = false )

public class TestRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
