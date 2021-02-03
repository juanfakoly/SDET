# AMAZON TEST AUTOMATION

## HOW RUN IT

in the IDE of their choice, you might import de project as a gradle project

- IT IS NECESSARY HAVE INSTALLED [GRADLE](https://gradle.org/releases/) IN YOUR SYSTEM

---

Into parameters setting to run the test you might set browser parameters

- the following command allows running the test from you terminal

`gradle clean test --test *SearchingProducts -Dcontext=<Brower> -Dwebdriver.driver=<Browser> aggregate --info`

- replace `<Browser>` by `chrome` or `firefox`

* this path contains the test case inside `src/test/resources/features/searching_products.feature`

whether you want to modify the searching, change the the following parameter here.

```gherkin
Feature: As an Amazon user I want searching to some product to verify it

  Scenario: searching product
    Given the user wants searching a product from amazon
    When he/she has found the product called Software Test Design
    Then he/she verifies whether product contains a title and a mediaTap
      |Architecture Patterns with Python: Enabling Test-Driven Development, Domain-Driven Design, and Event-Driven Microservices|
```

- parameter `**parameter**` in the **When** sentence replace it including \*\*
- parameter into `|parameter|` makes references to product title, replace it without including `||`
