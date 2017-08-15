package com.example.demo.domain.provider.integration;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ResultSet {
    @JsonProperty("FixtureId")
    protected int fixtureId;
    @JsonProperty("Results")
    private List<MarketResult> marketResult;

    public int getFixtureId() {
        return fixtureId;
    }

    public void setFixtureId(int fixtureId) {
        this.fixtureId = fixtureId;
    }

    public List<MarketResult> getMarketResult() {
        return marketResult;
    }

    public void setMarketResult(List<MarketResult> marketResult) {
        this.marketResult = marketResult;
    }
}
