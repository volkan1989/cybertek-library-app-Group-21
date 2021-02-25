Feature: Logout Functionality
  As a user, I should be able to logout from the library app.

  Background:
    Given the user on login page

  @logout
  Scenario Outline:
    When the user login as a <role>
    Then the user logout
    Examples:
      | role      |
      | student   |
      | librarian |