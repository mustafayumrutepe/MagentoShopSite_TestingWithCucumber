Feature: Login Functionality
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
      |Action_switch  |
      |MyAccount      |
      |ManageAddresses|
       And Fill out the account creation form
      |Company  |TechnoCenter|
      |telephone|05397245236 |
      |street_1 |Akıncılar   |
      |city     |Mardin      |
      |zip      |23134       |
      And  Select my Choice
      |country_Select |United States|
      |region_Select  |Virginia     |
       And Click on these elements
       |Save_Address|


