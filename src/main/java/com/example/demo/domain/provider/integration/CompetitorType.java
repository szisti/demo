package com.example.demo.domain.provider.integration;

import com.fasterxml.jackson.annotation.JsonValue;

public enum CompetitorType {
    NOT_SPECIFIED("NotSpecified"),
    OTHER("Other"),
    PERSON("Person"),
    TEAM("Team"),
    DOUBLES_PARTNERSHIP("DoublesPartnership"),
    ABSTRACT("Abstract"),
    HORSE("Horse"),
    JOCKEY("Jockey"),
    TRAINER("Trainer"),
    HORSE_OWNER("HorseOwner"),
    DOG("Dog");
    private final String value;

    CompetitorType(String v) {
        value = v;
    }

    public static CompetitorType fromValue(String v) {
        for (CompetitorType status : CompetitorType.values()) {
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
