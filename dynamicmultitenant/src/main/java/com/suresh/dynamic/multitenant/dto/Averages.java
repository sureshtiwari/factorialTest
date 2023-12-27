package com.suresh.dynamic.multitenant.dto;

public class Averages {


    Double minuteAverage;
    Double hourAverage;
    Double dayAverage;

    public Averages(Double minuteAverage, Double hourAverage, Double dayAverage)
    {
        this.dayAverage = dayAverage;
        this.minuteAverage = minuteAverage;
        this.hourAverage = hourAverage;
    }

    public Double getMinuteAverage() {
        return minuteAverage;
    }

    public Double getHourAverage() {
        return hourAverage;
    }

    public Double getDayAverage() {
        return dayAverage;
    }

    public void setMinuteAverage(Double minuteAverage) {
        this.minuteAverage = minuteAverage;
    }

    public void setHourAverage(Double hourAverage) {
        this.hourAverage = hourAverage;
    }

    public void setDayAverage(Double dayAverage) {
        this.dayAverage = dayAverage;
    }


}
