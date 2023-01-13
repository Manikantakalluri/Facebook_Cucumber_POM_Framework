Feature: Perform Registarion operation with Data tables

  Scenario: Perform registration operation

  @dataTables
  Scenario: Login with valid credentials - as List of Objects
    Given I launch chrome browser with valid url
    Then I enter below data in required fields
      | user@gmail.com | 1234456 |
      | abc@xyz.com    |  099324 |
    And I close the browser

  @dataTables
  Scenario: Login with valid credentials - as Map of Objects
    Given I launch chrome browser with valid url
    Then I enter below map data in required fields
      | userName       | Password |
      | user@gmail.com |  1234456 |
      | abc@xyz.com    |   099324 |
    And I close the browser
