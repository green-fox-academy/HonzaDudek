package com.greencoxacademy.application.components.repositories;

import com.greencoxacademy.application.models.Fox;
import com.greencoxacademy.application.models.Trick;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Set;

public interface TricksRepo extends CrudRepository<Trick, Long> {

//    @Query(value = "SELECT fox_trick.fox_id, fox_trick.trick_id FROM foxclub.fox_trick")
    List<Trick> findAllByFoxes(Set<Fox> foxes);

    @Override
    List<Trick> findAll();

    Trick findTrickByTrick(String name);
}
