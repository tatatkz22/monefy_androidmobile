Feature: Monefy Budgeting

  Scenario: Add an expense
    Given the app is launched
    When I add an expense
    Then the balance should reflect the expense

  Scenario: Add a source
    When I add a new source
    Then the source should be visible

  Scenario: Check balance visibility
    Then the balance should be displayed