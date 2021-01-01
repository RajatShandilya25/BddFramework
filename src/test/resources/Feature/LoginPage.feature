Feature: Login page feature

  Scenario: Login Page title
    Given user is on login page
    When user gets the title of the page
    Then login page title should be "Login - My Store"


  Scenario: Login with correct credentials
      Given user is on login page
      When user enters username "rajatshandilya25@gmail.com"
      And enters password "qwerty"
      And clicks on login button
      Then home page title should be "My account - My Store"
