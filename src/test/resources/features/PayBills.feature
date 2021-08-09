Feature: Navigate to Pay Bills page

  Background:
    Given user enters valid "username" and "password"
    And user is in Dashboard page
    When user navigate to "Pay Bills"


  Scenario: User is in the Pay Bills page
    Then title of page is "Zero - Pay Bills"

  Scenario:User enter valid input for make a Pay Operation
    When user enters numerical value "25" in Amount input box
    And user enters month "7" and year "2021" and day "18"
    And user enters "For me" as description
    And user clicks on the Pay button
    Then "The payment was successfully submitted." is displayed

  Scenario: User does NOT fill all input boxes for make a Pay Operation
    When user leaves empty "" input box
    Then msg "Completa este campo" is displayed
  @wip
 Scenario: : User enters Amount input for make a Pay Operation
     When does NOT enter numerical characters like "a"
     Then values entered are NOT is accepted


