Feature: Add Products in Cart
  Scenario: Adding products to cart and verifying it
    Given  Launch browser
    When Navigate to url http://automationexercise.com
    Then Verify that home page is visible successfully
    Given Click Products button
    And Hover over first product and click Add to cart
    And Click Continue Shopping button
    And Hover over second product and click Add to cart
    And Click View Cart button
    Then Verify both products are added to Cart
    Then Verify their prices, quantity and total price



