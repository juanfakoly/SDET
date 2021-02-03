package com.automation.amazon.tasks;

import static com.automation.amazon.userinterfaces.SearchingProductsComponents.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


import java.time.Duration;

public class SearchingProducts implements Task {

    private String product;

    public SearchingProducts(String product) {
        this.product = product;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(product).into(SEARCHING_BAR.waitingForNoMoreThan(Duration.ofSeconds(10))),
                Click.on(SEARCHING_BUTTON),
                Click.on(PRODUCT.waitingForNoMoreThan(Duration.ofSeconds(10)))
        );
    }

    public static SearchingProducts fromAmazon(String product) {
        return Tasks.instrumented(SearchingProducts.class, product);
    }
}
