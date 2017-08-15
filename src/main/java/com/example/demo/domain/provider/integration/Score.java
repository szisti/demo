package com.example.demo.domain.provider.integration;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Score {
    @JsonProperty("First")
    private int first;
    @JsonProperty("Second")
    private int second;

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
}
