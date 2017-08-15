package com.example.demo.domain.provider.integration;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TennisProperties {
    @JsonProperty("NumberOfSets")
    private int numberOfSets;
    @JsonProperty("FinalSet")
    private FinalSet finalSet;
    @JsonProperty("ScoringSystemForServiceGames")
    private ScoringSystemForServiceGames scoringSystemForServiceGames;
    @JsonProperty("CourtSurface")
    private CourtSurface courtSurface;

    public int getNumberOfSets() {
        return numberOfSets;
    }

    public void setNumberOfSets(int numberOfSets) {
        this.numberOfSets = numberOfSets;
    }

    public FinalSet getFinalSet() {
        return finalSet;
    }

    public void setFinalSet(FinalSet finalSet) {
        this.finalSet = finalSet;
    }

    public ScoringSystemForServiceGames getScoringSystemForServiceGames() {
        return scoringSystemForServiceGames;
    }

    public void setScoringSystemForServiceGames(ScoringSystemForServiceGames scoringSystemForServiceGames) {
        this.scoringSystemForServiceGames = scoringSystemForServiceGames;
    }

    public CourtSurface getCourtSurface() {
        return courtSurface;
    }

    public void setCourtSurface(CourtSurface courtSurface) {
        this.courtSurface = courtSurface;
    }
}
