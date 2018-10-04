package com.test;

import org.junit.Test;

public class SearchTest extends BasicTest {

    @Test
    public void registerNewUser() {
        authSteps.operMainPage();
        authSteps.loginAsDefaultUser();
        searchSteps.goToTravelSection();
        searchSteps.putSearchData();
        searchSteps.checkHotelOptionsPresented();
    }
}
