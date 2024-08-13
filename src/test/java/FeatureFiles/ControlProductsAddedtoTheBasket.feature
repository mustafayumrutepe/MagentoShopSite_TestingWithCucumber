Feature: Control of Products Added to The Basket
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

    # yarın yapcam burayı bugün sepetteki ürünleri silme yapıyorum

