@Cart
Feature: Cart Feature
  As a user i want to add or remove item from cart

  @positive
  Scenario: Adding item to cart
    Given User already open the website sauce demo
    When User input "standard_user" as username "secret_sauce" as password
    And User filter list product by value "za"
    Then User clicking various of items into a cart

  @negative
  Scenario: Remove item from cart
    Given User input "standard_user" as username "secret_sauce" as password
    When User clicking various of items into a cart
    Then User navigating to cart page
    And User remove all item in cart