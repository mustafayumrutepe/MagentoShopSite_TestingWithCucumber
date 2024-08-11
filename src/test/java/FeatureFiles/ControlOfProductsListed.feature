Feature: Control of the number of products listed

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
    When Go to the cart
      |goCart|
      |viewAndEditCart|

    Then Collect data and verify payment amount
      |price|
      |quantity|
      |subtotal|
