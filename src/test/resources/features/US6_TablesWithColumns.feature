Feature: As a student, I should be able to see tables with default info
 Background:
   Given  user is on login page
@US6
   Scenario: Table columns names

     When The user logs in
     Then The user should see the following columns names


       | Actions     |
       | ISBN        |
       | Name        |
       | Author      |
       | Category    |
       | Year        |
       | Borrowed By |
