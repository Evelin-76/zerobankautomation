Feature: Login as a authorized user

  @login
  Scenario: User login with valid credentials
    Given user is in login page
    When user enters valid "username" and "password"
    Then user enters to Account summary page


