package com.example.demo.domain.provider.integration;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ScoringSystemForServiceGames {
    UNSET("Unset"),
    NO_AD("NoAd"),
    STANDARD_ADVANTAGE("StandardAdvantage");
    private final String value;

    ScoringSystemForServiceGames(String v) {
        value = v;
    }

    public static ScoringSystemForServiceGames fromValue(String v) {
        for (ScoringSystemForServiceGames status : ScoringSystemForServiceGames.values()) {
            if (status.value.equals(v)) {
                return status;
            }
        }
        throw new IllegalArgumentException(v);
    }

    @JsonValue
    public String value() {
        return value;
    }
}
