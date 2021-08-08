Feature: Navigate to Account Activity page

Background:
  Given user enters valid "username" and "password"
  And user is in Dashboard page
  When user navigate to "Account Activity"
  Scenario: User is in the Account Activity page

    Then title of page is "Zero - Account Activity"
  @wip
  Scenario: User checks drop down default option
    Then drop down default option is "Savings"

  Scenario: User checks drop down options
    When user clicks on drop dawn options box
    Then drop down options are:
    | Savings |
    | Checking |
    | Loan |
    | Credit Card |
    | Brokerage |

  Scenario: User checks Transactions table info column names
    Then Transtaction table column names are:
    | Date |
    | Description |
    | Deposit |
    | Withdrawal |

