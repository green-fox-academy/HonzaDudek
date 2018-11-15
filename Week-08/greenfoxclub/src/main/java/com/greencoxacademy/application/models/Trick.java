package com.greencoxacademy.application.models;

import javax.persistence.*;

@Entity
public class Trick {

    @Id
    @GeneratedValue
    private long id;
    private String trick;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name="fox_id")
    Fox fox;

    public Trick() {

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
