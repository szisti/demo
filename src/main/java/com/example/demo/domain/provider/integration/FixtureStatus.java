package com.example.demo.domain.provider.integration;

import com.fasterxml.jackson.annotation.JsonValue;

public enum FixtureStatus {
    UNKNOWN_STATUS("UnknownStatus"),
    SCHEDULED("Scheduled"),
    UNSCHEDULED("Unscheduled"),
    POSTPONED("Postponed"),
    CANCELLED("Cancelled"),
    DELETED("Deleted");
    private final String value;

    FixtureStatus(String v) {
        value = v;
    }

    public static FixtureStatus fromValue(String v) {
        for (FixtureStatus status : FixtureStatus.values()) {
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
