Feature: Case Study-1 tests

  Background:
    Given homepage is open
    And I close the pop up
  @regression
  Scenario: Task-1 search result test
    When Verify page title "Best Buy | Official Online Store | Shop Now & Save"
    When I search for "Drone"
    Then search result should be seen
  @regression
  Scenario: Task-2 Login
    And I open "Account" dropdown menu
    And I choose "Account" submenu
    When Verify page title "Sign In to Best Buy"
    And Login with credentials
    Then Verify successful login


