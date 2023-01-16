Feature: Sign Up


  @wip
  Scenario Outline: DevEx User Register

    Given User creates a POST request with "<email>" and "<password>" and "<name>" and "<google>" and "<facebook>" and "<github>"
    Then Verify that status code should be 200
    Then Verify that body contains "token"

    Examples:
      | email           | password | name     | google       | facebook   | github    |
      | kevin1234@gmail.com | Kevin1111    | Kevin Test | Kevin Google | Kevin face | Kevin Git |
