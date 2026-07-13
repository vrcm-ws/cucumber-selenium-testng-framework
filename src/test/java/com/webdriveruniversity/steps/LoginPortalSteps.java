package com.webdriveruniversity.steps;

import com.webdriveruniversity.context.TestContext;
import com.webdriveruniversity.driver.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class LoginPortalSteps {

    private TestContext testContext;
    private WebDriver driver;
    private WebDriverWait wait;

    private final By inputUsernameLocator = By.xpath("//input[@placeholder='Username']");
    private final By inputPasswordLocator = By.xpath("//input[@placeholder='Password']");
    private final By submitButtonLocator = By.xpath("//button[@id='login-button']");

    public LoginPortalSteps(TestContext testContext) {

        this.testContext = testContext;
        this.driver = DriverFactory.getDriver();
        this.wait = new WebDriverWait(this.driver, Duration.ofSeconds(10));
    }

    @Given("I access the WebDriver University login portal")
    public void loginPortal() {

        driver.get("https://webdriveruniversity.com/Login-Portal/index.html");
    }

    @When("I enter a username {string}")
    public void enterUsername(String username) {

        driver.findElement(inputUsernameLocator).sendKeys(username);
    }

    @And("I enter a password {string}")
    public void enterPassword(String password) {

        driver.findElement(inputPasswordLocator).sendKeys(password);
    }

    @And("I click submit")
    public void clickSubmit() {

        driver.findElement(submitButtonLocator).click();
    }

    @Then("I receive an alert with a login message {string}")
    public void getMessage(String mesage) {

        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();

        String actualMessage = alert.getText();
        Assert.assertEquals(actualMessage, mesage);

        alert.accept();
    }
}
