package com.example.demo.domain.provider.integration;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.joda.time.DateTime;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Header {

    @JsonProperty("MessageGuid")
    private String messageGuid;
    @JsonProperty("TimeStampUtc")
    private DateTime timeStampUtc;
    @JsonProperty("Retry")
    private int retry;
    @JsonProperty("ChannelId")
    private String channelId;
    @JsonProperty("MessageFixtureOrder")
    private Integer messageFixtureOrder;

    public String getMessageGuid() {
        return messageGuid;
    }

    public void setMessageGuid(String value) {
        this.messageGuid = value;
    }

    public DateTime getTimeStampUtc() {
        return timeStampUtc;
    }

    public void setTimeStampUtc(DateTime value) {
        this.timeStampUtc = value;
    }

    public int getRetry() {
        return retry;
    }

    public void setRetry(int value) {
        this.retry = value;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String value) {
        this.channelId = value;
    }

    public Integer getMessageFixtureOrder() {
        return messageFixtureOrder;
    }

    public void setMessageFixtureOrder(Integer value) {
        this.messageFixtureOrder = value;
    }

}
