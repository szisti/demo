package com.example.demo.domain.provider.integration;

import com.fasterxml.jackson.annotation.JsonValue;

public enum CashOutStatus {
    OPEN("Open"),
    SUSPENDED("Suspended"),
    CLOSED("Closed");
    private final String value;

    CashOutStatus(String v) {
        value = v;
    }

    public static CashOutStatus fromValue(String v) {
        for (CashOutStatus status : CashOutStatus.values()) {
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
