Feature: Access to Dashboard Page with the Account Summary Information

  Scenario: User accesses to Account Summary Information
    When user is in account summary page
    Then title of page is "Zero –Account activity"
    And  Account drop down default is "Savings"
    And  Account drop down options are:
    | Savings |
    | Checking|
    | Loan |
    | Credit Card |
    | Brokerage |
    And Transactions table column names are:
    | Date |
    | Description |
    | Deposit |
    | Withdrawal |


