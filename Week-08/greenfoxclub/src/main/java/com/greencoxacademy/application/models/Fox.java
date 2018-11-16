package com.greencoxacademy.application.models;

import jdk.vm.ci.meta.Local;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "fox")
public class Fox {

    @Id
    @GeneratedValue
    long id;
    private String name;
    private String food;

    private long foodAmmount = 100;
    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    private Date wasFed;

    private long drinkAmmount = 100;
    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    private Date hasDrank;

    private String drink;
    private boolean admin = false;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "User_id")
    private User user;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "food_id" )
    private Food foods;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "drink_id" )
    private Food drinks;

    @ManyToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE})
    @JoinTable(name = "fox_trick",
            joinColumns = @JoinColumn(name = "fox_id"),
            inverseJoinColumns = @JoinColumn(name = "trick_id"))
    private Set<Trick> tricks;

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
        long currentFood = this.getFoodAmmount();
        if (currentFood != 0) {
            long ate = (wasFed.getTime() - Timestamp.valueOf(LocalDateTime.now()).getTime()) / 100000 * 5;
            System.out.println(ate);
            this.setFoodAmmount(currentFood + ate);
        }
    }

    public void drinking() {
        long currentDrink = this.getDrinkAmmount();
        if (currentDrink != 0) {
            long drank = (wasFed.getTime() - Timestamp.valueOf(LocalDateTime.now()).getTime()) / 100000 * 5;
            System.out.println(drank);
            this.setDrinkAmmount(currentDrink + drank);
        }
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
        return this.getName().equalsIgnoreCase(((Fox) o).getName());
    }

    public long getFoodAmmount() {
        return foodAmmount;
    }

    public void setFoodAmmount(long foodAmmount) {
        this.foodAmmount = foodAmmount;
    }

    public long getDrinkAmmount() {
        return drinkAmmount;
    }

    public void setDrinkAmmount(long drinkAmmount) {
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


    public void addTrick(Trick trick) {
        this.tricks.add(trick);
    }

    public Food getFoods() {
        return foods;
    }

    public void setFoods(Food foods) {
        this.foods = foods;
    }

    public Food getDrinks() {
        return drinks;
    }

    public void setDrinks(Food drinks) {
        this.drinks = drinks;
    }

    public Set<Trick> getTricks() {
        return tricks;
    }

    public void setTricks(Set<Trick> tricks) {
        this.tricks = tricks;
    }
}
