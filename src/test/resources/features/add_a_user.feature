Feature: Add a user with your information
  I as a app need to add a user with your first name and last name because i need save your data

  Scenario: add a new user
    When Agregar un usuario con nombre "Edwin" y apellido "Laguna"
    Then response status code is 201
    And the user was saved correctly


