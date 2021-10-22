package com.example.quanlythucung.domain.dto;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.Serializable;

public class Result implements Serializable {
    private static final long serialVersionUID = -2266940001135921108L;
    private boolean resultStatus;
    private Object resultData;

    public boolean isResultStatus() {
        return resultStatus;
    }

    public void setResultStatus( boolean resultStatus ) {
        this.resultStatus = resultStatus;
    }

    public Object getResultData() {
        return resultData;
    }

    public void setResultData( Object resultData ) {
        this.resultData = resultData;
    }

    public String toJsonString() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.writeValueAsString(this);
        } catch ( JsonProcessingException e ) {
            return null;
        }
    }

}
