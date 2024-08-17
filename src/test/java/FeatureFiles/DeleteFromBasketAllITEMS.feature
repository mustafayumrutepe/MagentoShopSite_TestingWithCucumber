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

  Scenario: Delete all items from the cart
    When Click on these elements
      | goCart          |
    Then There is no any products in the cart
      | emptyCart       |
    Then Click on these elements for deleting scenario
      | viewAndEditCart |
    And How many item in the cart
      | cartItem        |
    Then Delete from All item in the cart
      | Remove_item     |
    Then The transaction was completed successfully.
      | Noitems         | You have no items in your |

