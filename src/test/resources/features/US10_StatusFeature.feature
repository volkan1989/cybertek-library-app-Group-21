Feature:
user status feature

  @librarian
  Scenario: verify user status
    Given the user Librarian on the homepage
    When user librarian is logged in
    Then the user click users module
    And the user click Status dropdown
    Then the user should see the following options
    |ACTIVE  |
    |INACTIVE|


