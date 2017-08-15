package com.example.demo.domain.provider.integration;

import com.fasterxml.jackson.annotation.JsonValue;

public enum HomeAway {
    HOME("Home"),
    AWAY("Away");
    private final String value;

    HomeAway(String v) {
        value = v;
    }

    public static HomeAway fromValue(String v) {
        for (HomeAway status : HomeAway.values()) {
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
