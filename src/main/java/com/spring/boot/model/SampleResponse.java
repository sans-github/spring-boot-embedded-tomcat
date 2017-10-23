package com.spring.boot.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SampleResponse {
    String time;
    SampleRequest sampleRequest;

    public SampleResponse(SampleRequest sampleRequest) {
        this.sampleRequest = sampleRequest;
        this.time = (new SimpleDateFormat("yyyy/MM/dd HH:mm:ss")).format(new Date());
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public SampleRequest getSampleRequest() {
        return sampleRequest;
    }

    public void setSampleRequest(SampleRequest sampleRequest) {
        this.sampleRequest = sampleRequest;
    }
}
