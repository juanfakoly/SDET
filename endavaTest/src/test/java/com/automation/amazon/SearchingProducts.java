package com.automation.amazon;

import com.automation.amazon.pages.AmazonSearch;
import com.automation.amazon.pages.VerifyIfPaperBack;
import com.automation.amazon.pages.VerifyProductTitle;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SearchingProducts extends BaseTest {

    @Test
    @Parameters({"product", "productTitle"})
    public void searchingProductsTest(String product, String productTitle) {
        AmazonSearch amazonSearch = getAmozonSearch();
        VerifyProductTitle verifyProductTitle = amazonSearch.searchingProducts(product);
        VerifyIfPaperBack verifyIfPaperBack = verifyProductTitle.textIs();
        Assert.assertEquals(verifyProductTitle.getTitle(), productTitle);
        Assert.assertFalse(verifyIfPaperBack.isPreSelected(), "Paperback tab was not shown pre-selected ");
    }

}
