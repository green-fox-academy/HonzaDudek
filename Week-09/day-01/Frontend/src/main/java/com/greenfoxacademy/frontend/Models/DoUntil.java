package com.greenfoxacademy.frontend.Models;

public class DoUntil {
    int result;
    String action;

    public DoUntil() {
    }

    public DoUntil(int result, String action) {
        if (action != null) {
            if (action.equalsIgnoreCase("sum")) {
                this.result = 0;
                for (int i = 0; i <= result; i++) {
                    this.result += i;
                }
            } else if (action.equalsIgnoreCase("factor")) {
                this.result = 1;
                for (int i = 1; i <= result; i++) {
                    this.result *= i;
                }
            }
        }
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
