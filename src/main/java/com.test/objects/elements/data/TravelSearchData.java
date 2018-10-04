package com.test.objects.elements.data;

public class TravelSearchData {

    private String destination;
    private String departure;
    private String startDate;
    private String endDate;
    private Duration duration;

    public enum Duration {
        EXACT,
        ONE_WEEK,
        TWO_WEEKS,
        FIVE_TO_EIGHT,
        NINE_TO_TWELVE,
        TEN;
    }

    public String getDestination() {
        return destination;
    }

    public TravelSearchData setDestination(String destination) {
        this.destination = destination;
        return this;
    }

    public String getDeparture() {
        return departure;
    }

    public TravelSearchData setDeparture(String departure) {
        this.departure = departure;
        return this;
    }

    public String getStartDate() {
        return startDate;
    }

    public TravelSearchData setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    public String getEndDate() {
        return endDate;
    }

    public TravelSearchData setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    public Duration getDuration() {
        return duration;
    }

    public TravelSearchData setDuration(Duration duration) {
        this.duration = duration;
        return this;
    }
}
