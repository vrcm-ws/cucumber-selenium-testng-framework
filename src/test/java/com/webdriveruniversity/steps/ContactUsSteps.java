package com.webdriveruniversity.steps;

import com.webdriveruniversity.context.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class ContactUsSteps {

    private TestContext testContext;
    private WebDriverWait wait;

    private final By firstNameInputLocator = By.xpath("//input[@name='first_name']");
    private final By lastNameInputLocator = By.xpath("//input[@name='last_name']");
    private final By emailInputLocator = By.xpath("//input[@name='email']");
    private final By commentInputLocator = By.xpath("//textarea[@name='message']");
    private final By submitButtonLocator = By.xpath("//input[@value='SUBMIT']");
    private final By messageLocator = By.xpath("//h1");

    public ContactUsSteps(TestContext testContext) {
        this.testContext = testContext;
        wait = new WebDriverWait(testContext.getDriver(), Duration.ofSeconds(10));
    }

    @Given("I access WebDriver University Contact Us page")
    public void contactUsPage() {

        testContext.getDriver().get("https://webdriveruniversity.com/Contact-Us/contactus.html");
    }

    @When("I enter a unique first name {string}")
    public void enterFirstName(String firstName) {

        testContext.getDriver().findElement(firstNameInputLocator).sendKeys(firstName);
    }

    @And("I enter a unique last name {string}")
    public void enterLastName(String lastName) {

        testContext.getDriver().findElement(lastNameInputLocator).sendKeys(lastName);
    }

    @And("I enter a unique email address {string}")
    public void enterEmail(String email) {

        testContext.getDriver().findElement(emailInputLocator).sendKeys(email);
    }

    @And("I enter a unique comment {string}")
    public void enterComment(String comment) {

        testContext.getDriver().findElement(commentInputLocator).sendKeys(comment);
    }

    @And("I click on submit button")
    public void clickSubmitButton() {

        testContext.getDriver().findElement(submitButtonLocator).click();
    }

    @Then("I should be presented with a successful submission message {string}")
    public void getSubmissionMessage(String expectedMessage) {

        String actualMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(messageLocator)).getText();

        Assert.assertEquals(actualMessage, expectedMessage);
    }
}
