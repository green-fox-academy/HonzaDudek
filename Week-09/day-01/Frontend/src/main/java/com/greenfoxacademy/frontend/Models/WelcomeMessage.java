package com.greenfoxacademy.frontend.Models;

public class WelcomeMessage {

    String welcome_message;

    public WelcomeMessage(String name, String title) {
        this.welcome_message = "Oh, hi there " + name + ", my dear " + title + "!";
    }

    public WelcomeMessage(String onlyOne) {
        this.welcome_message = "You also have to provide " + onlyOne + "!";
    }

    public String getWelcome_message() {
        return welcome_message;
    }

    public void setWelcome_message(String welcome_message) {
        this.welcome_message = welcome_message;
    }
}
