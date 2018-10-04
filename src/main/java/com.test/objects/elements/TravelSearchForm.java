package com.test.objects.elements;

import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.HtmlElement;

import java.util.List;

@FindBy(css = ".c24-travel-searchform")
public class TravelSearchForm extends HtmlElement {

    @FindBy(css = "#c24-travel-js-fake-destination-input")
    private HtmlElement simpleDestinationField;

    @FindBy(css = "[name='destination']")
    private HtmlElement destinationField;

    @FindBy(css = "[name='airport-element']")
    private HtmlElement departureField;

    @FindBy(css = "[name='departureDate']")
    private HtmlElement startDateField;

    @FindBy(css = "[name='returnDate']")
    private HtmlElement endDateField;

    @FindBy(css = "[name='travelDuration']")
    private HtmlElement durationDropDown;

    @FindBy(css = "[name='searchButton']")
    private HtmlElement searchButton;

    @FindBy(css = "[type='radio'][value='exact']")
    private HtmlElement exactDateValue;

    @FindBy(css = "[type='radio'][value='1w']")
    private HtmlElement oneWeekValue;

    @FindBy(css = "[type='radio'][value='2w']")
    private HtmlElement twoWeeksValue;

    @FindBy(css = "[type='radio'][value='5-8']")
    private HtmlElement fiveToEightValue;

    @FindBy(css = "[type='radio'][value='9-12']")
    private HtmlElement nineToTwelveValue;

    @FindBy(css = "[type='radio'][value='10']")
    private HtmlElement tenValue;

    @FindBy(css = "[name='custom-duration']")
    private HtmlElement customValueField;

    public HtmlElement getExactDateValue() {
        return exactDateValue;
    }

    public HtmlElement getOneWeekValue() {
        return oneWeekValue;
    }

    public HtmlElement getTwoWeeksValue() {
        return twoWeeksValue;
    }

    public HtmlElement getFiveToEightValue() {
        return fiveToEightValue;
    }

    public HtmlElement getNineToTwelveValue() {
        return nineToTwelveValue;
    }

    public HtmlElement getTenValue() {
        return tenValue;
    }

    public HtmlElement getCustomValueField() {
        return customValueField;
    }

    public HtmlElement getDestinationField() {
        return destinationField;
    }

    public HtmlElement getDepartureField() {
        return departureField;
    }

    public HtmlElement getStartDateField() {
        return startDateField;
    }

    public HtmlElement getEndDateField() {
        return endDateField;
    }

    public HtmlElement getDurationDropDown() {
        return durationDropDown;
    }

    public HtmlElement getSimpleDestinationField() {
        return simpleDestinationField;
    }

    public HtmlElement getSearchButton() {
        return searchButton;
    }
}
