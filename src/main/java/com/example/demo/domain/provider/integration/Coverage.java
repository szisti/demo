package com.example.demo.domain.provider.integration;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Coverage {
    @JsonProperty("FixtureId")
    private int fixtureId;
    @JsonProperty("ExternalFixtureId")
    private String externalFixtureId;
    @JsonProperty("IsBooked")
    private boolean isBooked;
    @JsonProperty("AvailableFeeds")
    private List<Feed> availableFeeds;

    public int getFixtureId() {
        return fixtureId;
    }

    public void setFixtureId(int fixtureId) {
        this.fixtureId = fixtureId;
    }

    public String getExternalFixtureId() {
        return externalFixtureId;
    }

    public void setExternalFixtureId(String externalFixtureId) {
        this.externalFixtureId = externalFixtureId;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }

    public List<Feed> getAvailableFeeds() {
        return availableFeeds;
    }

    public void setAvailableFeeds(List<Feed> availableFeeds) {
        this.availableFeeds = availableFeeds;
    }
}
