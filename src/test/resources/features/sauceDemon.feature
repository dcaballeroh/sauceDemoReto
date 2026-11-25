Feature: SauceDemo End-to-End Flows

  Background:
    Given the user is on the serenity demo page
    When attempts to log in

    | user          | pass         |
    | standard_user | secret_sauce |

  Scenario Outline: Successful product purchase end to end
    And adds a product to the cart and completes checkout

    | firstName   | lastName   | postalCode   |
    | <firstName> | <lastName> | <postalCode> |
    Then the order confirmation message should be "<confirmation>"

    Examples:

      | firstName | lastName  | postalCode | confirmation              |
      | David     | Caballero | 250040     | Thank you for your order! |

  Scenario: Remove product from cart and logout end to end
    And adds a product to the cart, removes it and logs out
    Then the user should return to the login screen
