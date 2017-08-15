package com.example.demo.domain.provider.integration;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class MarketResult {
    @JsonProperty("MarketId")
    private int marketId;
    @JsonProperty("MarketSequence")
    private Integer marketSequence;
    @JsonProperty("Results")
    private List<SelectionResult> results;
    @JsonProperty("MarketResultScore")
    private Score marketResultScore;

    public int getMarketId() {
        return marketId;
    }

    public void setMarketId(int marketId) {
        this.marketId = marketId;
    }

    public Integer getMarketSequence() {
        return marketSequence;
    }

    public void setMarketSequence(Integer marketSequence) {
        this.marketSequence = marketSequence;
    }

    public List<SelectionResult> getResults() {
        return results;
    }

    public void setResults(List<SelectionResult> results) {
        this.results = results;
    }

    public Score getMarketResultScore() {
        return marketResultScore;
    }

    public void setMarketResultScore(Score marketResultScore) {
        this.marketResultScore = marketResultScore;
    }
}
