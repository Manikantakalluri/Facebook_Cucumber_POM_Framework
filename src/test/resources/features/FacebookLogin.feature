Feature: Perform Login operation

  Background: 
   Given I launch chrome browser with valid url

  @regression
  Scenario: Login with valid credentials
  Given I launch chrome browser with valid url
    And I enter username
    And I enter password
    When I submit login button
    Then I verify login is success
    And I close the browser
    And I enter user firstname

  @testdata
  Scenario Outline: Login with multiple set of data
    And I enter valid "<username>"
    And I enter valid user "<password>"
    Then I verify login is success
    And I close the browser

    Examples: 
      | username       | password |
      | user@gmail.com |  1234456 |
      | abc@xyz.com    |   099324 |
