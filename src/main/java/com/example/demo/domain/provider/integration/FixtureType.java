package com.example.demo.domain.provider.integration;

import com.fasterxml.jackson.annotation.JsonValue;

public enum FixtureType {
    MATCH("Match"),
    OUTRIGHT("Outright"),
    AGGREGRATE("Aggregrate"),
    VIRTUAL("Virtual");
    private final String value;

    FixtureType(String v) {
        value = v;
    }

    public static FixtureType fromValue(String v) {
        for (FixtureType status : FixtureType.values()) {
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
