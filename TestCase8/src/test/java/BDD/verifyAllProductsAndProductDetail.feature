Feature: Verify All Products and product detail page
  Scenario: Verifying products
    Given Launch browser
    When Navigate to url http://automationexercise.com
    Then Verify that home page is visible successfully

    When Click on Products button
    Then Verify user is navigated to ALL PRODUCTS page successfully
    Then The products list is visible
    Given Click on View Product of first product
    When User is landed to product detail page
    Then Verify that detail detail is visible: product name, category, price, availability, condition, brand



