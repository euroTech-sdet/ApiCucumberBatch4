Feature: Sign Up


  @wip
  Scenario Outline: DevEx User Register

    Given User creates a POST request with "<email>" and "<password>" and "<name>" and "<google>" and "<facebook>" and "<github>"
    Then Verify that status code should be 200
    Then Verify that body contains "token"
    And Compiler gets the token

    Examples:
      | email             | password | name       | google       | facebook   | github    |
      | john123@gmail.com | Api1111  | John Devis | Kevin Google | Kevin face | Kevin Git |


  Scenario Outline: User can able to POST request and gets the token and saves profile
    Given User creates a POST request and send the token with "<company>" "<website>" "<location>" "<status>" "<skills>" "<githubUsername>" "<youtube>" "<twitter>" "<facebook>" "<linkedin>" "<instagram>"
    Then Verify that status code should be 200
    Then User verify that name as "<name>" and email as "<email>"

    Examples:
      | company | website       | location | status    | skills   | githubUsername | youtube  | twitter      | facebook  | linkedin  | instagram | name       | email             |
      | Apple   | www.apple.com | New York | Developer | CSS,JAVA | appleGit       | appleYou | appleTwitter | appleFace | appleLink | appleIns  | John Devis | john123@gmail.com |
