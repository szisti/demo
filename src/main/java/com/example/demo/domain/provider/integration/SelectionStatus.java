package com.example.demo.domain.provider.integration;

import com.fasterxml.jackson.annotation.JsonValue;

public enum SelectionStatus {
    UNPRICED("Unpriced"),
    TRADING("Trading"),
    SUSPENDED("Suspended"),
    NON_RUNNER("NonRunner");
    private final String value;

    SelectionStatus(String v) {
        value = v;
    }

    public static SelectionStatus fromValue(String v) {
        for (SelectionStatus status : SelectionStatus.values()) {
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
