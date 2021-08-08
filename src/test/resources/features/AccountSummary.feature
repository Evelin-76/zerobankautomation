Feature: Access to Dashboard Page with the Account Summary Information
  @wip
  @AccountSummaryPage
  Scenario: User accesses to Account Summary Information
    Given user enters valid "username" and "password"
    When user is in account summary page
    Then title of page is "Zero - Account Summary"
    And  Account Summary account types are:
    | Cash Accounts |
    | Investment Accounts|
    | Credit Accounts |
    | Loan Accounts |
    And Credit Accounts table column names are:
    | Account |
    | Credit Card |
    | Balance |



