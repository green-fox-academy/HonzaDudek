package com.greenfoxacademy.application.repositories;

import com.greenfoxacademy.application.models.ToDo;
import org.springframework.data.repository.CrudRepository;

public interface ToDoRepo extends CrudRepository<ToDo, Long> {
}
