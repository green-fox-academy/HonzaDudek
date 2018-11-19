package com.greenfoxacademy.frontend.Models;

public class Doubling {
    private Integer received;
    private Integer result;
    private String error;


    public Doubling() {
        this.error = "Please provide an input!";
    }

    public Doubling(int received) {
        this.received = received;
        this.result = received *2;
    }

    public Integer getReceived() {
        return received;
    }

    public void setReceived(Integer received) {
        this.received = received;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
