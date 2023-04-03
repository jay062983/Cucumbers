Feature: Login Functionalities
  Scenario: valid Admin login
    Given open the browser and launch HRMS Application
    When user enters a valid email and valid password
    And click on login button
    Then user is logged in successfully
    And close the browser