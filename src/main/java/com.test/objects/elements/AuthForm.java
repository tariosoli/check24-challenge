package com.test.objects.elements;

import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.HtmlElement;

@FindBy(css = ".c24-kb-content-box")
public class AuthForm extends HtmlElement {

    @FindBy(css = "#email")
    private HtmlElement emailField;

    @FindBy(css = "#password")
    private HtmlElement passwordField;

    @FindBy(css = "#passwordrepetition")
    private HtmlElement passwordRepeatField;

    @FindBy(css = ".c24-button")
    private HtmlElement submitButton;

    @FindBy(css = "#new_customer")
    private HtmlElement goToSignUp;

    public HtmlElement getEmailField() {
        return emailField;
    }

    public HtmlElement getPasswordField() {
        return passwordField;
    }

    public HtmlElement getPasswordRepeatField() {
        return passwordRepeatField;
    }

    public HtmlElement getSubmitButton() {
        return submitButton;
    }

    public HtmlElement getGoToSignUp() {
        return goToSignUp;
    }
}
