package com.greencoxacademy.application.components.repositories;

import com.greencoxacademy.application.models.Food;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FoodRepo extends CrudRepository<Food, Long> {

    @Override
    List<Food> findAll();
}
