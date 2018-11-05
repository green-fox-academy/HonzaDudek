package com.greenfoxacademy.springstart;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {
    static AtomicLong ID = new AtomicLong(0);
    AtomicLong id;
    String content;

    public Greeting(String content) {
        ID.getAndIncrement();
        this.id = ID;
        this.content = content;
    }

    public AtomicLong getId() {
        return ID;
    }

    public String getContent() {
        return content;
    }

    public void setId(AtomicLong id) {
        ID= id;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
