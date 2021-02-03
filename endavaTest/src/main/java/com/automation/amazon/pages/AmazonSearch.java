package com.automation.amazon.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class AmazonSearch extends BasePage {

    private WebDriver driver;

    public AmazonSearch(WebDriver driver) {
        super(driver);
        driver.get("https://www.amazon.com/?language=en_US");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        this.driver = driver;
    }

    @FindBy(id = "twotabsearchtextbox")
    private WebElement searchingBar;

    @FindBy(css = "[data-cel-widget='search_result_0']")
    private WebElement product;

    public VerifyProductTitle searchingProducts(String productName) {
      new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(searchingBar));
      searchingBar.sendKeys(productName);
      searchingBar.sendKeys(Keys.ENTER);
      new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(product));
      product.click();
      return new VerifyProductTitle(getDriver());
    }
}
