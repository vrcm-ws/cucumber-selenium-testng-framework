Feature: WebDriver University - Contact Us Page

    Scenario: Validate succesful submission

        Given I access WebDriver University Contact Us page

        When I enter a unique first name
        And I enter a unique last name
        And I enter a unique email address
        And I enter a unique comment
        And I click on submit button

        Then I should be presented with a succesful submission message
