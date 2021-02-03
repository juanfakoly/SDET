package com.automation.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VerifyIfPaperBack extends BasePage {

    private WebDriver driver;

    public VerifyIfPaperBack(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    @FindBy(css = "#mediaTab_heading_2 > a > span > div:nth-child(1) > span")
    private WebElement mediaTab;

    public Boolean isPreSelected() {
        return mediaTab.isDisplayed();
    }
}
