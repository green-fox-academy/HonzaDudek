package com.greencoxacademy.application.components.repositories;

import com.greencoxacademy.application.models.Fox;
import org.springframework.data.repository.CrudRepository;

public interface FoxRepo extends CrudRepository<Fox, Long> {

    Fox findFoxByName(String name);

}
