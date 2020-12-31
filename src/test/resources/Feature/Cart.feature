#Feature: List of scenarios
#Scenario: Business rule through steps of scenarios
#Given: Add some pre-conditions
#When: Key actions
#Then: Validations/ Assertions
#And, But: Some actions to enumerate Given, When, Then

Feature: Amazon cart

  @Smoke
  Scenario: Add product to cart
    Given product is available
    When I open product detail page
    Then There should be a cart button
