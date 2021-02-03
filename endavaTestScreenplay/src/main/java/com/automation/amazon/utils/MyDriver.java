package com.automation.amazon.utils;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.webdriver.SerenityWebdriverManager;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class MyDriver {

    public static WebDriver amazonDriver(WebDriver driver) {
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/?language=en_US");
        SerenityWebdriverManager.inThisTestThread().setCurrentDriverTo(driver);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return driver;
    }
}
