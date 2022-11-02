Feature: demo functinality

  Scenario: Check login with valid credentials
    Given user calculate 1/0
    When user enters valid username and password
    And clicks on login button
    Then user is navigated to the home page

  Scenario: Check login with invalid credentials
    Given user is on login page
    When user enters valid username and password
    And clicks on login button
    Then error message is dispalyed - Invalid credentials