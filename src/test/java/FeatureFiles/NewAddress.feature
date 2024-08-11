Feature: Login Functionality
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
       And Click on the LocatorPage in element
       |Save_Address|


