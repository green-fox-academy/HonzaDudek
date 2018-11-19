package com.greenfoxacademy.frontend.Models;

public class ArrayHandler {
    int result;
    String what;
    int[] numbers;
    String error = "error";

    public ArrayHandler() {
    }

    public ArrayHandler(int result, String what, int[] numbers) {
        this.result = result;
        this.what = what;
        this.numbers = numbers;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public String getWhat() {
        return what;
    }

    public void setWhat(String what) {
        this.what = what;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
