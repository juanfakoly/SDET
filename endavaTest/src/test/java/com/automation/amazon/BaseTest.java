package com.automation.amazon;

import com.automation.amazon.pages.AmazonSearch;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseTest {

    private MyDriver myDriver;

    @BeforeClass(alwaysRun = true)
    @Parameters({"browser"})
    public void beforeClass(String browser) {
        this.myDriver = new MyDriver(browser);
    }

    public AmazonSearch getAmozonSearch() { return new AmazonSearch(myDriver.getDriver()); }

    @AfterClass(alwaysRun = true)
    public void afterClass() {
        myDriver.getDriver().quit();
    }
}
