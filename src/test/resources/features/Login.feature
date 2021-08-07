Feature: Login as an authorized user
@login

  Scenario: User login with valid credentials
    Given user is in login page
    When user enters valid "username" and "password"
    Then user enters to Account summary page
  @wip
  Scenario: User login with invalid credentials
    Given user is in login page
    When user enter invalid username "usernam" or password "UserUser123"
    Then user sees a login error message

  Scenario: User leaves any login input box blanked
    Given user is in login page
    When any login input box is empty "" ""
    Then user sees a login error message


