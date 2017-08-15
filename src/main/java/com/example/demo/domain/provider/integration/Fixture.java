package com.example.demo.domain.provider.integration;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.joda.time.DateTime;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Fixture {
    @JsonProperty("Id")
    private int id;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("FixtureType")
    private FixtureType fixtureType;
    @JsonProperty("Status")
    private FixtureStatus status;
    @JsonProperty("StartTimeUtc")
    private DateTime startTimeUtc;
    @JsonProperty("Sport")
    private Sport sport;
    @JsonProperty("Competition")
    private Competition competition;
    @JsonProperty("Season")
    private Season season;
    @JsonProperty("TourSeason")
    private Season tourSeason;
    @JsonProperty("Round")
    private Round round;
    @JsonProperty("Venue")
    private Venue venue;
    @JsonProperty("Competitors")
    private List<Competitor> competitors;
    @JsonProperty("AggregateEventInfo")
    private AggregateEventInfo aggregateEventInfo;
    @JsonProperty("ExternalId")
    private String externalId;
    @JsonProperty("ExternalIds")
    private List<ExternalId> externalIds;
    @JsonProperty("BasketballProperties")
    private BasketballProperties basketballProperties;
    @JsonProperty("FootballProperties")
    private FootballProperties footballProperties;
    @JsonProperty("TennisProperties")
    private TennisProperties tennisProperties;
    @JsonProperty("AssociationFixtureId")
    private String associationFixtureId;
    @JsonProperty("IsOff")
    private Boolean isOff;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FixtureType getFixtureType() {
        return fixtureType;
    }

    public void setFixtureType(FixtureType fixtureType) {
        this.fixtureType = fixtureType;
    }

    public FixtureStatus getStatus() {
        return status;
    }

    public void setStatus(FixtureStatus status) {
        this.status = status;
    }

    public DateTime getStartTimeUtc() {
        return startTimeUtc;
    }

    public void setStartTimeUtc(DateTime startTimeUtc) {
        this.startTimeUtc = startTimeUtc;
    }

    public Sport getSport() {
        return sport;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }

    public Competition getCompetition() {
        return competition;
    }

    public void setCompetition(Competition competition) {
        this.competition = competition;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    public Season getTourSeason() {
        return tourSeason;
    }

    public void setTourSeason(Season tourSeason) {
        this.tourSeason = tourSeason;
    }

    public Round getRound() {
        return round;
    }

    public void setRound(Round round) {
        this.round = round;
    }

    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    public List<Competitor> getCompetitors() {
        return competitors;
    }

    public void setCompetitors(List<Competitor> competitors) {
        this.competitors = competitors;
    }

    public AggregateEventInfo getAggregateEventInfo() {
        return aggregateEventInfo;
    }

    public void setAggregateEventInfo(AggregateEventInfo aggregateEventInfo) {
        this.aggregateEventInfo = aggregateEventInfo;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public List<ExternalId> getExternalIds() {
        return externalIds;
    }

    public void setExternalIds(List<ExternalId> externalIds) {
        this.externalIds = externalIds;
    }

    public BasketballProperties getBasketballProperties() {
        return basketballProperties;
    }

    public void setBasketballProperties(BasketballProperties basketballProperties) {
        this.basketballProperties = basketballProperties;
    }

    public FootballProperties getFootballProperties() {
        return footballProperties;
    }

    public void setFootballProperties(FootballProperties footballProperties) {
        this.footballProperties = footballProperties;
    }

    public TennisProperties getTennisProperties() {
        return tennisProperties;
    }

    public void setTennisProperties(TennisProperties tennisProperties) {
        this.tennisProperties = tennisProperties;
    }

    public String getAssociationFixtureId() {
        return associationFixtureId;
    }

    public void setAssociationFixtureId(String associationFixtureId) {
        this.associationFixtureId = associationFixtureId;
    }

    public Boolean getOff() {
        return isOff;
    }

    public void setOff(Boolean off) {
        isOff = off;
    }
}
