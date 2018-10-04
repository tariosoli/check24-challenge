package com.test;

import com.test.config.Config;
import com.test.objects.steps.AuthSteps;
import com.test.objects.steps.SearchSteps;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class BasicTest {

    protected WebDriver driver;

    AuthSteps authSteps;
    SearchSteps searchSteps;

    @Before
    public void setUp() throws MalformedURLException {
        Config config = Config.instance();
        this.driver = new RemoteWebDriver(new URL(config.getGrid()), config.getCapabilities());
        driver.manage().window().maximize();

        authSteps = new AuthSteps(driver);
        searchSteps = new SearchSteps(driver);
    }

    @After
    public void killDriver() {
        try {
            driver.close();
            driver.quit();
        } catch (Throwable ignored) {}
    }
}
