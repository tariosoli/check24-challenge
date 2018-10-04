package com.test.objects.elements.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementDecorator;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementLocatorFactory;

public class TopBar {

    private WebDriver driver;

    @FindBy(css = ".c24-meinkonto-reflink")
    private HtmlElement profileLink;

    @FindBy(css = ".c24-nav-travel a")
    private HtmlElement travelSectionLink;

    public TopBar(WebDriver driver) {
        PageFactory.initElements(new HtmlElementDecorator(new HtmlElementLocatorFactory(driver)), this);
        this.driver = driver;
    }

    public HtmlElement getProfileLink() {
        return profileLink;
    }

    public HtmlElement getTravelSectionLink() {
        return travelSectionLink;
    }

}
