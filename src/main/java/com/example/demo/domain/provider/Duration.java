package com.example.demo.domain.provider;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Duration {
    private java.time.Duration duration;

    public Duration(String string) {
        LocalTime time = LocalTime.parse(string);
        this.duration = java.time.Duration.ofSeconds(time.toSecondOfDay());
    }

    public Duration(java.time.Duration duration) {
        this.duration = duration;
    }

    public long getSeconds() {
        return duration.getSeconds();
    }

    @JsonCreator
    public Duration fromString(String string) {
        LocalTime time = LocalTime.parse(string);
        java.time.Duration duration = java.time.Duration.ofSeconds(time.toSecondOfDay());
        return new Duration(duration);
    }

    @JsonValue
    @Override
    public String toString() {
        LocalTime time = LocalTime.ofSecondOfDay(duration.getSeconds());
        return time.format(DateTimeFormatter.ISO_LOCAL_TIME);
    }

    public static Duration ofSeconds(int i) {
        return new Duration(java.time.Duration.ofSeconds(i));
    }
}
