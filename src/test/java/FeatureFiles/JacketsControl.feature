Feature:

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
    Then  Move to elements
    |Men|
    |Tops|
    Then Click on these elements
    |jaket|
    And How many item in the cart TEKRAR
    |JaketsList|