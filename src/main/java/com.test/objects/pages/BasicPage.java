package com.test.objects.pages;

import com.test.config.Config;
import org.hamcrest.core.StringContains;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementDecorator;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementLocatorFactory;

public abstract class BasicPage {

    protected WebDriver driver;

    protected BasicPage(WebDriver driver) {
        PageFactory.initElements(new HtmlElementDecorator(new HtmlElementLocatorFactory(driver)), this);
        this.driver = driver;
    }

    public abstract String getPath();

    public void open() {
        String url = Config.instance().getHost().withPath(getPath()).toString();
        driver.get(url);
    }

    public boolean checkWeAreHere() {
        try {
            waitForUrlPath(getPath());
            return true;
        } catch (org.openqa.selenium.TimeoutException e) {
            return false;
        }

    }

    protected void waitForUrlPath(String path) {
        new WebDriverWait(driver, 5).until((ExpectedCondition<Boolean>) driver1 ->
                StringContains.containsString(path).matches(driver1.getCurrentUrl()));
    }

}
