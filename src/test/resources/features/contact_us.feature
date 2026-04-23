Feature: WebDriver University - Contact Us Page

    @MultiData
    Scenario Outline: Validate succesful submission

        Given I access WebDriver University Contact Us page

        When I enter a unique first name "<firstname>"
        And I enter a unique last name "<lastname>"
        And I enter a unique email address "<email>"
        And I enter a unique comment "<comment>"
        And I click on submit button

        Then I should be presented with a successful submission message "<message>"


        Examples:

            | firstname | lastname | email             | comment                | message                     |
            | vic       | mann     | vicmann@test.com  | this is a test comment | Thank You for your Message! |
            | vick      | ness     | vickness@test.com | this is a temp comment | Thank You for your Message! |


    @SingleData
    Scenario:

        Given I access WebDriver University Contact Us page

        When I enter a unique first name "Vico"
        And I enter a unique last name "Bot"
        And I enter a unique email address "vico_bot@test.com"
        And I enter a unique comment "This is a demo comment"
        And I click on submit button

        Then I should be presented with a successful submission message "Thank You for your Message!"