package com.test.objects.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class DriverSteps {

    private static final int ELEMENT_WAIT_TIMEOUT = 5;
    protected WebDriver driver;

    WebDriverWait waitFor() {
        return new WebDriverWait(driver, ELEMENT_WAIT_TIMEOUT);
    }

    protected DriverSteps(WebDriver driver) {
        this.driver = driver;
    }

    WebDriverWait waitFor(WebDriver driver) {
        return new WebDriverWait(driver, ELEMENT_WAIT_TIMEOUT);
    }

    public void waitForClickable(WebElement element) {
        WebDriverWait wait = new WebDriverWait(this.driver, ELEMENT_WAIT_TIMEOUT);
        wait.until(elementToBeClickable(element));
    }

    protected void waitForVisible(WebElement element) {
        WebDriverWait wait = new WebDriverWait(this.driver, ELEMENT_WAIT_TIMEOUT);
        wait.until(visibilityOf(element));
    }

}
