package com.test.objects.pages;

import com.test.objects.elements.HotelOptionsList;
import com.test.objects.elements.TravelSearchForm;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.HtmlElement;

public class TravelPage extends BasicPage {

    private TravelSearchForm travelSearchForm;
    private HotelOptionsList hotelOptionsList;

    @FindBy(css = ".c24-travel-regionfilter-item")
    private HtmlElement regionOptions;

    public TravelPage(WebDriver driver) {
        super(driver);
    }

    public TravelSearchForm getTravelSearchForm() {
        return travelSearchForm;
    }

    public HotelOptionsList getHotelOptionsList() {
        return hotelOptionsList;
    }

    public HtmlElement getRegionOptions() {
        return regionOptions;
    }

    @Override
    public String getPath() {
        return "suche/hotel";
    }
}
