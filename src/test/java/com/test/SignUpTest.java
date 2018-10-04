package com.test;

import org.junit.Test;

public class SignUpTest extends BasicTest {

    @Test
    public void signUp() {
        authSteps.operMainPage();
        authSteps.signUp();
    }
}
