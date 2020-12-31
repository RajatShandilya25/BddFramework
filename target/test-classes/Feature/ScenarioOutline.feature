#Always use Examples keyword with scenario outline. It is used for data driven testing

Feature: Login flow


  @Sanity
  Scenario Outline: Login
    Given User has the app installed
    When user launches the application
    And Enter the  "<Username>"
    And Enter rhe "<Password>"
    And tap on the Login button
    Then User should be able to successfully login


Examples:
      |Username | Password |
      |Rajat1 | qwerty1 |
      |Rajat2 | qwerty1 |

