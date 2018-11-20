package com.greenfoxacademy.guardians.Models;

public class Groot {

    String received;
    String translation;

    public Groot() {
    }

    public Groot(String received) {
        this.received = received;
        this.translation = "I am Groot!";
    }

    public String getReceived() {
        return received;
    }

    public void setReceived(String received) {
        this.received = received;
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }
}
