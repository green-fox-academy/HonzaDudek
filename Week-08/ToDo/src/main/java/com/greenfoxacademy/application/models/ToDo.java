package com.greenfoxacademy.application.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class ToDo {
    @Id
    @GeneratedValue
    long id;
    String title;
    boolean urgent = false;
    boolean done = false;
    LocalDateTime created;

    public ToDo() {
    }

    public ToDo(long id, String title, boolean urgent, boolean done) {
        this.id = id;
        this.title = title;
        this.urgent = urgent;
        this.done = done;
        this.created = LocalDateTime.now();
    }

    public ToDo(String title) {
        this.title = title;
        this.created = LocalDateTime.now();

    }

    public ToDo(String title, boolean urgent, boolean done) {
        this.title = title;
        this.urgent = urgent;
        this.done = done;
        this.created = LocalDateTime.now();

    }

    public ToDo(long id, String title, boolean done) {
        this.id = id;
        this.title = title;
        this.done = done;
        this.created = LocalDateTime.now();

    }

    public ToDo(long id, String title) {
        this.id = id;
        this.title = title;
        this.created = LocalDateTime.now();

    }

    public String getCreated() {
        return created.getDayOfMonth() + ". " +
                created.getMonth().getValue() + ". " +
                created.getYear() + " " +
                created.getHour() + ":" +
                created.getMinute() + ":" +
                created.getSecond();
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isUrgent() {
        return urgent;
    }

    public void setUrgent(boolean urgent) {
        this.urgent = urgent;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
