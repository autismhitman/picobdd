Feature: Add to cart functionality
  As a customer I want to add a product to my cart

  Scenario: Add one quantity from store
    Given I am on the store page
    When I add a "Blue Shoes" to the cart
    Then I should see 1 "Blue Shoes" in the cart page
    
   Scenario Outline: Add one quantity from store example
    Given I am on the store page
    When I add a "<product_name>" to the cart
    Then I should see 1 "<product_name>" in the cart page 
   Examples:
   |product_name |
   |Anchor Bracelet|
   |Blue Tshirt|

