package com.test.objects.pages;

import org.openqa.selenium.WebDriver;

public class UserAccountPage extends BasicPage {

    public UserAccountPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public String getPath() {
        return "/user/account";
    }
}
