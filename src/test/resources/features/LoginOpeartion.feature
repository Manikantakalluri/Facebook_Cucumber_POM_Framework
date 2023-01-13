Feature: Perform Login operation

  @LoginOperation
  Scenario: Login with valid credentials
    Given I launch firefox browser with valid url
    And I enter login Username
    And I enter login password
    When I click on submit button
    Then I verify login opertion is success
    And I close the firefox browser
