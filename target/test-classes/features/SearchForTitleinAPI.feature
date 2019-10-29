Feature: Open bookstore API and lookup for title

  Scenario: As a user I would like to open bookstore and lookup for title
    Given a user opens Book Info Product API
    When the response is a success
    Then the users gets the title "The Comedy of Errors" in the response
