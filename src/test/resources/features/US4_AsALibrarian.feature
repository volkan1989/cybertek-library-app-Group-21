@us4
Feature:  As a librarian, I should be able to add users from users page.

  Scenario Outline:  As a librarian, I should be able to add users from users page.
    Given  Add users with all valid info
    When  Librarians able to close the add user window with close button
    Then  Librarians able to edit user info
    Then  User write "<fullName>" to full name
    Then User write "<password>" to password
    Then User write "<email>" to email
    Then User select "<userGroup>" in user group
    Then User select "<status>" in status
    Then User select "<startDate>" in start date
    Then User write "<address>" to address

    Examples:
      | fullName         | password  | email           | userGroup | status | startDate  | address          |
      | Someone Someones | Something | Som3d@gmail.com | Students  | ACTIVE | 2021-05-07 | Somewhere Street |
