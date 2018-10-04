package com.test.objects.elements;

import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.HtmlElement;

import java.util.List;

@FindBy(css = ".hotel-list-and-loader")
public class HotelOptionsList extends HtmlElement {

    @FindBy(css = "ul.hotel-list-offer-cnt")
    private List<HtmlElement> hotelOptions;

    public List<HtmlElement> getHotelOptions() {
        return hotelOptions;
    }
}
