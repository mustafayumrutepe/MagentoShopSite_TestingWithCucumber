Feature: Delete Functionality

  Background:
    Given Navigate to website
    When Click on the LocatorPage in element
      |Signin      |
    Then Fill out the account creation form
      |Email       |jj@gmail.com|
      |Password    |jjames123..|
    And Click on the LocatorPage in element
      |SigninButton|
    And The transaction was completed successfully.
      |JacopJames|Welcome|

    Scenario:
      Then Click on the LocatorPage in element
        |goCart|
        |viewAndEditCart|
      And How many item in the basket
        |cartItem|
      Then Delete from All item in the basket
      |Remove_item|
      Then The transaction was completed successfully.
      |Noitems|You have no items in your|

