package com.greencoxacademy.application.models;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Fox {

    @Id
    @GeneratedValue
    long id;
    private String name;
    private String food;
    private String drink;
    private boolean admin = false;


    public Fox() {
    }

    public Fox(long id, String name) {
        this.id = id;
        this.name = name;
        this.food = "pizza";
        this.drink = "water";
    }

    public Fox(String name) {
        this.name = name;
        this.food = "pizza";
        this.drink = "water";
    }

    public Fox(long id, String name, String food, String drink, List<String> listOfTricks) {
        this.id = id;
        this.name = name;
        this.food = food;
        this.drink = drink;
    }

    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }
/*
    public List<String> getListOfTricks() {
        return listOfTricks;
    }

    public void setListOfTricks(List<String> listOfTricks) {
        this.listOfTricks = listOfTricks;
    }

    public void addTrick(String trick) {
        this.listOfTricks.add(trick);
    }

    public String getTrick(String trick) {
        for (String learnedTrick: listOfTricks
             ) {
            if (learnedTrick.equalsIgnoreCase(trick)) {
                return learnedTrick;
            }
        }
        return null;
    }
*/

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    /*
    public String toString() {
        return this.name + "," + this.food + "," + this.drink + "," + this.listOfTricks.toString() + "," + this.admin;
    }
    */


    public boolean equals(Object o) {
        return this.getName().equalsIgnoreCase(((Fox)o).getName());
    }
}
