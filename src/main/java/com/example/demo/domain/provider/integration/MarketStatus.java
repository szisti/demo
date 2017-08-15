package com.example.demo.domain.provider.integration;

import com.fasterxml.jackson.annotation.JsonValue;

public enum MarketStatus {
    OPEN("Open"),
    SUSPENDED("Suspended"),
    CLOSED("Closed");
    private final String value;

    MarketStatus(String v) {
        value = v;
    }

    public static MarketStatus fromValue(String v) {
        for (MarketStatus status : MarketStatus.values()) {
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
