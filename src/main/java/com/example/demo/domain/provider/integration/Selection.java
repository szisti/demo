package com.example.demo.domain.provider.integration;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlSchemaType;
import java.math.BigDecimal;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Selection {
    @JsonProperty("Id")
    private int id;
    @JsonProperty("TradingStatus")
    @XmlSchemaType(name = "string")
    private SelectionStatus tradingStatus;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("CompetitorId")
    private Integer competitorId;
    @JsonProperty("Outcome")
    private Outcome outcome;
    @JsonProperty("Range")
    private Range range;
    @JsonProperty("Numerator")
    private int numerator;
    @JsonProperty("Denominator")
    private int denominator;
    @JsonProperty("Decimal")
    private BigDecimal decimal;
    @JsonProperty("ExternalId")
    private String externalId;
    @JsonProperty("Probability")
    private Double probability;
    @JsonProperty("RunnerNumber")
    private Integer runnerNumber;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public SelectionStatus getTradingStatus() {
        return tradingStatus;
    }

    public void setTradingStatus(SelectionStatus tradingStatus) {
        this.tradingStatus = tradingStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCompetitorId() {
        return competitorId;
    }

    public void setCompetitorId(Integer competitorId) {
        this.competitorId = competitorId;
    }

    public Outcome getOutcome() {
        return outcome;
    }

    public void setOutcome(Outcome outcome) {
        this.outcome = outcome;
    }

    public Range getRange() {
        return range;
    }

    public void setRange(Range range) {
        this.range = range;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public BigDecimal getDecimal() {
        return decimal;
    }

    public void setDecimal(BigDecimal decimal) {
        this.decimal = decimal;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public Double getProbability() {
        return probability;
    }

    public void setProbability(Double probability) {
        this.probability = probability;
    }

    public Integer getRunnerNumber() {
        return runnerNumber;
    }

    public void setRunnerNumber(Integer runnerNumber) {
        this.runnerNumber = runnerNumber;
    }
}
