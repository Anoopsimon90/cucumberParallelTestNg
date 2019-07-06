Feature: Login

  @loginS
  Scenario Outline: LoginToApp
    Given I login to application
    And I close application
    Examples:
      |a|
      |1 |
      |2 |
      |3 |
#  @loginS
#  Scenario: LoginToApp1
#    Given I login to application