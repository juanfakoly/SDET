package com.automation.amazon.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.time.Duration;

import static com.automation.amazon.userinterfaces.SearchingProductsComponents.*;

public class TheTitleAndTheMediaTag implements Question<Boolean> {

    private String title;

    public TheTitleAndTheMediaTag(String title) {
        this.title = title;
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        return PRODUCT_TITLE.waitingForNoMoreThan(Duration.ofSeconds(10)).resolveFor(actor).getText().equals(title) &&
                MEDIA_TAG.resolveFor(actor).isDisplayed();
    }

    public static TheTitleAndTheMediaTag wereVerifiedSuccessfully(String title) {
        return new TheTitleAndTheMediaTag(title);
    }
}
