Feature: Login Functionality
As a user I want to be able to login with my valid credentials
  so that I can see my account

  Scenario Outline: Login test with valid and invalid credentials
    Given Navigate to ParaBank webpage
    When Enter "<username>" as username and "<password>" as password
    And Click on Login button
    Then Verify Login Status

    Examples:
      | username | password  |
      | CGroup4  | invalid   |
      | invalid  | Qwerty+12 |
      | invalid  | invalid   |
      |          | Qwerty+12 |
      | CGroup4  |           |
      |          |           |
      | CGroup4  | Qwerty+12 |