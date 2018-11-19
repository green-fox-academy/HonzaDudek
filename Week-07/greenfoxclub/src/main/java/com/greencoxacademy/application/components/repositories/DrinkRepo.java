package com.greencoxacademy.application.components.repositories;

import com.greencoxacademy.application.models.Drink;
import org.springframework.data.repository.CrudRepository;

public interface DrinkRepo extends CrudRepository<Drink, Long> {
}
