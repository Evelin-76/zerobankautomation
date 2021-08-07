Feature: Login as an authorized user

  @loginWithValidCredentials
  Scenario: User login with valid credentials
    When user enters valid "username" and "password"
    Then user enters to Account summary page

  @invalidUsernameOrPassword
  Scenario: User login with invalid
    When user enter invalid username "usernam" or password "UserUser123"
    Then user sees a login error message
  @wip
  @emptyLoginInputBox
  Scenario: User leaves any login input box blanked
    When any login input box is empty "" ""
    Then user sees a login error message


