package com.example.demo.domain.provider.integration;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Competitor {
    @JsonProperty("Id")
    private int id;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("HomeAway")
    private HomeAway homeAway;
    @JsonProperty("Competitors")
    private List<Competitor> competitors;
    @JsonProperty("FirstName")
    private String firstName;
    @JsonProperty("LastName")
    private String lastName;
    @JsonProperty("SquadNumber")
    private String squadNumber;
    @JsonProperty("Position")
    private String position;
    @JsonProperty("Gender")
    private Gender gender;
    @JsonProperty("AgeCategory")
    private String ageCategory;
    @JsonProperty("CompetitorType")
    private CompetitorType competitorType;
    @JsonProperty("ShirtPrimary")
    private String shirtPrimary;
    @JsonProperty("ShirtSecondary")
    private String shirtSecondary;
    @JsonProperty("ExternalId")
    private String externalId;

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

    public HomeAway getHomeAway() {
        return homeAway;
    }

    public void setHomeAway(HomeAway homeAway) {
        this.homeAway = homeAway;
    }

    public List<Competitor> getCompetitors() {
        return competitors;
    }

    public void setCompetitors(List<Competitor> competitors) {
        this.competitors = competitors;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSquadNumber() {
        return squadNumber;
    }

    public void setSquadNumber(String squadNumber) {
        this.squadNumber = squadNumber;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getAgeCategory() {
        return ageCategory;
    }

    public void setAgeCategory(String ageCategory) {
        this.ageCategory = ageCategory;
    }

    public CompetitorType getCompetitorType() {
        return competitorType;
    }

    public void setCompetitorType(CompetitorType competitorType) {
        this.competitorType = competitorType;
    }

    public String getShirtPrimary() {
        return shirtPrimary;
    }

    public void setShirtPrimary(String shirtPrimary) {
        this.shirtPrimary = shirtPrimary;
    }

    public String getShirtSecondary() {
        return shirtSecondary;
    }

    public void setShirtSecondary(String shirtSecondary) {
        this.shirtSecondary = shirtSecondary;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }
}
