package com.greenfoxacademy.urlshortening.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Website {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    String url;
    String alias;
    int hitCount;
    int secretCode;

    public Website() {
    }

    public Website(String url, String alias) {
        this.url = url;
        this.alias = alias;
        this.secretCode = generateSecretCode();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public int getHitCount() {
        return hitCount;
    }

    public void setHitCount(int hitCount) {
        this.hitCount = hitCount;
    }

    public int generateSecretCode() {
        return (int)(Math.random()*(9999 - 1000)+1000);
    }
}
