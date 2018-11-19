package com.greenfoxacademy.frontend.Models;

public class ArrayHandler {
    Integer result;
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

    public int arraySum() {
        int result = 0;
        for (int i = 0; i < this.getNumbers().length ; i++) {
            result += this.getNumbers()[i];
            this.setResult(result);
        }
        return result;
    }

    public int arrayMultiply() {
        int result = 1;
        for (int i = 0; i < this.getNumbers().length ; i++) {
            result *= this.getNumbers()[i];
            this.setResult(result);
        }
        return result;
    }

    public int[] arrayDouble() {
        for (int i = 0; i < this.getNumbers().length; i++) {
            this.getNumbers()[i] *= 2;
        }
        return this.getNumbers();
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
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
