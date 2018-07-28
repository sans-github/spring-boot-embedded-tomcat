package com.spring.boot.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Response {
    private String time;
    private Request request;

    public Response(final Request request) {
        this.request = request;
        this.time = (new SimpleDateFormat("yyyy/MM/dd HH:mm:ss")).format(new Date());
    }

    public String getTime() {
        return time;
    }

    public void setTime(final String time) {
        this.time = time;
    }

    public Request getRequest() {
        return request;
    }

    public void setRequest(final Request request) {
        this.request = request;
    }
}
