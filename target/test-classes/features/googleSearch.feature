Feature: google search functionality
  Agile story: asa user, when i am on the google search page,
  i should be able to search whatever
  i want, and see relevant information

  Scenario: User search title information
    Given User is on google home page
    When user searches for apple
    Then User should see apple in the title