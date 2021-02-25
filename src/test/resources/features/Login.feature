Feature: Login Functionality
  As a user, I should be able to login.

  Background:
    Given the user on login page

  @Manual-Login
  Scenario Outline: verify both Students and librarians  login
    When the user login as a <role>
    Then the user on  <page>

    Examples:
      | role      | page      |
      | student   | books     |
      | librarian | Dashboard |

