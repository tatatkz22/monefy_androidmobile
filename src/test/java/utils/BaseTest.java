package utils;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BaseTest {

    @Before
    public void setUp() {
        //ExtentReportManager.initReport();
        DriverFactory.getDriver();
    }

    @After
    public void tearDown() {
        if (DriverFactory.getDriver() != null) {
            DriverFactory.getDriver().quit();
        }
       // ExtentReportManager.flushReport();
    }
}