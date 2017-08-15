package com.example.demo.domain.provider.integration;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BasketballProperties {
    @JsonProperty("BasketballAssociation")
    private String basketballAssociation;

    public String getBasketballAssociation() {
        return basketballAssociation;
    }

    public void setBasketballAssociation(String basketballAssociation) {
        this.basketballAssociation = basketballAssociation;
    }
}
