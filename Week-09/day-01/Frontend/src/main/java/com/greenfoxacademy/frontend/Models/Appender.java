package com.greenfoxacademy.frontend.Models;

public class Appender {
    private String appended;

    public Appender() {
    }

    public Appender(String appended) {
        this.appended = appended + "a";
    }

    public String getAppended() {
        return appended;
    }

    public void setAppended(String appended) {
        this.appended = appended;
    }
}
