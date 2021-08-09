Feature: Navigate to Pay Bills page

  Background:
    Given user enters valid "username" and "password"
    And user is in Dashboard page
    When user navigate to "Pay Bills"


  Scenario: User is in the Pay Bills page
    Then title of page is "Zero - Pay Bills"
  @wip
  Scenario:User enter valid input for make a Pay Operation
    When user enters "25" in Amount input box
    And user enters month "7" and year "2021" and day "18"
    And user enters "For me" as description
    And user clicks on the Pay button
    Then "The payment was successfully submitted." is displayed

  Scenario: User does NOT fill all input boxes for make a Pay Operation
    When user leaves empty "" input box
    Then "The payment was successfully submitted." is displayed

 Scenario: : User enters Amount input for make a Pay Operation
    When user enters to Amount input box
    And enter numerical values like 100
    But does NOT enter alphabetical or special characters like ""
    Then values entered is accepted


