package com.greenfoxacademy.application.repositories;

import com.greenfoxacademy.application.models.ToDo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ToDoRepo extends CrudRepository<ToDo, Long> {

    @Query(value = "SELECT * FROM to_do WHERE urgent = true ",
            nativeQuery=true
    )
    public List<ToDo> findUrgent();

    @Query(value = "SELECT * FROM to_do WHERE done = true ",
            nativeQuery=true
    )
    public List<ToDo> findDone();

    @Query(value = "SELECT * FROM to_do WHERE done = true && urgent = true ",
            nativeQuery=true
    )
    public List<ToDo> findDoneAndUrgent();

    List<ToDo> findAllByOrderByIdAsc();
}
