package com.test.objects.steps;

import com.test.objects.elements.common.CookiesBar;
import com.test.objects.elements.common.TopBar;
import com.test.objects.pages.AuthPage;
import com.test.objects.pages.UserAccountPage;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;

public class AuthSteps extends DriverSteps {

    private static final String DEFAULT_LOGIN = "test123.challenge@mailinator.com";
    private static final String DEFAULT_PASSWORD = "P@ssw0rd";

    private TopBar topBar;
    private CookiesBar cookiesBar;
    private AuthPage authPage;
    private UserAccountPage userAccountPage;

    public AuthSteps(WebDriver driver) {
        super(driver);
        this.authPage = new AuthPage(driver);
        this.userAccountPage = new UserAccountPage(driver);
        this.topBar = new TopBar(driver);
        this.cookiesBar = new CookiesBar(driver);
    }

    public void operMainPage() {
        authPage.open();
    }

    private void fillLoginForm(String user, String password) {
        this.authPage.getAuthForm().getEmailField().sendKeys(user);
        this.authPage.getAuthForm().getPasswordField().sendKeys(password);
        this.authPage.getAuthForm().getSubmitButton().click();
    }

    public void loginAsDefaultUser() {
        waitForVisible(this.topBar.getProfileLink());
        this.topBar.getProfileLink().click();

        waitForVisible(this.authPage.getAuthForm());
        fillLoginForm(DEFAULT_LOGIN, DEFAULT_PASSWORD);

        checkWeAreOnUsersPage();
    }

    public void signUp() {
        waitForVisible(this.topBar.getProfileLink());
        this.topBar.getProfileLink().click();

        waitForVisible(this.authPage.getAuthForm());
        this.authPage.getAuthForm().getGoToSignUp().click();

        waitForVisible(this.authPage.getAuthForm());

        if(cookiesBar.getAcceptCookiesButton().isDisplayed()) {
            cookiesBar.getAcceptCookiesButton().click();
        }
        this.authPage.getAuthForm().getEmailField().sendKeys(DEFAULT_LOGIN);
        this.authPage.getAuthForm().getPasswordField().sendKeys(DEFAULT_PASSWORD);
        this.authPage.getAuthForm().getPasswordRepeatField().sendKeys(DEFAULT_PASSWORD);
        this.authPage.getAuthForm().getSubmitButton().click();

        checkWeAreOnUsersPage();

    }

    public void checkWeAreOnUsersPage() {
        waitFor();
        assertTrue("We are not on user's page", this.userAccountPage.checkWeAreHere());
    }
}
