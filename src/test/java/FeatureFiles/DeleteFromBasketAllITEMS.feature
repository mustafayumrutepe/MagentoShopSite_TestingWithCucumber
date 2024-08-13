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
      Then How many item in the basket
      |goCart|

