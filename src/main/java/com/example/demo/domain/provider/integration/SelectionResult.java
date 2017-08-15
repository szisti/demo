package com.example.demo.domain.provider.integration;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SelectionResult {
    @JsonProperty("SelectionId")
    private int selectionId;
    @JsonProperty("ResultStatus")
    private ResultStatus resultStatus;
    @JsonProperty("AdditionalResultData")
    private AdditionalResultData additionalResultData;

    public int getSelectionId() {
        return selectionId;
    }

    public void setSelectionId(int selectionId) {
        this.selectionId = selectionId;
    }

    public ResultStatus getResultStatus() {
        return resultStatus;
    }

    public void setResultStatus(ResultStatus resultStatus) {
        this.resultStatus = resultStatus;
    }

    public AdditionalResultData getAdditionalResultData() {
        return additionalResultData;
    }

    public void setAdditionalResultData(AdditionalResultData additionalResultData) {
        this.additionalResultData = additionalResultData;
    }
}
