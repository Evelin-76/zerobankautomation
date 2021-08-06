Feature: Login as a authorized user

  Background:
    Given user is in login page
  @wip
  Scenario: User login with valid credentials
    When user enters valid "username" and "password"
    Then user enters to Account summary page

  Scenario: User login with invalid credentials
    When user enter invalid username "useruser" or password "User123"
    Then user sees a login error message

  Scenario: User leaves any login input box blanked
    When any login input box is empty "" ""
    Then user sees a login error message


