package com.greenfoxacademy.reddit.Repositories;


import com.greenfoxacademy.reddit.Models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, Long> {

    User findByUsername(String username);

}
