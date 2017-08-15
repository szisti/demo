package com.example.demo.domain.provider.integration;

import com.fasterxml.jackson.annotation.JsonValue;

public enum CourtSurface {
    UNSET("Unset"),
    CLAY("Clay"),
    GRASS("Grass"),
    HARD("Hard"),
    CARPET("Carpet"),
    WOOD("Wood");
    private final String value;

    CourtSurface(String v) {
        value = v;
    }

    public static CourtSurface fromValue(String v) {
        for (CourtSurface status : CourtSurface.values()) {
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
