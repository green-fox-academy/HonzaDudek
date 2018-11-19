package com.greenfoxacademy.frontend.Repositories;

import com.greenfoxacademy.frontend.Models.Log;
import org.springframework.data.repository.CrudRepository;

import java.util.HashMap;
import java.util.List;

public interface LogRepo extends CrudRepository<Log, Long> {

    @Override
    List<Log> findAll();
}
