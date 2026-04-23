package com.webdriveruniversity.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions( features = { "classpath:features" },
                  glue = { "com.webdriveruniversity.steps" },
                  plugin = { "pretty",
                             "html:target/cucumber-reports/test_runner_cucumber.html",
                             "json:target/cucumber-reports/test_runner_cucumber.json" },
                  tags = "@MultiData",
                  monochrome = false,
                  dryRun = false )

public class TestRunner extends AbstractTestNGCucumberTests {

}
