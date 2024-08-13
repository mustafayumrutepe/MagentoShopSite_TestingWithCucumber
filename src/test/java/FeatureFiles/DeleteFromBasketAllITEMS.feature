Feature: Delete Functionality

  Background:
    Given Navigate to website
    When Click on these elements
      |Signin      |
    Then Fill out the account creation form
      |Email       |jj@gmail.com|
      |Password    |jjames123..|
    And Click on these elements
      |SigninButton|
    And The transaction was completed successfully.
      |JacopJames|Welcome|

    Scenario:
      Then Click on these elements
        |goCart|
        |viewAndEditCart|
      And How many item in the cart
        |cartItem|
      Then Delete from All item in the cart
      |Remove_item|
      Then The transaction was completed successfully.
      |Noitems|You have no items in your|

