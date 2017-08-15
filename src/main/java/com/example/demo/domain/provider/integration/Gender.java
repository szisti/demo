package com.example.demo.domain.provider.integration;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Gender {
    MALE("Male"),
    FEMALE("Female"),
    MIXED("Mixed");
    private final String value;

    Gender(String v) {
        value = v;
    }

    public static Gender fromValue(String v) {
        for (Gender status : Gender.values()) {
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
