package com.example.demo.domain.provider.integration;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FootballExtraTimeProperties {
    @JsonProperty("IsExtraTime")
    private Boolean isExtraTime;
    @JsonProperty("IsSecondLeg")
    private Boolean isSecondLeg;
    @JsonProperty("FirstLegId")
    private Integer firstLegId;
    @JsonProperty("GoesStraightToPenalties")
    private Boolean goesStraightToPenalties;
    @JsonProperty("AwayGoalsAfterNormalTime")
    private Boolean awayGoalsAfterNormalTime;
    @JsonProperty("AwayGoalsAfterExtraTime")
    private Boolean awayGoalsAfterExtraTime;

    public Boolean getExtraTime() {
        return isExtraTime;
    }

    public void setExtraTime(Boolean extraTime) {
        isExtraTime = extraTime;
    }

    public Boolean getSecondLeg() {
        return isSecondLeg;
    }

    public void setSecondLeg(Boolean secondLeg) {
        isSecondLeg = secondLeg;
    }

    public Integer getFirstLegId() {
        return firstLegId;
    }

    public void setFirstLegId(Integer firstLegId) {
        this.firstLegId = firstLegId;
    }

    public Boolean getGoesStraightToPenalties() {
        return goesStraightToPenalties;
    }

    public void setGoesStraightToPenalties(Boolean goesStraightToPenalties) {
        this.goesStraightToPenalties = goesStraightToPenalties;
    }

    public Boolean getAwayGoalsAfterNormalTime() {
        return awayGoalsAfterNormalTime;
    }

    public void setAwayGoalsAfterNormalTime(Boolean awayGoalsAfterNormalTime) {
        this.awayGoalsAfterNormalTime = awayGoalsAfterNormalTime;
    }

    public Boolean getAwayGoalsAfterExtraTime() {
        return awayGoalsAfterExtraTime;
    }

    public void setAwayGoalsAfterExtraTime(Boolean awayGoalsAfterExtraTime) {
        this.awayGoalsAfterExtraTime = awayGoalsAfterExtraTime;
    }
}
