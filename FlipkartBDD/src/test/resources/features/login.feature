Feature: Flipkart Login Functionality

  Scenario: Login with valid credentials
    Given user is on Flipkart login page
    When user enters valid username and password
    And clicks on login button
    Then user should be redirected to homepage