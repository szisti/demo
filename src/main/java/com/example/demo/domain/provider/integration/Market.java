package com.example.demo.domain.provider.integration;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.joda.time.DateTime;

import java.math.BigDecimal;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Market {
    @JsonProperty("Id")
    private int id;
    @JsonProperty("Sequence")
    private Integer sequence;
    @JsonProperty("TradingStatus")
    private MarketStatus tradingStatus;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("ExpiryUtc")
    private DateTime expiryUtc;
    @JsonProperty("Handicap")
    private BigDecimal handicap;
    @JsonProperty("MarketType")
    private MarketType marketType;
    @JsonProperty("InPlay")
    private boolean inPlay;
    @JsonProperty("Selections")
    private List<Selection> selections;
    @JsonProperty("ExternalId")
    private String externalId;
    @JsonProperty("CashOutStatus")
    private CashOutStatus cashOutStatus;
    @JsonProperty("EachWayTerm")
    private EachWayTerm eachWayTerm;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public MarketStatus getTradingStatus() {
        return tradingStatus;
    }

    public void setTradingStatus(MarketStatus tradingStatus) {
        this.tradingStatus = tradingStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DateTime getExpiryUtc() {
        return expiryUtc;
    }

    public void setExpiryUtc(DateTime expiryUtc) {
        this.expiryUtc = expiryUtc;
    }

    public BigDecimal getHandicap() {
        return handicap;
    }

    public void setHandicap(BigDecimal handicap) {
        this.handicap = handicap;
    }

    public MarketType getMarketType() {
        return marketType;
    }

    public void setMarketType(MarketType marketType) {
        this.marketType = marketType;
    }

    public boolean isInPlay() {
        return inPlay;
    }

    public void setInPlay(boolean inPlay) {
        this.inPlay = inPlay;
    }

    public List<Selection> getSelections() {
        return selections;
    }

    public void setSelections(List<Selection> selections) {
        this.selections = selections;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public CashOutStatus getCashOutStatus() {
        return cashOutStatus;
    }

    public void setCashOutStatus(CashOutStatus cashOutStatus) {
        this.cashOutStatus = cashOutStatus;
    }

    public EachWayTerm getEachWayTerm() {
        return eachWayTerm;
    }

    public void setEachWayTerm(EachWayTerm eachWayTerm) {
        this.eachWayTerm = eachWayTerm;
    }
}
