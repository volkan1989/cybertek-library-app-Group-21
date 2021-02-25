@wip
Feature: As a user, I should be able to see several modules once I login

  Scenario: Librarian should have access to 3 modules
    Given the librarian on the homepage
    Then the user should see following modules
      | Dashboard       |
      | Books           |
      | Borrowing Books |

