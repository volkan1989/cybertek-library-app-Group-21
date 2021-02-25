Feature: As a user, I should be able to login to the library app.
  Verify both Students and Librarians.

  @Autologin
  Scenario Outline: Verify both Students and Librarians logging in
    Given The user on login page
    When the user login with "<username>" and "<password>" sees "<page>"
    Examples:
      | username            | password | page      |
      | student54@library   | 3nHQlWhN | Books     |
      | student55@library   | 8TPM4JKJ | Books     |
      | student56@library   | 4dJYzMiG | Books     |
      | librarian43@library | np6AxVIh | Dashboard |

#    And the user enters "<password>" to password box
#    And the user clicks to signIn button
#    Then the user on "<page>"






