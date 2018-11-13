package com.greenfoxacademy.application;


import com.greenfoxacademy.application.models.ToDo;
import com.greenfoxacademy.application.repositories.ToDoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App implements CommandLineRunner {

    @Autowired
    ToDoRepo repo;

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        repo.save(new ToDo("I have to learn object/relational mapping"));
    }
}
