package com.example.demo.domain.provider.integration;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class AdditionalResultData {
    @JsonProperty("PercentageWin")
    private BigDecimal percentageWin;
    @JsonProperty("PercentagePush")
    private BigDecimal percentagePush;
    @JsonProperty("Place")
    private int place;
    @JsonProperty("CountInPlace")
    private int countInPlace;

    public BigDecimal getPercentageWin() {
        return percentageWin;
    }

    public void setPercentageWin(BigDecimal percentageWin) {
        this.percentageWin = percentageWin;
    }

    public BigDecimal getPercentagePush() {
        return percentagePush;
    }

    public void setPercentagePush(BigDecimal percentagePush) {
        this.percentagePush = percentagePush;
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public int getCountInPlace() {
        return countInPlace;
    }

    public void setCountInPlace(int countInPlace) {
        this.countInPlace = countInPlace;
    }
}
