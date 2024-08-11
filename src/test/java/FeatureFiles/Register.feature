Feature: Register Functionality

  Background:
    Given Navigate to website

  Scenario: Create an account
    When Click on the Create an Account element
      |createAnAccount|
    Then Fill out the account creation form
      |firstname        |   Jacob       |
      |lastname         |   James       |
      |email            |   jj@gmail.com|
      |password         |   jjames123.. |
      |confirmPassword  |   jjames123.. |
    And Click on the Create an Account button
      |createAnAccountButton|
    And Verify account creation
      |verifying|




