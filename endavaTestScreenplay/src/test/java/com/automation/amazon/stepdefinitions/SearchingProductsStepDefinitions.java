package com.automation.amazon.stepdefinitions;

import com.automation.amazon.questions.TheTitleAndTheMediaTag;
import com.automation.amazon.tasks.SearchingProducts;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static com.automation.amazon.utils.MyDriver.amazonDriver;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class SearchingProductsStepDefinitions {

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Before
    public void init() {
        setTheStage(Cast.ofStandardActors());
        theActorCalled("Juan");
    }

    @Given("the user wants searching a product from amazon")
    public void theUserWantsSearchingAProductFromAmazon() {
        theActorInTheSpotlight().can(BrowseTheWeb.with(amazonDriver(driver)));
    }

    @When("he\\/she has found the product called (.*)")
    public void heSheHasFoundTheProductCalled(String product) {
        theActorInTheSpotlight().attemptsTo(SearchingProducts.fromAmazon(product));
    }

    @Then("he\\/she verifies whether product contains a title and a mediaTap")
    public void heSheVerifiesWhetherProductContainsATitleAndAMediaTap(String title) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(TheTitleAndTheMediaTag.wereVerifiedSuccessfully(title)));
    }
}
