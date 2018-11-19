package com.greencoxacademy.application.components.repositories;


import com.greencoxacademy.application.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, Long> {
}
