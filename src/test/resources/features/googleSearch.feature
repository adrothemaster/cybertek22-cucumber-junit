Feature: google search functionality
  Agile story: asa user, when i am on the google search page,
  i should be able to search whatever
  i want, and see relevant information

  Scenario: Search page title verification
    When User is on Google home page
    Then  User should see title is Google

  Scenario: User search title verification
    Given User is on Google home page
    When User searches for apple
    Then User should see apple in the title
  @google
  Scenario: User search title verification
    Given User is on Google home page
    When User searches for "wooden spoon"
    Then User should see "wooden spoon" in the title