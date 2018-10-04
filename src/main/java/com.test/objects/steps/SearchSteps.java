package com.test.objects.steps;

import com.test.objects.elements.common.Dialog;
import com.test.objects.elements.common.TopBar;
import com.test.objects.elements.data.TravelSearchData;
import com.test.objects.pages.TravelPage;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertFalse;

public class SearchSteps extends DriverSteps {

    private TravelSearchData travelSearchData = new TravelSearchData()
            .setDeparture("Berlin")
            .setDestination("Paris")
            .setStartDate("01.01.19")
            .setEndDate("10.01.19")
            .setDuration(TravelSearchData.Duration.EXACT);

    private TopBar topBar;
    private Dialog dialog;
    private TravelPage travelPage;

    public SearchSteps(WebDriver driver) {
        super(driver);
        this.topBar = new TopBar(driver);
        this.dialog = new Dialog(driver);
        this.travelPage = new TravelPage(driver);
    }

    public void goToTravelSection() {
        if(dialog.getDialogBox().isDisplayed()) {
            dialog.getCloseButton().click();
        }
        waitForClickable(this.topBar.getTravelSectionLink());
        this.topBar.getTravelSectionLink().click();
    }

    private void fillComplexSearchForm(TravelSearchData data) {
        if (!data.getDestination().isEmpty()) {
            travelPage.getTravelSearchForm().getDestinationField().click();
            travelPage.getTravelSearchForm().getDestinationField().sendKeys(data.getDestination());
            waitForVisible(travelPage.getRegionOptions());
        }
        if (!data.getDeparture().isEmpty()) {
            travelPage.getTravelSearchForm().getDepartureField().click();
            travelPage.getTravelSearchForm().getDepartureField().sendKeys(data.getDeparture());
        }
        if (!data.getStartDate().isEmpty()) {
            travelPage.getTravelSearchForm().getStartDateField().click();
            travelPage.getTravelSearchForm().getStartDateField().sendKeys(data.getStartDate());
        }
        if (!data.getEndDate().isEmpty()) {
            travelPage.getTravelSearchForm().getEndDateField().click();
            travelPage.getTravelSearchForm().getEndDateField().sendKeys(data.getEndDate());
        }

        travelPage.getTravelSearchForm().getDurationDropDown().click();
        switch (data.getDuration()) {
            case EXACT:
                travelPage.getTravelSearchForm().getExactDateValue().click();
                break;
            case ONE_WEEK:
                travelPage.getTravelSearchForm().getOneWeekValue().click();
                break;
            case TWO_WEEKS:
                travelPage.getTravelSearchForm().getTwoWeeksValue().click();
                break;
            case NINE_TO_TWELVE:
                travelPage.getTravelSearchForm().getNineToTwelveValue().click();
                break;
            case FIVE_TO_EIGHT:
                travelPage.getTravelSearchForm().getFiveToEightValue().click();
                break;
            case TEN:
                travelPage.getTravelSearchForm().getTenValue().click();
                break;
            default:
                travelPage.getTravelSearchForm().getCustomValueField().sendKeys("10");
                break;
        }

    }

    public void putSearchData() {

        if(travelPage.getTravelSearchForm().getSimpleDestinationField().isDisplayed()) {
            travelPage.getTravelSearchForm().getSimpleDestinationField().click();
            travelPage.getTravelSearchForm().getSimpleDestinationField().sendKeys(travelSearchData.getDestination());

            waitForVisible(travelPage.getRegionOptions());

            travelPage.getTravelSearchForm().getDepartureField().click();
            travelPage.getTravelSearchForm().getDepartureField().sendKeys(travelSearchData.getDeparture());
        } else {
            fillComplexSearchForm(travelSearchData);
        }

        travelPage.getTravelSearchForm().getSearchButton().click();
    }

    public void checkHotelOptionsPresented() {
        waitFor();
        assertFalse("There are no hotel options displayed", travelPage.getHotelOptionsList().getHotelOptions().isEmpty());
    }

}
