Feature: Etsy search feature

  Ticket Num AU756



  Scenario: Etsy default title verification
    Given user is on the etsy landing page
    Then user should see Etsy title as expected

    #expecteed Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone

  Scenario: Etsy Search Functionality Title Verification
    Given user is on the etsy landing page
    When user types wooden spoon in the search bar
    And user clicks to the search button
    Then user sees title as wooden spoon | etsy