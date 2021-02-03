package com.automation.amazon.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchingProductsComponents {

    public static final Target SEARCHING_BAR = Target.the("searching bar").located(By.id("twotabsearchtextbox"));
    public static final Target SEARCHING_BUTTON = Target.the("searching button").located(By.id("nav-search-submit-button"));
    public static final Target PRODUCT = Target.the("product").locatedBy("[data-cel-widget='search_result_0']");
    public static final Target PRODUCT_TITLE = Target.the("product title").located(By.id("productTitle"));
    public static final Target MEDIA_TAG = Target.the("media tag").locatedBy("#mediaTab_heading_2 > a > span > div:nth-child(1) > span");

    private SearchingProductsComponents() {}

}
