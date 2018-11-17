package com.greenfoxacademy.reddit.Repositories;

import com.greenfoxacademy.reddit.Models.Reddit;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RedditRepo extends CrudRepository<Reddit, Long> {

    @Override
    List<Reddit> findAll();
}
