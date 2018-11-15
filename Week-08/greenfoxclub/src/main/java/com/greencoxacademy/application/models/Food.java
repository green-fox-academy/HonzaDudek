package com.greencoxacademy.application.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Food {

    @Id
    @GeneratedValue
    private int id;
    private String food;

    public Food() {
    }

    public Food(String food) {
        this.food = food;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }
}
