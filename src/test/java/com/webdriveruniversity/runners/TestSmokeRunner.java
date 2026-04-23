package com.webdriveruniversity.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions( features = "src/test/resources/features",
                  glue = { "com.webdriveruniversity.steps" },
                  plugin = { "pretty",
                             "html:target/cucumber-reports/test_smoke_runner_cucumber.html",
                             "json:target/cucumber-reports/test_smoke_runner_cucumber.json" },
                  tags = "@SingleData",
                  monochrome = true,
                  dryRun = false )

public class TestSmokeRunner extends AbstractTestNGCucumberTests {

}
