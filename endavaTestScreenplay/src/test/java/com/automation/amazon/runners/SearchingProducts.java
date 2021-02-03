package com.automation.amazon.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/searching_products.feature",
                glue = "com.automation.amazon.stepdefinitions",
                snippets = SnippetType.CAMELCASE)
public class SearchingProducts {
}
