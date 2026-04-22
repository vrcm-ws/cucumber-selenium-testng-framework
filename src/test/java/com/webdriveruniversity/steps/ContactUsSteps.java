package com.webdriveruniversity.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactUsSteps {

    @Given("I access WebDriver University Contact Us page")
    public void i_access_web_driver_university_contact_us_page() {

        System.out.println("TEST 1");

    }

    @When("I enter a unique first name")
    public void i_enter_a_unique_first_name() {

        System.out.println("TEST 2");

    }

    @And("I enter a unique last name")
    public void i_enter_a_unique_last_name() {

        System.out.println("TEST 3");

    }

    @And("I enter a unique email address")
    public void i_enter_a_unique_email_address() {

        System.out.println("TEST 4");

    }

    @And("I enter a unique comment")
    public void i_enter_a_unique_comment() {

        System.out.println("TEST 5");

    }

    @And("I click on submit button")
    public void i_click_on_submit_button() {

        System.out.println("TEST 6");

    }

    @Then("I should be presented with a succesful submission message")
    public void i_should_be_presented_with_a_succesful_submission_message() {

        System.out.println("TEST 7");

    }
}
