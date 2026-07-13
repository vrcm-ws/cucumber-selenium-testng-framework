@login
Feature: WebDriver University - Login Portal

    Background:

        Given I access the WebDriver University login portal


    Scenario: Validate Successful Login Message

        When I enter a username "webdriver"
        And I enter a password "webdriver123"
        And I click submit

        Then I receive an alert with a login message "validation succeeded"


    Scenario: Validate Unsuccessful Login Message - Wrong username

        When I enter a username "webdrivers"
        And I enter a password "webdriver123"
        And I click submit

        Then I receive an alert with a login message "validation failed"


    Scenario: Validate Unsuccessful Login Message - Wrong password

        When I enter a username "webdriver"
        And I enter a password "webdriver1234"
        And I click submit

        Then I receive an alert with a login message "validation failed"
