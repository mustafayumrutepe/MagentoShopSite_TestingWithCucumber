Feature: Checking the products added to the cart

  Background: Login
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

  Scenario: Clear the cart
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

    Scenario: Add three different watches to cart
      When Go over these elements
          |gear|
      Then Click on these elements
          |watches|
      And Choose a random item
          |listOfWatches|
      And Determine the quantity
          |quantity |2|
      And Add to cart
          |AddtoCart|
      When Go over these elements
          |gear|
      Then Click on these elements
          |watches|
      And Choose a random item but different from the others
          |listOfWatches|
      And Determine the quantity
        |quantity |5|
      And Add to cart
        |AddtoCart|
      When Go over these elements
          |gear|
      Then Click on these elements
          |watches|
      And Choose a random item but different from the others
          |listOfWatches|
      And Determine the quantity
        |quantity |1|
      And Add to cart
        |AddtoCart|
      Then Go to the cart
        |goCart|
        |viewAndEditCart|
      Then Verify products are in the cart
        |cartItem|