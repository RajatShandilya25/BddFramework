#Feature: List of scenarios
#Scenario: Business rule through steps of scenarios
#Given: Add some pre-conditions
#When: Key actions
#Then: Validations/ Assertions
#And, But: Some actions to enumerate Given, When, Then
#tage: Tags are used to filter the scenarios or features
#Background: Define conditions which will run before every scenario

#Hooks:
#       @Before, @BeforeStep, @After and @AfterStep can also be written in a separate java class for
#       before and after conditions. Also add hooks package name in "glue" option in runner file


Feature: Amazon Search

  Background:
    Given User should be able to login



  @Smoke
  Scenario: Search a product
    And There should be a search box on Amazon page
    When I search for the product "Mackbook Pro"
    And price is "$1000"
    Then "Mackbook Pro" should be displayed


  @Regression
  Scenario: Search a product in app
    And There should be a search box on Amazon application
    When I search for the product "Mackbook Air" in app
    And price is "$1000"
    Then "Mackbook Air" should be displayed in the results