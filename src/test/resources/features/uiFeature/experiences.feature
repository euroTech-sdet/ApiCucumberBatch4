Feature: Compare UI and API Experiences

Scenario: UI and API Experiences

    Given User creates a POST request for add an experiences with "<title>" "<company>" "<location>"  "<from>" "<to>" "<current>" "<description>"
    Then Verify that status code is 201
