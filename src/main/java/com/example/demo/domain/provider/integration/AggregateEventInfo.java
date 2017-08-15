package com.example.demo.domain.provider.integration;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AggregateEventInfo {
    @JsonProperty("CurrentHomeTeamFirstLegScore")
    private Integer currentHomeTeamFirstLegScore;
    @JsonProperty("CurrentAwayTeamFirstLegScore")
    private Integer currentAwayTeamFirstLegScore;

    public Integer getCurrentHomeTeamFirstLegScore() {
        return currentHomeTeamFirstLegScore;
    }

    public void setCurrentHomeTeamFirstLegScore(Integer currentHomeTeamFirstLegScore) {
        this.currentHomeTeamFirstLegScore = currentHomeTeamFirstLegScore;
    }

    public Integer getCurrentAwayTeamFirstLegScore() {
        return currentAwayTeamFirstLegScore;
    }

    public void setCurrentAwayTeamFirstLegScore(Integer currentAwayTeamFirstLegScore) {
        this.currentAwayTeamFirstLegScore = currentAwayTeamFirstLegScore;
    }
}
