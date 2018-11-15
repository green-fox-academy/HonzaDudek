package com.greencoxacademy.application.models;
import jdk.vm.ci.meta.Local;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "fox")
public class Fox {

    @Id
    @GeneratedValue
    long id;
    private String name;
    private String food;

    private int foodAmmount = 100;
    @Temporal(TemporalType.TIMESTAMP) @CreationTimestamp
    private Date wasFed;

    private int drinkAmmount = 100;
    @Temporal(TemporalType.TIMESTAMP) @CreationTimestamp
    private Date hasDrank ;

    private String drink;
    private boolean admin = false;

    @OneToOne
    @JoinColumn(name = "User_id")
    private User user;

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

    public void eating() {
        int currentFood = this.getFoodAmmount();
        int ate = wasFed.compareTo(Timestamp.valueOf(LocalDateTime.now())) * 5;
        System.out.println(ate);
        this.setFoodAmmount(currentFood + ate);
    }

    public void drinking() {
        int currentDrink = this.getDrinkAmmount();
        int drank = hasDrank.compareTo(Timestamp.valueOf(LocalDateTime.now())) * 5;
        System.out.println(drank);
        this.setDrinkAmmount(currentDrink + drank);
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

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public boolean equals(Object o) {
        return this.getName().equalsIgnoreCase(((Fox)o).getName());
    }

    public int getFoodAmmount() {
        return foodAmmount;
    }

    public void setFoodAmmount(int foodAmmount) {
        this.foodAmmount = foodAmmount;
    }

    public int getDrinkAmmount() {
        return drinkAmmount;
    }

    public void setDrinkAmmount(int drinkAmmount) {
        this.drinkAmmount = drinkAmmount;
    }

    public Date getWasFed() {
        return wasFed;
    }

    public void setWasFed(Date wasFed) {
        this.wasFed = wasFed;
    }

    public Date getHasDrank() {
        return hasDrank;
    }

    public void setHasDrank(Date hasDrank) {
        this.hasDrank = hasDrank;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


}
