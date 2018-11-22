package com.greenfoxacademy.urlshortening.Models;

public class IncomingSecretCode {

    Long secretCode;

    public IncomingSecretCode() {
    }

    public IncomingSecretCode(Long secretCode) {
        this.secretCode = secretCode;
    }

    public Long getSecretCode() {
        return secretCode;
    }

    public void setSecretCode(Long secretCode) {
        this.secretCode = secretCode;
    }
}
