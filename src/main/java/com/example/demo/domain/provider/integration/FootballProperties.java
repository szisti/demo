package com.example.demo.domain.provider.integration;

import com.example.demo.domain.provider.Duration;
import com.fasterxml.jackson.annotation.JsonProperty;

public class FootballProperties {
    @JsonProperty("ExtraTimeProperties")
    private FootballExtraTimeProperties extraTimeProperties;
    @JsonProperty("MatchDuration")
    private Duration matchDuration;
    @JsonProperty("ExtraTimeDuration")
    private Duration extraTimeDuration;

    public FootballExtraTimeProperties getExtraTimeProperties() {
        return extraTimeProperties;
    }

    public void setExtraTimeProperties(FootballExtraTimeProperties extraTimeProperties) {
        this.extraTimeProperties = extraTimeProperties;
    }

    public Duration getMatchDuration() {
        return matchDuration;
    }

    public void setMatchDuration(Duration matchDuration) {
        this.matchDuration = matchDuration;
    }

    public Duration getExtraTimeDuration() {
        return extraTimeDuration;
    }

    public void setExtraTimeDuration(Duration extraTimeDuration) {
        this.extraTimeDuration = extraTimeDuration;
    }
}
