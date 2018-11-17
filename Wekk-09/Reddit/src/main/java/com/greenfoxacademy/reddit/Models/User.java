package com.greenfoxacademy.reddit.Models;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@SequenceGenerator(name="USER_SEQ", sequenceName="user_sequence")
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USER_SEQ")
    long id;

    private String username;
    private String password;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "reddit_id")
    private Set<Reddit> reddits;

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public String getIdString() {
        Long id = this.id;
        String idString = id.toString();
        return idString;
    }


    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Reddit> getReddits() {
        return reddits;
    }

    public void setReddits(Set<Reddit> reddits) {
        this.reddits = reddits;
    }
}
