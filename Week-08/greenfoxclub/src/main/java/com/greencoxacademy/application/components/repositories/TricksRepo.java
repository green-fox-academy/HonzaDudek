package com.greencoxacademy.application.components.repositories;

import com.greencoxacademy.application.models.Fox;
import com.greencoxacademy.application.models.Trick;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TricksRepo extends CrudRepository<Trick, Long> {

    List<Trick> findAllByFox(Fox fox);

    @Override
    List<Trick> findAll();

    Trick findTrickByTrick(String name);
}
