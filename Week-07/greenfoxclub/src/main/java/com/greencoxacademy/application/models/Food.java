package com.greencoxacademy.application.models;

import javax.persistence.*;

@Entity
public class Food {

    @Id
    @GeneratedValue
    private long id;
    private String food;

    @OneToOne
    @JoinColumn(name = "fox_id" )
    private Fox fox;

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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
