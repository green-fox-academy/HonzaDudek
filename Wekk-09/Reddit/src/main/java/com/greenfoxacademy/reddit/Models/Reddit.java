package com.greenfoxacademy.reddit.Models;


import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
@SequenceGenerator(name="REDDIT_SEQ", sequenceName="reddit_sequence")
@Table(name = "reddits")
public class Reddit {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "REDDIT_SEQ")
    long id;
    private int votes;
    private String title;
    private String url;
    private String description;
    private LocalDateTime createdAt;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User creator;


    public Reddit() {
    }

    public Reddit(String title, User creator, String url, String description) {
        this.title = title;
        this.creator = creator;
        this.url = url;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getVotes() {
        return votes;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public User getCreator() {
        return creator;
    }

    public void setCreator(User creator) {
        this.creator = creator;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
