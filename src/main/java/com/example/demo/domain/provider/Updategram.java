package com.example.demo.domain.provider;

import com.example.demo.domain.provider.integration.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Updategram {
    @JsonProperty("Header")
    private Header header;
    @JsonProperty("Fixture")
    private Fixture fixture;
    @JsonProperty("MarketSet")
    private MarketSet marketSet;
    @JsonProperty("ResultSet")
    private ResultSet resultSet;
    @JsonProperty("Coverage")
    private Coverage coverage;

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public Fixture getFixture() {
        return fixture;
    }

    public void setFixture(Fixture fixture) {
        this.fixture = fixture;
    }

    public MarketSet getMarketSet() {
        return marketSet;
    }

    public void setMarketSet(MarketSet marketSet) {
        this.marketSet = marketSet;
    }

    public ResultSet getResultSet() {
        return resultSet;
    }

    public void setResultSet(ResultSet resultSet) {
        this.resultSet = resultSet;
    }

    public Coverage getCoverage() {
        return coverage;
    }

    public void setCoverage(Coverage coverage) {
        this.coverage = coverage;
    }
}
