package com.test.objects.elements.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementDecorator;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementLocatorFactory;


public class Dialog {

    WebDriver driver;

    @FindBy(css = "#c24-dialog-points-modal")
    private HtmlElement dialogBox;

    @FindBy(css = "#c24-dialog-points-modal .dialog-box-close")
    private HtmlElement closeButton;

    public Dialog(WebDriver driver) {
        PageFactory.initElements(new HtmlElementDecorator(new HtmlElementLocatorFactory(driver)), this);
        this.driver = driver;
    }

    public HtmlElement getDialogBox() {
        return dialogBox;
    }

    public HtmlElement getCloseButton() {
        return closeButton;
    }
}
