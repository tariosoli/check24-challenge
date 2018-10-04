package com.test.objects.elements.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementDecorator;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementLocatorFactory;

public class CookiesBar {

    WebDriver driver;

    public CookiesBar(WebDriver driver) {
        PageFactory.initElements(new HtmlElementDecorator(new HtmlElementLocatorFactory(driver)), this);
        this.driver = driver;
    }

    @FindBy(css = ".c24-cookie-button")
    private HtmlElement acceptCookiesButton;

    public HtmlElement getAcceptCookiesButton() {
        return acceptCookiesButton;
    }
}
