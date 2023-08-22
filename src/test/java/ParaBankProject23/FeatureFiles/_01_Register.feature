Feature: Register Functionality
  As a user I want to be able to register
  so that I can access my account

  Scenario: Register as a new user
    Given Navigate to ParaBank webpage
    When Click on register link
    And Fill form with valid data
      | CGroup4             |
      | Techno              |
      | 12 Einstein street  |
      | Berlin              |
      | Berlin              |
      |85236                |
      | 20214587            |
      | 302545546           |
      | CGroup4             |
      | Qwerty+12           |
      | Qwerty+12           |
    And Click on Register button
    Then Success message should be displayed