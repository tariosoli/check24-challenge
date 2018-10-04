package com.test.objects.pages;

import com.test.objects.elements.AuthForm;
import org.openqa.selenium.WebDriver;

public class AuthPage extends BasicPage{

    private AuthForm authForm;

    public AuthPage(WebDriver driver) {
        super(driver);
    }

    public AuthForm getAuthForm() {
        return authForm;
    }

    @Override
    public String getPath() {
        return "/";
    }
}
