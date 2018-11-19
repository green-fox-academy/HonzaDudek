package com.greencoxacademy.application.models;

import javax.persistence.*;

@Entity
public class Drink {

    @Id
    @GeneratedValue
    private long id;
    private String drink;

    @OneToOne
    @JoinColumn(name = "fox_id" )
    private Fox fox;

    public Drink() {
    }

    public Drink(String drink) {
        this.drink = drink;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

}
