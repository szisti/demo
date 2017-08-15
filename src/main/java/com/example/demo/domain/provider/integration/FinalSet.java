package com.example.demo.domain.provider.integration;

import com.fasterxml.jackson.annotation.JsonValue;

public enum FinalSet {
    UNSET("Unset"),
    TIE_BREAK("TieBreak"),
    ADVANTAGE("Advantage"),
    MATCH_TIE_BREAK("MatchTieBreak");
    private final String value;

    FinalSet(String v) {
        value = v;
    }

    public static FinalSet fromValue(String v) {
        for (FinalSet status : FinalSet.values()) {
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
