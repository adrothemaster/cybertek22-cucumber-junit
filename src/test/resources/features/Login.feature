@all
Feature: Library app login feature
  As a user, I should be able to login with correct credentials to different accounts.
  and dashboard should be displayed.
  @librarian
  Scenario: Login as Librarian
    Given user is on the login page
    When user enters librarian username
    And user enters librarian password
    Then user should see the dashboard
  @student
  Scenario: Login as Student
    Given user is on the login page
    When user enters student username
    And user enters student password
    Then user should see the dashboard
  @admin
  Scenario: Login as Admin
    Given user is on the login page
    When user enters admin username
    And user enters admin password
    Then user should see the dashboard