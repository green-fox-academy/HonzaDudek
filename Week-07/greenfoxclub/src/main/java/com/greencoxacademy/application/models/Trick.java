package com.greencoxacademy.application.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "trick")
public class Trick {

    @Id
    @GeneratedValue
    private long id;
    private String trick;

    @ManyToMany(mappedBy = "tricks")
    private Set<Fox> foxes = new HashSet<>();

    public Trick() {

    }

    public Set<Fox> getFoxes() {
        return foxes;
    }

    public void setFoxes(Set<Fox> foxes) {
        this.foxes = foxes;
    }

    public Trick(String trick) {
        this.trick = trick;
    }

    public String getTrick() {
        return trick;
    }

    public void setTrick(String trick) {
        this.trick = trick;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
