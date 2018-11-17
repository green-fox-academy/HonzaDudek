package com.greenfoxacademy.reddit.Models;


import javax.persistence.*;

@Entity
@SequenceGenerator(name="REDDIT_SEQ", sequenceName="reddit_sequence")
@Table(name = "reddits")
public class Reddit {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "REDDIT_SEQ")
    long id;
    private int votes;
    private String title;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User creator;

    public Reddit() {
    }

    public Reddit(int votes, String title, User creator) {
        this.votes = votes;
        this.title = title;
        this.creator = creator;
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
}
