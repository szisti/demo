package com.example.demo.domain.provider.integration;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ResultStatus {
    NONE("None"),
    WINNER("Winner"),
    PUSHED("Pushed"),
    LOSER("Loser"),
    PLACED("Placed"),
    PARTIAL("Partial");
    private final String value;

    ResultStatus(String v) {
        value = v;
    }

    public static ResultStatus fromValue(String v) {
        for (ResultStatus status : ResultStatus.values()) {
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
