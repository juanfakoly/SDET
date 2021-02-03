Feature: As an Amazon user I want searching to some product to verify it

  Scenario: searching product
    Given the user wants searching a product from amazon
    When he/she has found the product called Software Test Design
    Then he/she verifies whether product contains a title and a mediaTap
      |Architecture Patterns with Python: Enabling Test-Driven Development, Domain-Driven Design, and Event-Driven Microservices|

