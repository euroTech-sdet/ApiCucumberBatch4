Feature: Compare UI and API Experiences

  Scenario Outline: UI and API Experiences

    Given User creates a POST request for add an experiences with "<title>" "<company>" "<location>"  "<from>" "<to>" "<current>" "<description>"
    Then Verify that status code should be 201
    And Compiler gets the experience id
    And User creates GET request to get experience with using Id
    And User is on the Dashboard page
    Then Verify that UI experience and API experience must be match company is "Sony"


    Examples:
      | title     | company | location | from       | to         | current | description |
      | QA Tester | Sony    | Japan    | 2000-10-10 | 2001-10-10 | false   | Happy       |