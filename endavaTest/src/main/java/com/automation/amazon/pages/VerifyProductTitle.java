package com.automation.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VerifyProductTitle extends BasePage {

    private WebDriver driver;
    private String title;

    public VerifyProductTitle(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    @FindBy(id = "productTitle")
    private WebElement productTitle;

    public VerifyIfPaperBack textIs() {
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(productTitle));
        setTitle(productTitle.getText());
        return new VerifyIfPaperBack(getDriver());
    }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
}
