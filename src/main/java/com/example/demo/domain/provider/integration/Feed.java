package com.example.demo.domain.provider.integration;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Feed {
    @JsonProperty("Type")
    private String type;
    @JsonProperty("IsLicensed")
    private boolean isLicensed;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isLicensed() {
        return isLicensed;
    }

    public void setLicensed(boolean licensed) {
        isLicensed = licensed;
    }
}
